import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondClassworkTest{
    
    @Test
    public void testThatTheEvenAndOddNumbersInTheArrayAreReturnedAsRequested(){

       int[] numbers = {3,5,2,8,1,5};
       int[] expected = {0,0,1,1,0,0}; 
       int[] actual = SecondClasswork.evenOddArrays(numbers);
       
       assertEquals(actual, expected);
 }
    
        } 
