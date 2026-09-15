public class BankingProgram{
    
    public int balance = 0;
    
    
    public static int checkBalance(){
        return balance;    
    
    }
    
    
    public static void deposit(int deposited_amount){
        if(deposited_amount > 0){
            balance += deposited_amount;
        } 
    
    }
    
    
    public static void withdrawal(int withdrawn_amount){
        if(withdrawn_amount <= balance){
            balance -= withdrawn_amount;
        } 
    
    }    


    public static void setBalance(int balance){
        this.balance = balance;
    
    }
    
    
    
    }
}
