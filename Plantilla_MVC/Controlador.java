package Plantilla_MVC;

// Controlador 
import java.util.Scanner;

public class Controlador {
    private Modelo modelo;
    private Vista vista;
    public Controlador(Modelo modelo, Vista vista) {
    this.modelo = modelo;
    this.vista = vista;
    }
 
 
 public void iniciar() {
    boolean continuar=false;    // Para preguntar si queremos ejecutar de nuevo
    String cadena2= "";         // Aqui guardamos el request (y/n)        
    Scanner scanner = new Scanner(System.in);

    do{ 
    
        vista.solicitarEntrada();

        String cadena = scanner.nextLine(); // Solicitamos una cadena
        modelo.setCadena(cadena);           // Enviamos la cadena al Modelo

        vista.continuar();  // Preguntamos si quiere continuar
        cadena2=scanner.nextLine();
        
        continuar = cadena2.equalsIgnoreCase("Y"); // Si el usuario pone "y", seguimos
        }
    while(continuar);
    
    
    scanner.close();
    }
}