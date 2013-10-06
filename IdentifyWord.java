import java.util.Scanner;

public class IdentifyWord {
   
   public static void main(String [] args){
   
      Scanner keyboard= new Scanner(System.in);
      
//FLORB first letter = last letter
      
      System.out.print ("Please enter a word to be analyzed: ");
      String userInput = keyboard.next();
      char firstChar = userInput.charAt(0);
      char lastChar = userInput.charAt(userInput.length()-1);
     
     
      boolean isFlorb = (firstChar == lastChar); 
      if (isFlorb)
      {
         System.out.print ("The word '" + userInput + "' is a florb");
      }
      else {}
               
//WOOBLE contains 'cj' or 'wq'
      boolean isWooble = (userInput.contains("cj") || userInput.contains("wq"));
      if (isWooble)
      {
          System.out.print ("The word '" + userInput + "' is a wooble");
      } 
      else {}
      
//ZITH odd # and no 'z' or even # and no 'k'

      boolean isEven = (userInput.length()%2==0);
      boolean containsZ = (userInput.contains("z"));
      boolean containsK = (userInput.contains("k"));

      boolean isZith = (!isEven && !containsZ || isEven && !containsK);
      if (isZith)
      {
         System.out.print ("The word '" + userInput + "' is a zith");
      }
      else {}
      
//ZARF last letter is uppercase

      String upperUserInput = (userInput.toUpperCase());
      char upperLastChar = upperUserInput.charAt(upperUserInput.length()-1);
      boolean isZarf = (upperLastChar == lastChar);
      if (isZarf)
      {
         System.out.print ("The word '" + userInput + "' is a zarf");
      }
      else {}
         
            
          
         
         
   }//end of main method
}//end of class IdentifyWord
      
      