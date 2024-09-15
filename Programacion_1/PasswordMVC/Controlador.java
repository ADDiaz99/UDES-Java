package PasswordMVC;

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
        vista.sayHello(); // Saludamos al usuario
        int size = vista.getPasswordSize();
        String passwordLista = modelo.crearPassword(size);
        vista.showPassword(passwordLista);
        
        vista.continuar();  // Preguntamos si quiere continuar
        cadena2=scanner.nextLine();
        continuar = cadena2.equalsIgnoreCase("Y"); // Si el usuario pone "y", seguimos
        }
        while(continuar);
        
        scanner.close();
    }
}


