
package clases;
/*Ivan el terrible*/
public class AnalisisEstatico {
    
    private int idAnalisis;
    private String advertencias; 
    private int duplicaciones;   

    public AnalisisEstatico(int idAnalisis, String advertencias, int duplicaciones) {
        this.idAnalisis = idAnalisis;
        this.advertencias = advertencias;
        this.duplicaciones = duplicaciones;
    }

    public int getIdAnalisis() {
        return idAnalisis;
    }
    public int getDuplicaciones() { 
        return duplicaciones;
    }

    public boolean ejecutarValidaciones() {//no se permiten duplicaciones
                return this.duplicaciones <= 2;
    }

    public void detectarDuplicaciones() {//verificamos si hay duplicaciones
        System.out.println("Análisis #" + idAnalisis + ": Se detectaron " + duplicaciones + " líneas/bloques duplicados.");
    }

    
    public void registrarAdvertencias() {//registramos las advertencias
        System.out.println("Advertencias registradas en Análisis #" + idAnalisis + ": " + advertencias);
    }
}
