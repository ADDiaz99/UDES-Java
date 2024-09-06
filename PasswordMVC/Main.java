package PasswordMVC;
/**
 * Generador de contraseñas aleatorias, utilizando todo tipo de caracteres.
 * @author Andres D. Diaz
 */
public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        
        controlador.iniciar();
    }
}
