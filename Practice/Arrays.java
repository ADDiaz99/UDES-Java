package Practice;
//import java.util.Scanner;

/**
 *Create an array of integers and find the sum, average, 
 *maximum, and minimum values.
 */
public class Arrays {
    public static void main (String[] args){
        
        int numbers[] = {32, 24, -2, 6, 2, 100, 43, 3, 15, -12, 76, 8, 5, 65};
        
        // Loop to get the minimum number iterating through the array
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        
        // Loop to get the maximum number iterating through the array
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        
        // Loop to get the sum of all numbers in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        
        // To end the program, get the average using the sum we just got.
        double avg = (numbers.length > 0) ? (double) sum / numbers.length : 0;
        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
        
    }
}