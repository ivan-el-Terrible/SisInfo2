import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import clases.Usuario;
import clases.TipoRefactorizacion;
import clases.Refactorizacion;
import clases.HistorialRefactorizaciones;
public class TestDeRefactorizacion {
   




    @Test
    public void deberiaRegistrarNombreDesarrollador() {

        Usuario usuario =
                new Usuario(1, "Joel");

        assertEquals(
                "Joel",
                usuario.getNombre()
        );
    }

    @Test
    public void deberiaRegistrarModulo() {

        Refactorizacion ref =
                new Refactorizacion(
                        new Usuario(1, "Joel"),
                        new TipoRefactorizacion(
                                1,
                                "Extraer metodo",
                                "Refactorizacion"
                        ),
                        "Login.java",
                        "Cambio realizado",
                        "Comentario"
                );

        assertEquals(
                "Login.java",
                ref.getModulo()
        );
    }

    @Test
    public void deberiaRegistrarDescripcion() {

        Refactorizacion ref =
                new Refactorizacion(
                        new Usuario(1, "Joel"),
                        new TipoRefactorizacion(
                                1,
                                "Extraer metodo",
                                "Refactorizacion"
                        ),
                        "Login.java",
                        "Extraccion de metodo",
                        "Comentario"
                );

        assertEquals(
                "Extraccion de metodo",
                ref.getDescripcion()
        );
    }

    @Test
    public void deberiaRegistrarTipoCambio() {

        Refactorizacion ref =
                new Refactorizacion(
                        new Usuario(1, "Joel"),
                        new TipoRefactorizacion(
                                1,
                                "Extraer metodo",
                                "Refactorizacion"
                        ),
                        "Login.java",
                        "Cambio realizado",
                        "Comentario"
                );

        assertEquals(
                "Extraer metodo",
                ref.getTipo().obtenerTipo()
        );
    }
     @Test
    public void deberiaGuardarRefactorizacionEnHistorial() {

        HistorialRefactorizaciones historial =
                new HistorialRefactorizaciones();

        Refactorizacion ref =
                new Refactorizacion(
                        new Usuario(1, "Joel"),
                        new TipoRefactorizacion(
                                1,
                                "Extraer metodo",
                                "Refactorizacion"
                        ),
                        "Login.java",
                        "Cambio realizado",
                        "Comentario"
                );

        historial.agregarRefactorizacion(ref);

        assertEquals(
                1,
                historial.getListaRefactorizaciones().size()
        );
    }

    @Test
    public void deberiaMostrarInformacionDelHistorial() {

        HistorialRefactorizaciones historial =
                new HistorialRefactorizaciones();

        Refactorizacion ref =
                new Refactorizacion(
                        new Usuario(1, "Joel"),
                        new TipoRefactorizacion(
                                1,
                                "Extraer metodo",
                                "Refactorizacion"
                        ),
                        "Login.java",
                        "Cambio realizado",
                        "Comentario"
                );

        historial.agregarRefactorizacion(ref);

        assertNotNull(
                historial.getListaRefactorizaciones()
        );
    }
}


