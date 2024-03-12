package Hoja_de_Ejercicios_1;
import java.util.Scanner;

/*Marbel tiene que figurar cuanto le cuesta un disco, ella nos da la cantidad en horas, pista vale 98$ cada 54 segundos, palco vale 55$ cada 28 segundos y sonido vale 23$ cada 16 segundos 
 *  ademas, el impuesto IVA es de 5%
 * Ella desea saber el valor bruto, y el valor con impuesto
*/
public class Primer_parcial {
    public static void main(String[] args){
        Scanner bring = new Scanner(System.in);
        // Variables de entrada
        double tmp_horas, tmp_segundos, pago_pista, pago_palco, pago_sonido, pago_bruto, impuesto, pago_total;
        System.out.println("Cuantas horas dura tu nuevo disco?: ");
        tmp_horas = bring.nextDouble();

        // Proceso
        tmp_segundos = tmp_horas * 3600;
        pago_pista = (tmp_segundos / 54) * 98; 
        pago_palco = (tmp_segundos / 28) * 55;
        pago_sonido = (tmp_segundos / 16) * 23;
        pago_bruto = pago_pista + pago_palco + pago_sonido;

        // Variables de Salida
        impuesto = pago_bruto * 0.05;
        pago_total = pago_bruto + impuesto;

        // Imprimir valores
        System.out.println("El costo de un disco de " + tmp_horas + " horas es de:");
        System.out.println("Costo Bruto: $" + pago_bruto + "\nIVA: $" + impuesto + "\nCosto Total: $" + pago_total);
        

        bring.close();
    }
}
