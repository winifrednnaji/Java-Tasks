public class ArrayKata{
 public static void main(String[] args){
 
 
    
    public static int countOfEvenNumbers(int[] arrays){

    int count = 0;


    for(int index = 0; index < arrays.length; index++){
        if (arrays[index] % 2 == 0){
          count ++;
         }
        }

     return count;


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


public static int largestNumber(int[] arrays){

    int largest = arrays[0];


    for(int index = 0; index < arrays.length; index++){
        if (arrays[index] > largest){
        largest = arrays[index];}
        }

     return largest;


    }


public static int smallestNumber(int[] arrays){

    int smallest = arrays[0];


    for(int index = 0; index < arrays.length; index++){
        if (arrays[index] < smallest){
        smallest = arrays[index];}
        }

     return smallest;


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


public static int[] squareOfArrays(int[] arrays){

    int[] result = new int[arrays.length];
    
    for(int index = 0; index < arrays.length; index++){
    
         int square = arrays[index] * arrays[index] ;
         result[index] = square;
        }

     return result;


    }
    
    
    public static int sumOfArrays(int[] arrays){

    int sum = 0;


    for(int index = 0; index < arrays.length; index++){
          sum += arrays[index];
        }

     return sum;


    }


public static int sumOfEvenNumbers(int[] arrays){

    int sum = 0;


    for(int index = 0; index < arrays.length; index++){
        if (arrays[index] % 2 == 0){
          sum += arrays[index];
         }
        }

     return sum;


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
