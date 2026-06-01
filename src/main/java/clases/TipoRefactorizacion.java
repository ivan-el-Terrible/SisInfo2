package clases;
import java.util.ArrayList;
import java.util.List;

public class TipoRefactorizacion {

    private int id;
    private String nombre;
    private String descripcion;

    public TipoRefactorizacion(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String obtenerTipo() {
        return nombre;
    }

    public static List<String> obtenerTiposDisponibles() {

        List<String> tipos = new ArrayList<>();

        tipos.add(" Extraer metodo");
        tipos.add("renombrar metodo");
        tipos.add("mover metodo");
        tipos.add("extraer clase");

        return tipos;
    }
}