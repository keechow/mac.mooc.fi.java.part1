/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keechow
 */
public class BoundedCounter {
    private int value = 0;
    private int upperLimit;
    
    public BoundedCounter(int inp){
        this.upperLimit = inp;
    }
    
    public void next(){
        this.value += 1;
        if (this.value > this.upperLimit){
            this.value = 0;
        }
    }
    
    public String toString(){
        String ret_string = "";
        if (this.value < 10){
            ret_string = ret_string + "0" + this.value;
            
        }
        else{
            ret_string += this.value;
        }
        return ret_string;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int inpValue){
        if (inpValue>0 && this.value + inpValue <= this.upperLimit){
            this.value += inpValue;
        }
    }
    
    
    
    
}
