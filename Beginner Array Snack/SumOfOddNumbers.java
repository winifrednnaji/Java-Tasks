public class SumOfOddNumbers{
 public static void main(String[] args){

int [] ages = {12, 6, 9, 8, 6};
 
 
System.out.println(sumOfOddNumbers(ages));


    }
    
    public static int sumOfOddNumbers(int[] arrays){

    int sum = 0;


    for(int index = 0; index < arrays.length; index++){
        if (arrays[index] % 2 != 0){
          sum += arrays[index];
         }
        }

     return sum;


    }



   
}
