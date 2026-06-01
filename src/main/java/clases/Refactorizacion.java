package clases;
public class Refactorizacion {

    private static int contador = 1;

    private int id;
    private Usuario usuario;
    private TipoRefactorizacion tipo;
    private String modulo;
    private String descripcion;
    private String comentario;

    public Refactorizacion(Usuario usuario,
                           TipoRefactorizacion tipo,
                           String modulo,
                           String descripcion,
                           String comentario) {

        if (usuario == null ||
            tipo == null ||
            modulo.isEmpty() ||
            descripcion.isEmpty()) {

            throw new IllegalArgumentException(
                    "Los campos obligatorios no pueden estar vacíos");
        }

        this.id = contador++;
        this.usuario = usuario;
        this.tipo = tipo;
        this.modulo = modulo;
        this.descripcion = descripcion;
        this.comentario = comentario;
    }

    public void registrar(HistorialRefactorizaciones historial) {
        historial.agregarRefactorizacion(this);
    }

    public String obtenerDetalles() {

        return "ID: " + id +
               "\nDesarrollador: " + usuario.getNombre() +
               "\nMódulo: " + modulo +
               "\nDescripción: " + descripcion +
               "\nComentario: " + comentario +
               "\nTipo: " + tipo.obtenerTipo();
    }

    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public TipoRefactorizacion getTipo() {
        return tipo;
    }

    public String getModulo() {
        return modulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return id + " - " +
               usuario.getNombre() + " - " +
               modulo + " - " +
               tipo.obtenerTipo();
    }
}