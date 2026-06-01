
import clases.AnalisisEstatico;
import clases.CambioCodigo;
import clases.IntegracionCodigo;
import clases.PruebaAutomatizada;
import clases.RevisionCodigo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSistema {

    @Test
    public void testValidarCobertura() {

        PruebaAutomatizada prueba = new PruebaAutomatizada( 1, "PASSED", 85);
        assertTrue(prueba.validarCobertura());
    }

    @Test
    public void testAnalisisEstatico() {

        AnalisisEstatico analisis = new AnalisisEstatico(1, "Sin advertencias", 1);
        assertTrue( analisis.ejecutarValidaciones());
    }

    @Test
    public void testRevisionAprobada() {

        CambioCodigo cambio = new CambioCodigo(1, "v1", "Persona.java" );
        
        
        cambio.asociarResultadosPruebas( new PruebaAutomatizada(1, "PASSED", 85));
        
        cambio.asociarResultadosAnalisis(  new AnalisisEstatico( 1, "Sin advertencias", 1));

        RevisionCodigo revision = new RevisionCodigo(1, "Ivan", "Pedro", cambio);

        revision.aprobarAutor();
        revision.aprobarRevisor();
        assertTrue(
                revision.consultarResultadosPruebas());
    }

    @Test
    public void testCambioCodigo() {

        CambioCodigo cambio = new CambioCodigo(1, "v1", "Persona.java");

        PruebaAutomatizada prueba = new PruebaAutomatizada( 1, "PASSED", 85);
        cambio.asociarResultadosPruebas(prueba);
        assertEquals( 1, cambio.getPruebasAsociadas().size());
    }

    @Test
    public void testIntegracion() {

        CambioCodigo cambio = new CambioCodigo( 1, "v1", "Persona.java");

        cambio.asociarResultadosPruebas( new PruebaAutomatizada( 1, "PASSED", 85));

        cambio.asociarResultadosAnalisis(new AnalisisEstatico( 1, "Sin advertencias", 1));

        RevisionCodigo revision = new RevisionCodigo(1, "Ivan", "Pedro", cambio);

        revision.aprobarAutor();
        revision.aprobarRevisor();
        revision.consultarResultadosPruebas();

        IntegracionCodigo integracion = new IntegracionCodigo(1, "v1");
        assertTrue(integracion.IntegrarCambios( revision));
    }
}