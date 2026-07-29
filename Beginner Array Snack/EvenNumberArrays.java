import java.util.Arrays;
public class EvenNumberArrays{
 public static void main(String[] args){

int [] ages = {12, 6, 9, 8, 6};
 
 
System.out.println(Arrays.toString(evenNumberArrays(ages)));


    }
    
    public static int[] evenNumberArrays(int[] arrays){

    int evenNumbers = 0;
    int[] result = new int[arrays.length];
    
    for(int index = 0; index < arrays.length; index++){
        if (arrays[index] % 2 == 0){
           evenNumbers = arrays[index];
           result[index] = evenNumbers;
         }

        }

     return result;


    }



   
}
