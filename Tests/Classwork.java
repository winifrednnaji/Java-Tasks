public class Classwork{
//
//    public static void main(String[] args){
//    
//        
//    }
//    
    
    
    public static boolean evenArrayLengthCheck(int[] numbers){
        if(numbers.length % 2 == 0){
           
        }
        return true; 
    }
    
    
    public static boolean oddArrayLengthCheck(int[] numbers){
        if(numbers.length % 2 != 0){
           
        }
        return false;
    }
        
        
        
     public static int newArrayLengthCheck(int[] numbers){
        int newArrayLength = 0;
        
        if(numbers.length % 2 == 0){
            int[] sumArray = new int[numbers.length/2];
            newArrayLength = sumArray.length;
            }
  
            
         else{
            int[] sumArray = new int[(numbers.length/2) + 1];
            newArrayLength = sumArray.length;
         }  
         
         return newArrayLength;   
         
         }
            


     public static int[] ArrayManipulation(int numbers[]){
        int newSize = (numbers.length + 1) / 2;
        int[] sumArray = new int[newSize];

        int index = 0;
    
    
        for (int count = 0; count < numbers.length; count += 2) {
            if (count + 1 < numbers.length) {
                sumArray[index] = numbers[count] + numbers[count + 1];
        }   else {
                sumArray[index] = numbers[count]; 
        }
                index++;
    }

        return sumArray;
}



    public static int[] sumArray(int[] numbers) {
        int newSize = numbers.length - 1;
        int[] sumArray = new int[newSize];
        int index = 0;
    
    
        for (int count = 0; count < numbers.length - 1; count++) {
            sumArray[index] = numbers[count] + numbers[count + 1];
            index++; 
    }
    
        return sumArray;
}

    }
    
    
    
    
    
    
    
