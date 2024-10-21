package Programacion_1.BankAccount;

import javax.swing.JOptionPane;

public class Controlador {
    private Modelo modelo;
    private Vista vista;
    
    public Controlador(Modelo modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void start(){
        boolean keepgoing = false;
        //Saludar Usuario
        vista.sayHello();
        do{ 
            //Menu de Opciones
            boolean sigo = true;
            while(sigo){
                
                int choice = vista.deployMenu();
                switch(choice){
                    case 0: //Deposit
                        double deposit = vista.requestDeposit();
                        modelo.setBalance(modelo.getBalance() + deposit);
                        JOptionPane.showMessageDialog(null, "Deposit of $" + deposit +" made successfully.", "Successful Deposit", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1: //Withdraw
                        double withdraw = vista.requestWithdraw();
                        modelo.setBalance(modelo.getBalance() - withdraw);
                        JOptionPane.showMessageDialog(null, "Withdraw of $" + withdraw +" done successfully.", "Successful Withdraw", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2: //Check Balance
                        JOptionPane.showMessageDialog(null, "Your balance is: " + modelo.getBalance(), "Balance", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3: //Transfer
                    case 4: //Log out
                        JOptionPane.showMessageDialog(null, "Logging out of your account...", "Closing the Program", JOptionPane.PLAIN_MESSAGE);
                        sigo = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Not a valid choice.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }
            //Salir
            keepgoing = vista.askContinue();
        }while(keepgoing);
    }
    
}