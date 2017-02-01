
package pe.edu.ulima.creditosulima;

import pe.com.equitel.Equitel;

public class EquitelAdapter implements CentralRiesgoAdapter{

    @Override
    public boolean validarEstadoCrediticio(String dni) {
        Equitel equitel = new Equitel();
        if (equitel.verificarSiExiste(dni)){
            return equitel.validarSiEsSujetoCredito().equals("SI");
        }else{
            return false;
        }
    }
    
}
