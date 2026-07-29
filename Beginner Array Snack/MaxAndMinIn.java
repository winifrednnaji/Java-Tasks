import java.util.Arrays;
public class MaxAndMinIn{
 public static void main(String[] args){

int [] ages = {12, 6, 9, 8, 6};
 
 
System.out.println(Arrays.toString(maxAndMinIn(ages)));


    }
    
    public static int[] maxAndMinIn(int[] arrays){

    int smallest = arrays[0];
    int largest = arrays[0];

    for(int index = 0; index < arrays.length; index++){
        if (arrays[index] < smallest){
        largest = arrays[index];}
        if (arrays[index] < largest){
        smallest = arrays[index];}
        }

        int[] maxAndMin = {largest, smallest};
     return maxAndMin;


    }



   
}

