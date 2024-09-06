package PasswordMVC;
import java.util.Scanner;

public class Vista {
    Scanner scanner = new Scanner(System.in);
    public void sayHello(){
        System.out.println("\n\nBienvenido al generador de contrasenas!\n\n");
    }
    public void showPassword(String password) {
        System.out.println("Tu contrasena es: " + password + "\n\nEspero que sea muy segura.\n");
    }
    public int getPasswordSize() {
        System.out.print("Digita que tan larga quieres la contrasena: ");
        return scanner.nextInt(); // Obtenemos el input del usuario
    }
    
    public void continuar(){
        System.out.println("Desea generar una nueva contrasena?: (y/n?) ");
    }
}
