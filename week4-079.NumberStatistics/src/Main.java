import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics myStats = new NumberStatistics();
        NumberStatistics evenNum = new NumberStatistics();
        NumberStatistics oddNum = new NumberStatistics();

        
        while(true){
            System.out.println("Type numbers: ");
            String user_inp = reader.nextLine();
            int user_int = Integer.parseInt(user_inp);
            
            if (user_int == -1){
                break;
            }
            
            else if (user_int % 2 == 0){
                evenNum.addNumber(user_int);
            }
            else{
                oddNum.addNumber(user_int);
            }
            myStats.addNumber(user_int);
            
        }

        System.out.println("sum: " + myStats.sum());
        System.out.println("sum of even: " + evenNum.sum());
        System.out.println("sum of odd: " + oddNum.sum());

    }
}

