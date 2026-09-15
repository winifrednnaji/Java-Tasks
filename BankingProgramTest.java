import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankingProgramTest{

    @Test
    public void testToCheckThatTheInitialBalanceIsZero(){
    
        int balance = 0;
        int expected = 0;
        int actual = BankingProgram.checkBalance();
        
        assertEquals(expected, actual);
        }
        
        
        
     @Test
    public void testToCheckTheBalanceAfterMakingADeposit(){
    
        int  deposited_amount = 200;
        int expected = 200;
        BankingProgram.deposit(deposited_amount);
        int actual = BankingProgram.checkBalance();
        
        assertEquals(expected, actual);
        }   
        
        
        
        
        
    @Test
    public void testToCheckThePossibilityOfDepositingANegativeAmount(){
        BankingProgram account = new BankingProgram();
        BankingProgram.balance = 0;
        int deposited_amount = -200;
        int expected = 0;
        BankingProgram.deposit(deposited_amount);
        int actual = BankingProgram.checkBalance();
        
        assertEquals(expected, actual);
        }  
        
        
    @Test
    public void testToCheckTheBalanceAfterMakingADeposiAndWithdrawal(){
        
        BankingProgram.setBalance(0);
        int deposited_amount = 1000;
        int withdrawn_amount = 500;
        int expected = 500;
        BankingProgram.deposit(deposited_amount);
        BankingProgram.withdrawal(withdrawn_amount);
        int actual = BankingProgram.checkBalance();
        
        assertEquals(expected, actual);
        }         
        
        
        }        
        
        
        
//        
//    @Test
//    public void testForTheSumOfTheArraysInTheArrayAgain(){
//        int[][] numbers = {{3,9},{2,8},{0,6}};
//        int[] expected = {12,10,6};
//        int[] actual = QuestionThree.sumTheArrays(numbers);
//        
//        assertArrayEquals(expected, actual);
//        }      
//        
//      
        
//    }


