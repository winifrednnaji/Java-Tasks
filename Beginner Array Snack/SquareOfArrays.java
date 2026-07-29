import java.util.Arrays;
public class SquareOfArrays{
 public static void main(String[] args){

int [] ages = {12, 6, 9, 8, 6};
 
 
System.out.println(Arrays.toString(squareOfArrays(ages)));


    }
    
    public static int[] squareOfArrays(int[] arrays){

    int[] result = new int[arrays.length];
    
    for(int index = 0; index < arrays.length; index++){
    
         int square = arrays[index] * arrays[index] ;
         result[index] = square;
        }

     return result;


    }



   
}
