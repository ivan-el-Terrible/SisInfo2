
package clases;

/**
 *
 * @author Ivan el terrible
 */
import java.util.ArrayList;
import java.util.List;
public class CambioCodigo {
    
    private int idCambio;
    private String version;
    private String archivosModificados;
    
    
    private List<PruebaAutomatizada> pruebasAsociadas;
    private List<AnalisisEstatico> analisisAsociados;

    
    public CambioCodigo(int idCambio, String version, String archivosModificados) {
        this.idCambio = idCambio;
        this.version = version;
        this.archivosModificados = archivosModificados;
        this.pruebasAsociadas = new ArrayList<>();
        this.analisisAsociados = new ArrayList<>();
    }

    
    public List<PruebaAutomatizada> getPruebasAsociadas() {
        return pruebasAsociadas; 
    }
    public List<AnalisisEstatico> getAnalisisAsociados() {
        return analisisAsociados; 
    }
    public int getIdCambio() {
        return idCambio; 
    }

    
    public void asociarArchivos() {
        System.out.println("Archivos asociados al cambio " + idCambio + ": " + archivosModificados);
    }

    
    public void asociarResultadosPruebas(PruebaAutomatizada prueba) {
        this.pruebasAsociadas.add(prueba);
        System.out.println("Prueba ID " + prueba.getIdPrueba() + " vinculada al cambio " + idCambio);
    }

    
    public void asociarResultadosAnalisis(AnalisisEstatico analisis) {
        this.analisisAsociados.add(analisis);
        System.out.println("Análisis ID " + analisis.getIdAnalisis() + " vinculado al cambio " + idCambio);
    }
}

