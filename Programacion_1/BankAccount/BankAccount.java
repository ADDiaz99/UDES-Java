package Programacion_1.BankAccount;
/**
 *  Bank Account System
 * @author Andres D. Diaz
 */
public class BankAccount {
    
    
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.start();
    }
}