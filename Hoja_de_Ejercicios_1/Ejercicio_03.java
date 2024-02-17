package Hoja_de_Ejercicios_1;
import java.util.Scanner;

/*
 * Ana desea conocer el valor que obtuvo de descuento por un bolso que ella compró, 
 * dado el precio final que ella pagó y el precio inicial.  Su tarea consiste en consiste en realizar 
 * una solución computacional algorítmica que permita obtener el descuento y mostrarselo a Ana
 */

public class Ejercicio_03 {
    public static void main(String[] args){
        Scanner bring = new Scanner(System.in);

        float precio_inicial = 0, precio_final = 0;
        float porcentaje;

        System.out.println("Cual fue el precio INICIAL del bolso?: ");
        precio_inicial = bring.nextFloat();
        System.out.println("Cual fue el precio FINAL del bolso?: ");
        precio_final = bring.nextFloat();

        if (precio_final > precio_inicial){
            float diferencia = precio_final - precio_inicial;
            porcentaje = (diferencia / precio_inicial) * 100;
            System.out.println("El producto tuvo un incremento de " + porcentaje + "%");
        }
        else if (precio_final == precio_inicial){
            System.out.println("No hubo descuento.");
        }
        else{
            float diferencia = precio_inicial - precio_final;
            porcentaje = (diferencia / precio_inicial) * 100;
            System.out.println("El producto tuvo un descuento de " + porcentaje + "%");
        }

        bring.close();

    }
}
