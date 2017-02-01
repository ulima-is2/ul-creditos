
package pe.edu.ulima.creditosulima;

public class ULimaValidador {
    private static ULimaValidador instancia = null;
    
    public static ULimaValidador getInstance(){
        if (instancia == null){
            instancia = new ULimaValidador();
        }
        return instancia;
    }
    
    private ULimaValidador(){}
    
    // Metodo que nos dice si se le realiza el prestamo a un alumno.
    // La funcionalidad de esta clase debe ser independiente de la central
    // de riesgo utilizada.
    public boolean esSujetoCredito(Alumno alumno, String tipoCentral){
        CentralRiesgoFactory factory = new CentralRiesgoFactory();
        CentralRiesgoAdapter cra = factory.obtenerAdapter(tipoCentral);
        
        return cra.validarEstadoCrediticio(alumno.getDni());
    }
}
