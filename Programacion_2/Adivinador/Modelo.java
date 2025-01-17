package Programacion_2.Adivinador;

public class Modelo {
    private int magicNumber;
    private int numberRange;
    private int userInput;
    private int tries;
    private int difficulty; // 1 - EASY. 2 - NORMAL. 3 - HARD
    private int score;
    
    //SETTERS / GETTERS
    public int get_magicNumber(){
        return magicNumber;
    }
    public void set_magicNumber(int n){
        this.magicNumber = n;
    }
    
    public int get_numberRange(){
        return numberRange;
    }
    public void set_numberRange(int n){
        this.numberRange = n;
    }
    
    public int get_userInput(){
        return userInput;
    }
    public void set_userInput(int n){
        this.userInput = n;
    }
    
    public int get_tries(){
        return tries;
    }
    public void set_tries(int n){
        this.tries = n;
    }
    
    public int get_difficulty(){
        return difficulty;
    }
    public void set_difficulty(int n){
        this.difficulty = n;
    }
    
    public int get_score(){
        return score;
    }
    public void set_score(int n){
        this.score = n;
    }
}
