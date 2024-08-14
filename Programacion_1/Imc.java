package Programacion_1;
import java.util.Scanner;
/*
 *  Se desea desarrollar un programa que calcule el índice de masa corporal de una persona. Para ello,
    se requiere definir el peso de la persona (en kilogramos) y su estatura (en metros). El índice de masa
    corporal (IMC) se calcula utilizando la siguiente fórmula:
    IMC = peso / estatura elevado al cuadrado
 */
public class Imc {
    public static void main(String args[]){
        Scanner bring = new Scanner(System.in);
        
        System.out.print("Inserte su peso en kilogramos: ");
        float peso = bring.nextFloat();
        System.out.print("Inserte su Estatura en metros: ");
        float estatura = bring.nextFloat();
        
        System.out.println("Su I.M.C es de: " + (peso / (Math.pow(estatura, 2))));
        bring.close();
    }
}
