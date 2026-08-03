/*import java.util.Arrays;
public class DescendingOrder{
 public static void main(String[] args){

 
//int [] ages = {12, 6, 9, 8, 5};
int [] ages = {1, 2, 3, 4, 5};
 
 
System.out.println(Arrays.toString(OrderArrays(ages)));


    }
    
    public static int[] OrderArrays(int[] arrays){
    for (int count = 0; count < arrays.length - 1; count++){
        for(int counter = 0; counter < arrays.length - 1 - count; counter++){
            if (arrays[count] > arrays[counter]){
            int placeholder = arrays[counter];
            arrays[counter] = arrays[count];
            arrays[count] = placeholder;}
        }
    
    
    }
    
         

     return arrays;


    }


   
}

*/




import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
//        int[] ages = {1, 2, 3, 4, 5};
          int [] ages = {12, 6, 9, 8, 5, 7};
        System.out.println(Arrays.toString(OrderArrays(ages)));
    }

    public static int[] OrderArrays(int[] arrays) {
        for (int count = 0; count < arrays.length - 1; count++) {
            for (int counter = 0; counter < arrays.length - 1 - count; counter++) {
                
                if (arrays[counter] < arrays[counter + 1]) {
                    int placeholder = arrays[counter];
                    arrays[counter] = arrays[counter + 1];
                    arrays[counter + 1] = placeholder;
                }
            }
        }
        return arrays;
    }
}

