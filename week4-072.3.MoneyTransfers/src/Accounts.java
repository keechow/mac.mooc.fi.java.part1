
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
//       Create the method public static void transfer(Account from, Account to, double howMuch) 
//        in the given program body. The method transfers money from one account to another. 
//                You do not need to check that the from account has enough balance.
//
//After completing the above, make sure that your main method does the following:
//
//Creates an account "A" with the balance of 100.0
//Creates an account "B" with the balance of 0.0
//Creates an account "C" with the balance of 0.0
//Transfers 50.0 from account A to account B
//Transfers 25.0 from account B to account C
        Account first = new Account("A", 100.0);
        Account second = new Account("B", 0.0);
        Account third = new Account("C", 0.0);
        
        transfer(first, second, 50.0);
        transfer(second, third, 25.0);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        
        
        
    }
    
    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }


}
