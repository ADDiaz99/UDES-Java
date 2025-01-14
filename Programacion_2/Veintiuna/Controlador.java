package Programacion_2.Veintiuna;
import java.util.Random;
/**
 *
 * @author Andres D. Diaz - 2025
 */
public class Controlador {
    Random rand = new Random();
    private Modelo modelo;
    private Vista vista;
    
    public Controlador(Modelo modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void start(){
        
        boolean continuar = false;
        boolean gameOver = false;
        
        do{
            vista.sayHello(); // Saludamos al usuario
            modelo.setPlayer1_name(vista.askName(1));
            modelo.setPlayer2_name(vista.askName(2));
//            System.out.println("Jugador 1 nombre: " + modelo.getPlayer1_name());
//            System.out.println("Jugador 2 nombre: " + modelo.getPlayer2_name());
            while(!gameOver){
                modelo.setPlayer1_puntos(modelo.getPlayer1_puntos() + vista.tirarDados(1));
                modelo.setPlayer1_tries(modelo.getPlayer1_tries() + 1);
                
                modelo.setPlayer2_puntos(modelo.getPlayer2_puntos() + vista.tirarDados(2));
                modelo.setPlayer2_tries(modelo.getPlayer2_tries() + 1);
                
                System.out.println("Player 1 puntos: " + modelo.getPlayer1_puntos());
                System.out.println("Player 1 intentos: " + modelo.getPlayer1_tries());
                System.out.println("Player 2 puntos: " + modelo.getPlayer2_puntos());
                System.out.println("Player 2 intentos: " + modelo.getPlayer2_tries());
                
                // CONDICIONES PARA FINALIZACION DEL PROGRAMA
                if(modelo.getPlayer1_puntos() == 21){
                    // VICTORIA JUGADOR 1 POR LLEGAR A 21
                    vista.showVictory(1, modelo.getPlayer1_name());
                    gameOver = true;
                }
                if(modelo.getPlayer2_puntos() == 21){
                    // VICTORIA JUGADOR 2 POR LLEGAR A 21
                    vista.showVictory(2, modelo.getPlayer2_name());
                    gameOver = true;
                }
                if(modelo.getPlayer1_puntos() > 21){
                    // JUGADOR 1 SE PASA, GANA EL 2
                    vista.playerPassedLimit(1, modelo.getPlayer1_name());
                    vista.showVictoryByLimit(2, modelo.getPlayer2_name());
                    gameOver = true;
                }
                if(modelo.getPlayer2_puntos() > 21){
                    // JUGADOR 2 SE PASA, GANA EL 1
                    vista.playerPassedLimit(2, modelo.getPlayer2_name());
                    vista.showVictoryByLimit(1, modelo.getPlayer1_name());
                    gameOver = true;
                }
            }
            
            //Finalizacion del programa
            continuar = vista.keepGoing();
        }while(continuar);
        
        
    }
}