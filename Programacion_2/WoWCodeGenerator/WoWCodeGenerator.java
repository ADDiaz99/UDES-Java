package Programacion_2.WoWCodeGenerator;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author Andres D. Diaz
 */
public class WoWCodeGenerator {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String numsAndLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        //Generating the code in the following format: XXXX-XXXXX-XXXXX-XXXXX (4-5-5-5)
        
        // Requesting amount of codes to generate
        int amount = 0;
        boolean amount_isValid = false;
        while(!amount_isValid){
            try{
                System.out.println("How many codes would you like to generate?: (1-255)");
                amount = scanner.nextInt();
                amount_isValid = true;
            }catch(NumberFormatException e){
                System.out.println("ERROR: " + e);
            }
        }
        // Creating file function
        createFile();
        try {
            FileWriter myWriter = new FileWriter("code_storage.txt");
            // Writing the codes to the file
            for(int i = 1;i <= amount;i++){
                StringBuilder code = new StringBuilder();

                //First we generate the first 4
                for(int h = 0; h < 4; h++){
                    code.append(numsAndLetters.charAt(rand.nextInt(numsAndLetters.length())));
                }
                //Now the remaining 15, in 3 packs of 5
                for(int h = 0; h<3; h++){
                    code.append("-");
                    for(int j = 0; j < 5; j++){
                        code.append(numsAndLetters.charAt(rand.nextInt(numsAndLetters.length())));
                    }
                } 
                code.append("\n");
                // Code is ready now in variable "code"
                    
                System.out.println("Code generated:\n"+ code); 
                myWriter.write(code.toString());
            }
            
            myWriter.close();    
            System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                  System.out.println("An error occurred.");
                  e.printStackTrace();
              }
              
        scanner.close();      
    }
    
    public static void createFile(){
        try {
            File myObj = new File("code_storage.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}