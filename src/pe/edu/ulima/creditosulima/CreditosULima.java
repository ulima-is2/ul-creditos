
package pe.edu.ulima.creditosulima;

public class CreditosULima {

    public static void main(String[] args) {
        // Debe instanciar un objeto de alumno y ver si es sujeto de credito
        // Para esto debe utilizar
        Alumno alumno = new Alumno("20132323", "43454543");
        ULimaValidador ulvalidador = new ULimaValidador();
        System.out.println("RES:" 
                + ulvalidador.esSujetoCredito(alumno, "cer"));
    }
    
}
