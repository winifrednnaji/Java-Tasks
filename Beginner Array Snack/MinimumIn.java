public class MinimumIn{
 public static void main(String[] args){

int [] ages = {12, 6, 9, 8, 6};
 
 
System.out.println(smallestNumber(ages));


    }
    
    public static int smallestNumber(int[] arrays){

    int smallest = arrays[0];


    for(int index = 0; index < arrays.length; index++){
        if (arrays[index] < smallest){
        smallest = arrays[index];}
        }

     return smallest;


    }



   
}
