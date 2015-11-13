/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keechow
 */
//EXERCISE 77.1: CLASS SKELETON
//Start by adding the class LyyraCard to your project.
//
//Then implement the LyyraCard constructor that gets the starting balance of the card as parameter. 
// The card saves the balance in the object variable balance. Implement also the toString method that 
//returns a string of the form "The card has X euros".
//
//The skeleton of class LyyraCard looks like this:
//
//public class LyyraCard {
//    private double balance;
//
//    public LyyraCard(double balanceAtStart) {
//        // write code here
//    }
//
//    public String toString() {
//        // write code here
//    }
//}
//    
//The following main program can be used to test the program:
//
//public class Main {
//    public static void main(String[] args) {
//        LyyraCard card = new LyyraCard(50);
//        System.out.println(card);
//    }
//}
//    
//The output should be:
//
//The card has 50.0 euros
//Method payEconomical should decrease the balance by 2.50 euros and method payGourmet by 4.00 euros.    
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }
    
    public String toString(){
        String balance = Double.toString(this.balance);
        return "The card has "+ balance+ " euros";
    }
    
    public void payEconomical(){
        if (this.balance >= 2.50){
            this.balance -= 2.50;
        }
        
    } 
    
    public void payGourmet(){
        if (this.balance >= 4.00){
            this.balance -= 4.00;
        }
    }
    
    public void loadMoney(double amount){
        if (amount > 0) {
            this.balance += amount;
        }
        if (this.balance > 150){
            this.balance = 150.0;
        }
    }
    
}
