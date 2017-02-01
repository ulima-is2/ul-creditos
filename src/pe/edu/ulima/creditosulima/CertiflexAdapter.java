
package pe.edu.ulima.creditosulima;

import pe.com.certiflex.Validador;

public class CertiflexAdapter implements CentralRiesgoAdapter{

    @Override
    public boolean validarEstadoCrediticio(String dni) {
        Validador validador = new Validador();
        return validador.validar(dni);
    }
    
}
