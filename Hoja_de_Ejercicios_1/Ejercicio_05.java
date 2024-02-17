package Hoja_de_Ejercicios_1;
import java.util.Scanner;
/**
 *
 * Contador de Miles, Centenas, Decenas y unidades.
 * Su tarea consiste en darle una solución computacional algorítmica 
 * que dado un número el imprima las clases de Unidades respectivas.
 * 
 */
public class Ejercicio_05 {
    
    public static void main(String[] args){
        Scanner bring = new Scanner(System.in);
        
        long miles = 0, centenares = 0, decenas = 0, unidades = 0;
    
        System.out.println("Introduzca un numero: ");
        long valor = bring.nextLong();
    
        System.out.println("Tu numero es " + valor);
        
        while(valor > 0){
            if (valor >= 1000){
                miles += 1;
                valor -= 1000;
            }
            else if (valor >= 100){
                centenares += 1;
                valor -= 100;
            }
            else if (valor >= 10){
                decenas += 1;
                valor -= 10;
            }
            else{
                unidades += 1;
                valor -= 1;
            }
        }
        
        System.out.println("Miles: " + miles);
        System.out.println("Centenares: " + centenares);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);

        bring.close();  // gotta close the Scanner, else resources might leak
    }
}