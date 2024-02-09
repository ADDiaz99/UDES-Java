package Practice;

import java.util.Scanner;

public class Java_testing {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Input Scanner
        
        System.out.println("Insert first number: ");
        float number_1 = myObj.nextInt();
        
        System.out.println("Insert second number: ");
        float number_2 = myObj.nextInt();
        
        System.out.println("Choose what to do with the variables\n");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Substraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        int decision = myObj.nextInt();
        
        switch (decision)
        {
            case 1:
                System.out.println(number_1 + "+" + number_2);
                System.out.println("= " + (number_1 + number_2));
                break;
            case 2:
                System.out.println(number_1 + "-" + number_2);
                System.out.println("= " + (number_1 - number_2));
                break;
            case 3: 
                System.out.println(number_1 + "*" + number_2);
                System.out.println("= " + (number_1 * number_2));
                break;
            case 4:
                System.out.println(number_1 + "/" + number_2);
                System.out.println("= " + (number_1 / number_2));
                break;
            default:
                System.out.println("Not a valid input");
        }    
    }
}