package Hoja_de_Ejercicios_1;
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args){
        Scanner bring = new Scanner(System.in);
        float primer_corte, segundo_corte, tercer_corte;

        System.out.println("Digite su nota de primer corte:");
        primer_corte = bring.nextFloat();

        System.out.println("Digite su nota de segundo corte:");
        segundo_corte = bring.nextFloat();

        System.out.println("Digite su nota de tercer corte:");
        tercer_corte = bring.nextFloat();

        float nota_final = primer_corte * (float)0.3 + segundo_corte * (float)0.3 + tercer_corte * (float)0.4;
        System.out.println("Tu nota final es de: " + nota_final);

        bring.close();
    }
}
