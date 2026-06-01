
package clases;
/*Ivan el terrible*/
public class PruebaAutomatizada {
    
    private int idPrueba;
    private String resultado;
    private float cobertura; 

    public PruebaAutomatizada(int idPrueba, String resultado, float cobertura) {
        this.idPrueba = idPrueba;
        this.resultado = resultado;
        this.cobertura = cobertura;
    }

    public int getIdPrueba() { return idPrueba; }
    public String getResultado() { return resultado; }
    public float getCobertura() { return cobertura; }

    
    public void registrarResultados() {
        System.out.println("Test Automatizado #" + idPrueba + " - Resultado: " + resultado + " | Cobertura: " + cobertura + "%");
    }

    public boolean validarCobertura() {// minimo 80%
        return this.cobertura >= 80.0f;
    }

    
    public void reportarFallos() {// reporte de fallos
        if ("FAILED".equalsIgnoreCase(this.resultado)) {
            System.out.println("[ALERTA CRÍTICA] La prueba #" + idPrueba + " contiene errores en el código.");
        }
    }
}
