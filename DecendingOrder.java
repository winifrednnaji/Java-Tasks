import java.util.Arrays;
public class DecendingOrder{
 public static void main(String[] args){

 
int [] ages = {12, 6, 9, 8, 5};
 
 
System.out.println(Arrays.toString(OrderArrays(ages)));

    }
    
    public static int[] OrderArrays(int[] arrays){
    for (int count = 0; count < arrays.length; count++){
        for(int counter = 0, counter < arrays.length - count){
            if arrays(count) < arrays(counter){
            int placeholder = arrays(counter)
            arrays(counter) = arras(counter + 1)
            arrays(counter + 1) = placeholder}
        }
    
    
    }
    
         

     return arrays;


    }



   
}
