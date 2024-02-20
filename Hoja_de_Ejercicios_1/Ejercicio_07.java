package Hoja_de_Ejercicios_1;
import java.util.Scanner;
/*
 * James Rodriguez  desea saber cuánto dinero debe cobrar a un patrocinador que le va a pagar por cada partido ganado 
 * y cada partido empatado en toda su trayectoria futbolística. El partido ganado le dará  US$30000 y el empatado US$10000.  
 * Eso sí, James desea que el dinero sea en pesos colombianos.  Su tarea consiste en darle una solución computacional 
 * algorítmica para James que le muestre el valor a cobrar en PESOS COLOMBIANOS .
 * 
 */
public class Ejercicio_07 {
    public static void main(String[] args){
        Scanner bring = new Scanner(System.in);

        double valor_partido_ganado = 30000;  
        double valor_partido_empatado = 10000;
        double valor_dolar_en_pesos = 3909.5;

        System.out.println("Cuantos partidos has ganado?: ");
        int cantidad_victorias = bring.nextInt();
        System.out.println("Cuantos partidos has empatado?: ");
        int cantidad_empates = bring.nextInt();

        double resultado_victorias = ((cantidad_victorias * valor_partido_ganado) * valor_dolar_en_pesos);
        double resultado_empates = ((cantidad_empates * valor_partido_empatado) * valor_dolar_en_pesos);

        
        System.out.println("Por tus partidos ganados cobraras " + String.format("%.2f", resultado_victorias));
        System.out.println("Por tus partidos empatados cobraras " + String.format("%.2f", resultado_empates));


        bring.close();
    }
}
