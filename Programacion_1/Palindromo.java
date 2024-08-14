package Programacion_1;
import java.util.Scanner;
/**
 *  Palindromo.java
 *  Check si una palabra es un palindromo.
 */
public class Palindromo {
    public static void main (String[] args){
        Scanner bring = new Scanner(System.in);
        System.out.print("Digite una palabra: ");
        String word = bring.next();
        
        
        // Usamos StringBuilder para invertir la cadena
        String palindrome = new StringBuilder(word).reverse().toString();
    
        if (word.equalsIgnoreCase(palindrome)){
            System.out.println(word + " y " + palindrome + " Son palindromos.");
        }
        else{
            System.out.println("No son palindromos.");
        }
        
        bring.close();
    }
}