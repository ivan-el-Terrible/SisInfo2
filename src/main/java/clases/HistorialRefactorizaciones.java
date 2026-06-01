package clases;



import java.util.ArrayList;
import java.util.List;

public class HistorialRefactorizaciones {

    private List<Refactorizacion> listaRefactorizaciones;

    public HistorialRefactorizaciones() {
        listaRefactorizaciones = new ArrayList<>();
    }

    public void agregarRefactorizacion(Refactorizacion refactorizacion) {
        listaRefactorizaciones.add(refactorizacion);
    }

    public Refactorizacion buscarRefactorizacion(int id) {

        for (Refactorizacion r : listaRefactorizaciones) {

            if (r.getId() == id) {
                return r;
            }
        }

        return null;
    }

    public void eliminarRefactorizacion(int id) {

        Refactorizacion ref = buscarRefactorizacion(id);

        if (ref != null) {
            listaRefactorizaciones.remove(ref);
        }
    }

    public void mostrarHistorial() {

        System.out.println("\n HISTORIAL DE REFACTORIZACIONES ");

        if (listaRefactorizaciones.isEmpty()) {
            System.out.println("No existen registros.");
            return;
        }

        for (Refactorizacion r : listaRefactorizaciones) {

            System.out.println(
                    r.getId() + " | " +
                    r.getUsuario().getNombre() + " | " +
                    r.getModulo() + " | " +
                    r.getTipo().obtenerTipo()
            );
        }
    }

    public List<Refactorizacion> getListaRefactorizaciones() {
        return listaRefactorizaciones;
    }

    public void actualizarTablaRegistros() {
        System.out.println("Tabla de registros actualizada.");
    }
}