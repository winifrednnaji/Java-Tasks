public class Classwork {
  public static void main(String[] args) {
            
            String word = "Happy";
            char letter = 'p';
            System.out.println(stringManipulation(word, letter));
        }
        

       public static int stringManipulation(String word, char letter){

            int index = 0;
            
            for (int count = 0; count < word.length(); count++) {
                   if (letter == word.charAt(count)) {
                        index++;
                 
                   }

            }
   
            return index;
      } 
