package Programacion_2.Veintiuna;

/**
 *
 * @author Andres D. Diaz - 2025
 */
public class Modelo {
    private String player1_name;
    private String player2_name;
    private int player1_puntos;
    private int player2_puntos;
    private int player1_tries;
    private int player2_tries;
    
    // NOMBRE PLAYER 1
    public String getPlayer1_name(){
        return player1_name;
    }
    public void setPlayer1_name(String player1_name){
        this.player1_name = player1_name;
    }
    
    // NOMBRE PLAYER 2
    public String getPlayer2_name(){
        return player2_name;
    }
    public void setPlayer2_name(String player2_name){
        this.player2_name = player2_name;
    }
    
    // PUNTOS PLAYER 1
    public int getPlayer1_puntos(){
        return player1_puntos;
    }
    public void setPlayer1_puntos(int player1_puntos){
        this.player1_puntos = player1_puntos;
    }
    
    // PUNTOS PLAYER 2
    public int getPlayer2_puntos(){
        return player2_puntos;
    }
    public void setPlayer2_puntos(int player2_puntos){
        this.player2_puntos = player2_puntos;
    }
    
    // INTENTOS PLAYER 1
    public int getPlayer1_tries(){
        return player1_tries;
    }
    public void setPlayer1_tries(int player1_tries){
        this.player1_tries = player1_tries;
    }
    
    // INTENTOS PLAYER 2
    public int getPlayer2_tries(){
        return player2_tries;
    }
    public void setPlayer2_tries(int player2_tries){
        this.player2_tries = player2_tries;
    }
     
}
