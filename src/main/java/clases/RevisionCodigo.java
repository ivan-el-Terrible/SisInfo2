
package clases;

/*Ivan el terrible*/
public class RevisionCodigo {
    
    private int idRevision;
    private String autor;
    private String revisor;
    private String estado; 
    private String comentarios;
    private CambioCodigo cambioAsociado;
    private boolean aprobadoAutor;
    private boolean aprobadoRevisor;

    public RevisionCodigo(int idRevision, String autor, String revisor, CambioCodigo cambioAsociado) {
        this.idRevision = idRevision;
        this.autor = autor;
        this.revisor = revisor;
        this.estado = "PENDIENTE";
        this.comentarios = "";
        this.cambioAsociado = cambioAsociado;
        aprobadoAutor = false;
        aprobadoRevisor = false;
    }

    public String getEstado() {//mostrar estado
        return estado; 
    }

    
    public void registrarRevision() {
        System.out.println("Iniciando Revisión #" + idRevision + ". Revisor: " + revisor + " auditando a: " + autor);
    }


    public boolean consultarResultadosPruebas() {
        boolean pruebasPasadas = true;
        boolean analisisPasado = true;

        // Validar cada suite de pruebas del cambio
        for (PruebaAutomatizada prueba : cambioAsociado.getPruebasAsociadas()) {
            if (!prueba.validarCobertura() || "FAILED".equalsIgnoreCase(prueba.getResultado())) {
                pruebasPasadas = false;
            }
        }

        // Validar cada análisis estático del cambio
        for (AnalisisEstatico analisis : cambioAsociado.getAnalisisAsociados()) {
            if (!analisis.ejecutarValidaciones()) {
                analisisPasado = false;
            }
        }
        
        boolean confir;
        if (pruebasPasadas && analisisPasado && aprobadoAutor && aprobadoRevisor) {
            this.estado = "APROBADO";
            this.registrarComentarios("El código cumple perfectamente con los criterios técnicos requeridos (Cobertura > 80% y baja duplicación).");
            confir =  true;
        } else {
            this.estado = "RECHAZADO";
            this.registrarComentarios("Rechazado automáticamente: No se cumplen los umbrales de cobertura o el nivel de duplicación de código.");
            confir = false;
        }
        return confir;
    }

   
    
    public void registrarComentarios(String nuevosComentarios) {
        this.comentarios = nuevosComentarios;
        System.out.println("Comentarios de la Revisión #" + idRevision + ": " + this.comentarios);
    }
    
    public void aprobarAutor(){
        aprobadoAutor = true;
    }

    public void aprobarRevisor(){
        aprobadoRevisor = true;
    }
    public boolean isAprobacionAutor() {
        return aprobadoAutor;
    }

    public boolean isAprobacionRevisor() {
        return aprobadoRevisor;
    }
}
