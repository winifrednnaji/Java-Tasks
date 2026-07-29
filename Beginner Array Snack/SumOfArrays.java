public class SumOfArrays{
 public static void main(String[] args){

int [] ages = {12, 6, 9, 8, 6};
 
 
System.out.println(sumOfArrays(ages));


    }
    
    public static int sumOfArrays(int[] arrays){

    int sum = 0;


    for(int index = 0; index < arrays.length; index++){
          sum += arrays[index];
        }

     return sum;


    }



   
}
