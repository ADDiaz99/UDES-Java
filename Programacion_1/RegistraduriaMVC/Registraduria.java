package RegistraduriaMVC;

/** Registraduria
 *
    Crear un programa en java para realizar el simulacro de votaciones, donde se debe permitir votar a N votantes
    capturados por teclado y se debe registrar N candidatos, con nombre y apellido, el programa debe permitir
    funcionar por votaciones y finalizar cuando se termine la cantidad de votantes o cuando se pulse el número
    111333. 
    * Author: Andres D. Diaz 24-09-24
 */
public class Registraduria {

    public static void main(String[] args) {
        
        Vista vista = new Vista();
        Modelo modelo = new Modelo(vista);
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
}
