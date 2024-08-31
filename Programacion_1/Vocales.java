package Programacion_1;
import java.util.Scanner;
/**
 *
 */
public class Vocales {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        Byte a_count = 0;
        Byte e_count = 0;
        Byte i_count = 0;
        Byte o_count = 0;
        Byte u_count = 0;
        
        String palabra;
        System.out.println("Digite palabra: ");
        palabra = scan.next();
        
        for (int i = palabra.length() -1; i >= 0 ;i--){
            switch(palabra.charAt(i)){
                case 'A':
                case 'a':
                    a_count++;
                    break;
                case 'E':
                case 'e':
                    e_count++;
                    break;
                case 'I':
                case 'i':
                    i_count++;
                    break;
                case 'O': 
                case 'o':
                    o_count++;
                    break;
                case 'U':
                case 'u':
                    u_count++;
                    break;
            }
        }
        
        System.out.println("A: " + a_count);
        System.out.println("E: " + e_count);
        System.out.println("I: " + i_count);
        System.out.println("O: " + o_count);
        System.out.println("U: " + u_count);
        
        scan.close();
    }
}