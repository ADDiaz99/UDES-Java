package Programacion_1.BankAccount;

import javax.swing.JOptionPane;

public class Vista {
    
    
    // Vista
    public void sayHello(){
        JOptionPane.showMessageDialog(null, "Welcome to you bank account.", "Bank Account System", 1);
    }
    public int deployMenu(){
        String[] options = {"Deposit", "Withdraw", "Check Balance", "Transfer Money", "Log Out"};
        int choice = JOptionPane.showOptionDialog(null, "What transaction would you like to do?.", "Transaction Menu", 0, 0, null, options, JOptionPane.QUESTION_MESSAGE);
        return choice;
    }
    
    public double requestDeposit(){
        String input = JOptionPane.showInputDialog(null, "Enter the amount you would like to deposit: ", "Deposit", JOptionPane.QUESTION_MESSAGE);
        double deposit = 0;
        try{
            deposit = Double.parseDouble(input);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter a valid number.\nERRORType: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return deposit;
    }
    
    public double requestWithdraw(){
        String input = JOptionPane.showInputDialog(null, "Enter the amount you would like to withdraw: ", "Withdraw", JOptionPane.QUESTION_MESSAGE);
        double withdraw = 0;
        try{
            withdraw = Double.parseDouble(input);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter a valid number.\nERRORType: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return withdraw;
    }
    
    public boolean askContinue(){
        int decision = JOptionPane.showConfirmDialog(null, "Would you like to continue with another account?", "Start Again", JOptionPane.YES_NO_OPTION);
        if(decision == 1){
            return false;
        }
        else{
            return true;
        }
    }  
}