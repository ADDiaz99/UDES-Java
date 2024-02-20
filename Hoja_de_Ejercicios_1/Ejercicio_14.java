package Hoja_de_Ejercicios_1;
import java.util.Scanner;
/*
 * Al profesor Àristoteles se le paga “X” pesos a la semana( trabajando 5 horas diarias y la semana laboral es de 6 días) 
 * por dictar sus clases .  Su tarea consiste en darle una solución computacional algorítmica al profesor para que el sepa 
 * cuánto dinero  deberá cobrar si trabaja “Y” cantidad de horas. 
 * 
 */
public class Ejercicio_14 {
    public static void main(String[] args){
        Scanner bring = new Scanner(System.in);

        System.out.println("Cuanto gana el profesor por semana?: ");
        float pesos_semana = bring.nextFloat();

        float ingresos_por_hora = pesos_semana / 30;
        System.out.println("De cuantas horas desea calcular el ingreso?: ");
        int horas = bring.nextInt();

        System.out.println("Debe cobrar $" + (horas * ingresos_por_hora) + " por " + horas + " horas de trabajo." );

        bring.close();
    }
}
