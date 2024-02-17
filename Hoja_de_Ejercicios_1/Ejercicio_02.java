package Hoja_de_Ejercicios_1;
import java.util.Scanner;

/*
 * Ana desea conocer cuánto dinero necesita llevar para ir a mercar, 
 * conociendo de antemano el siguiente listado que le dio el supermercado CUCUTABARATA:

Producto
Unidad
Valor Por Unidad

Papa
Kg
$2500

Yuca
Kg
$1200

Coliflor
Kg
$5260

Tomate
Kg
$4890

Cebolla
Kg
$4890


Ana es terca y ella el pedido lo hace en libras. Su tarea consiste en consiste en realizar una solución computacional algorítmica que permita y mostrarle a Ana:
Total del dinero que debe llevar para poder mercar
Cantidad por cada uno de los productos expresado en Kg.

 * 
 */
public class Ejercicio_02 {
    public static void main(String[] args){
        Scanner bring = new Scanner(System.in);

        // Valores en kilos
        float papa = 2500, yuca = 1200, coliflor = 5260, tomate = 4890, cebolla = 4890;
        // Dinero necesario
        float dinero = 0;
        // Cantidad de libras
        float papa_libras = 0, yuca_libras = 0, coliflor_libras = 0, tomate_libras = 0, cebolla_libras = 0;

        System.out.println("Cuantas libras de papa quieres llevar?: ");
        papa_libras = bring.nextFloat();
        System.out.println("Cuantas libras de yuca quieres llevar?: ");
        yuca_libras = bring.nextFloat();
        System.out.println("Cuantas libras de coliflor quieres llevar?: ");
        coliflor_libras = bring.nextFloat();
        System.out.println("Cuantas libras de tomate quieres llevar?: ");
        tomate_libras = bring.nextFloat();
        System.out.println("Cuantas libras de cebolla quieres llevar?: ");
        cebolla_libras = bring.nextFloat();

        dinero += (papa_libras / 2) * papa;
        dinero += (yuca_libras / 2) * yuca;
        dinero += (coliflor_libras / 2) * coliflor;
        dinero += (tomate_libras / 2) * tomate;
        dinero += (cebolla_libras / 2) * cebolla;

        System.out.println("Tienes que llevar $" + dinero + " para mercar.");

        bring.close();
    }
}
