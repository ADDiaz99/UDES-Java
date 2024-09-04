package Programacion_1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * Crear un juego de ahorcado donde la computadora selecciona una palabra al azar y el usuario debe adivinarla
letra por letra, en MVC.
• Modelo: Clase JuegoAhorcado que almacena la palabra secreta, las letras adivinadas y el estado del juego
(ganado, perdido).
• Vista: Interfaz gráfica o consola que muestra la palabra con guiones bajos para las letras no adivinadas, y
permite al usuario ingresar letras.
• Controlador: Recibe la letra ingresada por el usuario, verifica si está en la palabra secreta y actualiza el
estado del juego.

 */
public class Ahorcado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("\n\n\nBienvenido al Juego Ahorcado.");
        
        String[] palabra_s = {"udes", "piano", "control", "audifonos", "apartamento", "teclado"};
        int rand_n = rand.nextInt(6); // linea 22 y 23 van juntas, si agregamos mas palabras al array, aumentamos tambien el numero de aqui
        
        StringBuilder palabra_guion = new StringBuilder(); // Usamos StringBuilder para modificar la cadena mucho mejor
        Byte letras_adv = 0;
        Byte intentos = 5;
        char letra;
        
        for(int i = palabra_s[rand_n].length()-1; i >= 0; i--){
            palabra_guion.append('_');
        }

        while(letras_adv < palabra_s[rand_n].length()){
            
            if(intentos <= 0){
                System.out.println("\nPerdiste el juego!");
                break;
            }
            
            System.out.println("\nLetras adivinadas: " + letras_adv + "/" + palabra_s[rand_n].length() + "\t\tIntentos Restantes: " + intentos);
            System.out.println(palabra_guion);
            System.out.println("\nQue letra vas a intentar?: ");
            letra = scanner.next().toLowerCase().charAt(0); // Tomamos solo una letra, y la pasamos a minuscula por si la persona digita en mayus
            boolean acierto = false; // Para checar si pudo adivinar una letra despues de la palabra
            for(int i = 0; i <= palabra_guion.length() - 1; i++){
                if (palabra_s[rand_n].charAt(i) == letra){
                    palabra_guion.setCharAt(i, letra);
                    letras_adv++;
                    acierto = true;
                }
            }
            if(!acierto){ // Despues de revisar toda la palabra, si el acierto sigue en falso, se resta 1 intento 
                System.out.println("Esa letra no esta en la palabra! ");
                intentos--;
            }
        }
        if(letras_adv == palabra_s[rand_n].length()){
            System.out.println("Felicidades! Has adivinado la palabra: " + palabra_s[rand_n]);
        } else {
            System.out.println("Perdiste el juego. La palabra era: " + palabra_s[rand_n]);
        }

        scanner.close();
    }
}
