
package clases;

/*Ivan el terriblee*/
public class IntegracionCodigo {
    private int idIntegracion;
    private String versionIntegrada;
    
    public IntegracionCodigo(int id, String version){
        idIntegracion = id;
        versionIntegrada = version;
    }
    public boolean IntegrarCambios( RevisionCodigo revision) {
        boolean confir;
        if(revision.getEstado().equals("APROBADO")) {
            System.out.println("Integración realizada.");
            confir = true;
        } else {
            System.out.println(
                    "No puede integrarse porque está rechazado."
            );
            confir = false;
        }
        return confir;
    }
}
