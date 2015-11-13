/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keechow
 */
public class Multiplier {
    
//Implement the class Multiplier that has:
//
//a constructor public Multiplier(int number).
//a method public int multiply(int otherNumber) that returns otherNumber multiplied by number (i.e., the constructor parameter).
//Example of usage:
//
//Multiplier threeMultiplier = new Multiplier(3);
//System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));
//
//Multiplier fourMultiplier = new Multiplier(4);
//System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));
//
//System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
//System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
//    
//Output
//
//threeMultiplier.multiply(2): 6
//fourMultiplier.multiply(2): 8
//threeMultiplier.multiply(1): 3
//fourMultiplier.multiply(1): 4
    private int localNum;
    
    public Multiplier(int number){
        this.localNum = number;
    }
        
    public int multiply(int otherNum){
        return otherNum * this.localNum;
    }
}
