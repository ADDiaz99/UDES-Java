package Programacion_2.Wow_Chat_Simulator;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ADDiaz99 / 26-12-2024
 */
public class Wow_Chat_Simulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String chat_input = "";
        Byte wordcount = 0;
        String[] alliance_words = {"lordaerum","est", "tol", "aramis", "kul","retaum"};
        String[] horde_words = {"zug","mokra", "orgrim", "asrakh", "eko","makgora"};
        String chat_output = "";
        Boolean wordisValid = false;
        
        System.out.println("Welcome to the WoW chat language simulator\nEnter a phrase: ");
        while(!wordisValid){
            chat_input = scanner.nextLine();
            
            if(chat_input.isBlank() || chat_input.isEmpty()){
                System.out.println("Please Enter a valid phrase.");
                wordisValid = false;
            }
            else{
                wordisValid = true;
            }
        }
        
        
        for(int i = 0; i < chat_input.length(); i++){
            if(chat_input.charAt(i) == ' '){
                wordcount++;
            }
        }
        
        //System.out.println("la frase tiene " + (wordcount + 1) + " palabras");
        for(int i = 0; i < wordcount + 1; i++){
            chat_output += alliance_words[rand.nextInt(6)];
            chat_output += " ";
        }
        
        System.out.println(chat_output);
        
    }
}