package Practice;

import java.util.Scanner;
/**
 *
 * Write a program that takes an integer input and 
 * prints whether it's positive, negative, or zero.
 */
public class Integer_input {
    
    public static void main (String[] args){
        Scanner bring = new Scanner(System.in);
        
        System.out.println("This program checks if an integer is positive, negative or zero");
        System.out.println("Insert a number: ");
        int user_input = bring.nextInt();
        
        System.out.println("Checking...");
        
        if (user_input > 0){
            System.out.println(user_input + " is a positive number. ");
        }
        else if (user_input < 0){
            System.out.println(user_input + " is a negative number. ");
        }
        else{
            System.out.println("You entered Zero.");
        }
    }
}