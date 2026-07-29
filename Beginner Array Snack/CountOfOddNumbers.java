public class CountOfOddNumbers{
 public static void main(String[] args){

int [] ages = {12, 6, 9, 8, 6};
 
 
System.out.println(countOfOddNumbers(ages));


    }
    
    public static int countOfOddNumbers(int[] arrays){

    int count = 0;


    for(int index = 0; index < arrays.length; index++){
        if (arrays[index] % 2 != 0){
          count ++;
         }
        }

     return count;


    }



   
}
