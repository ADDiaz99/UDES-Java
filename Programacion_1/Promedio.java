package Programacion_1;
import java.util.Scanner;
/**
 *  
 */
public class Promedio {
    public static void main(String args[]){
        Scanner bring = new Scanner(System.in);
        float inversion;
        
        System.out.print("Digita tu inversion para calcular el 2% mensual: ");
        inversion = bring.nextFloat();
        
        System.out.println("Inversion hoy: " + inversion);
        
        for (int i = 1; i < 13; i++){
            inversion += (inversion * 0.02);
            System.out.println("Mes " + i + ": " + inversion);
        }
        bring.close();
    }
}