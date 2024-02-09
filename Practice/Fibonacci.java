package Practice;
import java.util.Scanner;
/**
 *
 * Implement a program that prints the Fibonacci sequence up to a certain 
 * number of terms. You can use a loop for this.
 */
public class Fibonacci {
    
    public static void main (String[] args){
        Scanner bring = new Scanner (System.in);
        
        System.out.println("How many fibonacci terms do you want?: ");
        int fibonacci = bring.nextInt();
        int start = 0, second = 1, third;
        
        System.out.println(start + "\n" + second);
        
        for (int i = 0; i < fibonacci; i++){
            third = start + second;
            System.out.println(third);
            start = second;
            second = third;
        }
    }
}