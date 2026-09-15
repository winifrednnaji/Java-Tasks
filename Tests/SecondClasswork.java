import java.util.Arrays;
public class SecondClasswork{

    public static void main(String[] args){
        int[] numbers = {3,5,2,8,1,5};
        System.out.println(Arrays.toString(evenOddArrays(numbers)));
    }


    public static int[] evenOddArrays(int[] numbers){
        
        int[] result  = new int[numbers.length];
        int index = 0;
        
        for(int count = 0; count < numbers.length;count++){
            if(numbers[count] % 2 == 0){
                result[index] = 1;
                index++;
            }
            
            else{
                result[index] = 0;
                index++;
            }
        
        }
        
        return result;
    
    }

}

