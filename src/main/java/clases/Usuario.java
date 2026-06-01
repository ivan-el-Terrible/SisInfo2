package clases;
public class Usuario {

    private int id;
    private String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarCambio() {
        System.out.println("Cambio registrado por: " + nombre);
    }

    public void consultarHistorial(HistorialRefactorizaciones historial) {
        historial.mostrarHistorial();
    }
}