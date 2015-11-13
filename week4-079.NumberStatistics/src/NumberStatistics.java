
public class NumberStatistics {
    private int amountOfNum;
    private int totalOfNumbers;
    
    public NumberStatistics(){
        this.amountOfNum = 0;
        this.totalOfNumbers = 0;
    }
    
    public void addNumber(int number){
        this.amountOfNum += 1;
        this.totalOfNumbers += number;
        
    }
    
    public int amountOfNumbers(){
        return this.amountOfNum;
    }
    
    public int sum(){
        return this.totalOfNumbers;
    }
    
    public double average(){
        double sum = (double)this.totalOfNumbers;
        if (this.amountOfNum == 0){
            return 0.0;
        }
        else{
            return sum / this.amountOfNum;
        }
        
    }
}
