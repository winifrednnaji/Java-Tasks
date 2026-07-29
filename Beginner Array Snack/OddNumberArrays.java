import java.util.Arrays;
public class OddNumberArrays{
 public static void main(String[] args){

int [] ages = {12, 6, 9, 8, 6};
 
 
System.out.println(Arrays.toString(oddNumberArrays(ages)));


    }
    
    public static int[] oddNumberArrays(int[] arrays){

    int oddNumbers = 0;
    int[] result = new int[arrays.length];
    
    for(int index = 0; index < arrays.length; index++){
        if (arrays[index] % 2 != 0){
           oddNumbers = arrays[index];
           result[index] = oddNumbers;
         }

        }

     return result;


    }



   
}
