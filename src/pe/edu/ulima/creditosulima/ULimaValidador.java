
package pe.edu.ulima.creditosulima;

public class ULimaValidador {
    // Metodo que nos dice si se le realiza el prestamo a un alumno.
    // La funcionalidad de esta clase debe ser independiente de la central
    // de riesgo utilizada.
    public boolean esSujetoCredito(Alumno alumno, String tipoCentral){
        CentralRiesgoAdapter cra ;
        if (tipoCentral.equals("cer")){
            cra = new CertiflexAdapter();
        }else if (tipoCentral.equals("equi")){
            cra = new EquitelAdapter();
        }else{
            return false;
        }
        return cra.validarEstadoCrediticio(alumno.getDni());
    }
}
