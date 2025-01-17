package Programacion_2.Adivinador;
import javax.swing.JOptionPane;
/**
 *
 * @author Andres D. Diaz
 */
public class Vista {
    
    public boolean askContinue(){
        int decision = JOptionPane.showConfirmDialog(null, "Deseas Jugar de nuevo?", "Continuar", JOptionPane.YES_NO_OPTION);
        
        switch(decision){
            case -1:
            case 1:
                return false;
                
            default: return true;
        }
    }
    
    public void sayHello(){
        JOptionPane.showMessageDialog(null, "Bienvenido al adivinador!", "Adivinador", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Las reglas son:"
                + "\n1. Escoge un rango en el que el numero sera generado."
                + "\n2. Tienes un limite de intentos, cuidado con tu eleccion."
                + "\n3. Cuando adivines, te diremos si lo lograste, o si el numero objetivo es mayor o menor que el tuyo.",
                "Intro",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int selectDifficulty(){
        String[] options = {"Facil","Normal","Dificil"};
        int decision = JOptionPane.showOptionDialog(null,
                "Selecciona la dificultad: ",
                "Dificultad",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, 0);
        switch(decision){
            case -1:
                System.exit(0);
            default:
                return decision;
        }
    }
    
    public int askNumber(int range){
        boolean isValid = false;
        int n = 0;
        
        while(!isValid){
            String input = JOptionPane.showInputDialog(null, "Jugador, Digite un numero entre 1 y " 
                    + range + ": ", "Digite un numero", JOptionPane.QUESTION_MESSAGE);
            
            try{
                n = Integer.parseInt(input);
                isValid = true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: Digite un numero valido.\n\n\nERRORTYPE " + e, "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }
        return n;
    }
    
    public void showVictory(int tries, int magicNumber, int score){
        JOptionPane.showMessageDialog(null, "Felicidades!\n\nAdivinaste el numero correctamente."
                + "\nNumero Magico: " + magicNumber 
                + "\nIntentos Restantes: " + tries
                + "\nPuntaje: " + score,
                "Victoria!",
                JOptionPane.PLAIN_MESSAGE);
    }
    
    public void showDefeat(int magicNumber){
        JOptionPane.showMessageDialog(null, "Se han acabado los intentos!"
                + "\n\nEl Numero Magico era: " + magicNumber
                + "\n\nIntentalo de nuevo, no te rindas.",
                "Derrota!",
                JOptionPane.ERROR_MESSAGE);
    }
    
    public void biggerThan(int tries, int userInput){
        JOptionPane.showMessageDialog(null, "Intentos Restantes:  " + tries + 
                "\n\nEl numero " + userInput + " es mayor que el objetivo, ve mas abajo.",
                "Adivinador", JOptionPane.WARNING_MESSAGE);
    }
    public void smallerThan(int tries, int userInput){
        JOptionPane.showMessageDialog(null, "Intentos Restantes:  " + tries + 
                "\n\nEl numero " + userInput + " es menor que el objetivo, sube.",
                "Adivinador", JOptionPane.WARNING_MESSAGE);
    }
}