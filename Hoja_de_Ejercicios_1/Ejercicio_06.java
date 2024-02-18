package Hoja_de_Ejercicios_1;
import java.util.Scanner;
/*
 * El profesor Picachu desea conocer el puntaje que un estudiante obtuvo a partir de soluciones correctas, incorrectas y en blanco.  
 * El profesor conoce que el valor total de la prueba es de 100 puntos. El profesor para realizar su cálculo se basa de las siguientes premisas:
Cada respuesta incorrecta quita una respuesta buena
Dos preguntas en blanco quitan una respuesta buena. 
El total de preguntas es igual a la cantidad de respuestas correctas más incorrectas más en blanco.  
Su tarea consiste en darle una solución computacional algorítmica al profesor para obtener el valor que obtuvo un estudiante al presentar la prueba.
 */
public class Ejercicio_06 {
    public static void main(String[] args){
        Scanner bring = new Scanner(System.in);

        int valor_prueba = 100;

        System.out.println("Cuantas preguntas incorrectas tiene?: ");
        int incorrecta = bring.nextInt();

        System.out.println("Cuantas preguntas en blanco tiene?: ");
        int blanco = bring.nextInt();

        System.out.println("La nota del estudiante es de: " + ((valor_prueba - incorrecta) - (blanco / 2)));

        bring.close();
    }
}
