import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassworkTest{
    
    @Test
    public void testThatTheLengthOfTheArrayIsAnEvenNumber(){

       int[] numbers = {1,2,3,4,5,6};
       boolean expected = true; 
       boolean actual = Classwork.evenArrayLengthCheck(numbers);
       
       assertEquals(actual, expected);
 
    
        } 


    @Test
    public void testThatTheLengthOfTheArrayIsAnOddNumber(){

       int[] numbers = {1,2,3,4,5,6,7};
       boolean expected = false; 
       boolean actual = Classwork.oddArrayLengthCheck(numbers);
       
       assertEquals(actual, expected);
 
    
        } 
        
        
    @Test
    public void testThatTheLengthOfTheNewArrayIsHalfThatOfTheInitialArrayPLusOneWhenTheLenghtIsAnOddNumber(){

       int[] numbers = {1,2,3,4,5,6,7};
       int expected = 4; 
       int actual = Classwork.newArrayLengthCheck(numbers);
       
       assertEquals(actual, expected);
 
    
        }     
        
        
        
      @Test
    public void testThatTheLengthOfTheNewArrayIsHalfThatOfTheInitialArrayWhenTheLenghtIsAnEvenNumber(){

       int[] numbers = {1,2,3,4,5,6};
       int expected = 3; 
       int actual = Classwork.newArrayLengthCheck(numbers);
       
       assertEquals(actual, expected);
 
    
        }     
     


   @Test
    public void testThatTheNumbersInTheEvenNumberArrayAreSummedUp(){

       int[] numbers = {1,2,3,4,5,6};
       int[] expected = {3, 7, 11};
       int[] actual = Classwork.ArrayManipulation(numbers);
       
       assertArrayEquals(actual, expected);
 
    
        } 
        
        
        
     @Test
    public void testThatTheNUmbersInTheOddNumberArrayAreSummedUp(){

       int[] numbers = {1,2,3,4,5,6,7};
       int[] expected = {3, 7, 11, 7};
       int[] actual = Classwork.ArrayManipulation(numbers);
       
       assertArrayEquals(actual, expected);
 
    
        }   
        
     @Test
    public void testThatTheNUmbersInTheOddNumberArrayAreSummedUp2(){

       int[] numbers = {0,9,8,7,6,5,5};
       int[] expected = {9,15,11,5};
       int[] actual = Classwork.ArrayManipulation(numbers);
       
       assertArrayEquals(actual, expected);
 
    
        }    
        
        
        
    @Test
    public void testForTheSumOfTheNumbersInTheArray(){

       int[] numbers = {1,2,3,4,5,6};
       int[] expected = {3,5,7,9,11};
       int[] actual = Classwork.sumArray(numbers);
       
       assertArrayEquals(actual, expected);
 
    
        }     
        
        
        
    @Test
    public void testForTheSumOfTheNumbersInTheArrayAgain(){

       int[] numbers = {1,2,3,4};
       int[] expected = {3,5,7};
       int[] actual = Classwork.sumArray(numbers);
       
       assertArrayEquals(actual, expected);
 
    
        }        
  
  
    
    }
