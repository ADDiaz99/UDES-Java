package Programacion_2.Veintiuna;
import javax.swing.JOptionPane;
import java.util.Random;

public class Vista {
    Random rand = new Random();
    public void sayHello(){
        JOptionPane.showMessageDialog(null, "Bienvenido a la 21!", "21", JOptionPane.INFORMATION_MESSAGE);
    }
    public boolean keepGoing(){
        int decision = JOptionPane.showConfirmDialog(null, "Desea jugar de nuevo?", "Continuar", JOptionPane.YES_NO_OPTION);
        switch(decision){
            case 1:
            case -1:
                return false;
            default:
                return true;
        }
    }
    
    public String askName(int playerindex){
        boolean isValid = false;
        String name = "";
        while(!isValid){
            name = JOptionPane.showInputDialog(null, "Jugador " + playerindex + ", Cual es tu nombre?",
                    "Nombre Jugador " + playerindex,
                    JOptionPane.QUESTION_MESSAGE);
            if (name.isBlank() || name.isEmpty()){
                isValid = false;
            }
            else{
                isValid = true;
            }
        }
        return name;
    }
    
    public int tirarDados(int playerindex){
        String[] options = {"Tirar Dados", "Pasar"};
        int resultado = 0;
        int eleccion = JOptionPane.showOptionDialog(null, "Jugador " + playerindex + ", Desea tirar o pasar?", "Turno: " + playerindex, 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, 0);
        switch(eleccion){
            case -1:
                System.exit(0);
                break;
            case 0:
                resultado = rand.nextInt(6) + 1;
                System.out.println("Jugador " + playerindex + " obtiene " + resultado + " puntos");
                JOptionPane.showMessageDialog(null, "\nEl dado cae en " + resultado + "!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                resultado = 0;
                System.out.println("Jugador " + playerindex + " pasa.");
                break;
        }
        
        return resultado;
    }
    
    public void showVictory(int playerindex, String playername){
        JOptionPane.showMessageDialog(null, "Felicidades Jugador " + playerindex + ": " + playername
                + "\n\nHa ganado la partida por llegar a 21!", playername + " gana la partida!",
                JOptionPane.PLAIN_MESSAGE);
    }
    public void playerPassedLimit(int playerindex, String playername){
        JOptionPane.showMessageDialog(null, "Mala Suerte Jugador " + playerindex + "\nTe pasaste de 21."
                , "Pierde " + playername
                , JOptionPane.WARNING_MESSAGE);
    }
    public void showVictoryByLimit(int playerindex, String playername){
        JOptionPane.showMessageDialog(null, "Felicidades Jugador " + playerindex + ": " + playername
                + "\n\nHa ganado la partida porque el otro jugador se pasó del limite!", playername + " gana la partida!",
                JOptionPane.PLAIN_MESSAGE);
    }
}