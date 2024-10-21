package Programacion_1.BankAccount;

/**
 *
 * Base de datos
 */
public class Modelo {
    private double balance;
    private String id;
    
    public Modelo(){
        this.balance = 0;
        this.id = "";
    }
    
    // Getters and Setters
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
}