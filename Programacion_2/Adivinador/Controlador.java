package Programacion_2.Adivinador;
import java.util.Random;
/**
 *
 * @author Andres D. Diaz
 */
public class Controlador {
    private Modelo modelo;
    private Vista vista;
    Random rand = new Random();
    public Controlador(Modelo modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void start(){
        boolean isOver = false;
        
        do{
            vista.sayHello();                                // Saludamos
            modelo.set_difficulty(vista.selectDifficulty()); // Pedimos la dificultad
            
            //traemos la dificultad para cambiar los intentos y el rango
            switch(modelo.get_difficulty()){                
                case 0: //  EASY
                    modelo.set_numberRange(20);
                    modelo.set_tries(10);
                    System.out.println("Dificultad FACIL seleccionada\nrango: " + modelo.get_numberRange() + "\nintentos: " + modelo.get_tries());
                    break;
                case 1: //  NORMAL
                    modelo.set_numberRange(50);
                    modelo.set_tries(15);
                    System.out.println("Dificultad NORMAL seleccionada\nrango: " + modelo.get_numberRange() + "\nintentos: " + modelo.get_tries());
                    break;
                case 2: //  HARD
                    modelo.set_numberRange(100);
                    modelo.set_tries(20);
                    System.out.println("Dificultad DIFICIL seleccionada\nrango: " + modelo.get_numberRange() + "\nintentos: " + modelo.get_tries());
                    break;
                default:
                    System.out.println("ERROR with difficulty selection, None selected.");
                    System.exit(0);
            }
            
            // Con la dificultad seleccionada, viene ahora si el bucle de juego
            boolean numberGuessed = false;
            //Generamos el numero a encontrar
            modelo.set_magicNumber(rand.nextInt(modelo.get_numberRange()) + 1);
            System.out.println("magic number generated: " + modelo.get_magicNumber());
            while(!numberGuessed){
                
                // Solicita al jugador un numero:
                modelo.set_userInput(vista.askNumber(modelo.get_numberRange()));
                System.out.println("userinput: " + modelo.get_userInput());
                
                // Si el numero y el objetivo son iguales, Jugador GANA.
                if(modelo.get_userInput() == modelo.get_magicNumber()){
                    //Calculamos puntaje
                    modelo.set_score((modelo.get_tries() * 1000) + 2500 * modelo.get_difficulty());
                    System.out.println("score added to player: " + modelo.get_score());
                    //Mostramos victoria con cantidad de intentos restantes y puntaje
                    vista.showVictory(modelo.get_tries(), modelo.get_magicNumber(), modelo.get_score());
                    numberGuessed = true;
                }
                
                // Si el numero del usuario es MAYOR QUE el objetivo
                else if(modelo.get_userInput() > modelo.get_magicNumber()){
                    modelo.set_tries(modelo.get_tries() - 1);
                    vista.biggerThan(modelo.get_tries(), modelo.get_userInput());
                }
                else{
                    // Si el numero del usuario es MENOR QUE el objetivo
                    modelo.set_tries(modelo.get_tries() - 1);
                    vista.smallerThan(modelo.get_tries(), modelo.get_userInput());
                }
                // Si se le acaban los intentos, el jugador pierde.
                if(modelo.get_tries() <= 0){
                    vista.showDefeat(modelo.get_magicNumber());
                    numberGuessed = true;
                }
            }
            
            // FIN del Juego, preguntamos si quiere volver a jugar.
            isOver = vista.askContinue();
        }while(isOver);
    }
    
}