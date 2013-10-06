/*=============================================================================================================

Assignment #3: GeneratePasswords and MathMindTricks
Macayla Openshaw
Karin Blanford

CSc 127A
I. Kishi
2 October 2013 9:00 pm

The goal of the program 'GeneratePassword' is to take a seed given by the user via scanner and use the
random generator to select words and numbers from a predetermined list based on the given seed. This 
required a lot of .next and finding specific characters to take from the strings. 

There are no known problems with the code; the program runs without errors and produces the desired output.
The only issue is that WebGS doesn't like it very much! 

==============================================================================================================*/
import java.util.Scanner;
import java.util.Random;

public class GeneratePassword
{
   public static void main( String[] args )
   {
      String words7 = "abalone bedouin citadel conjure dancers doodles flaming gnocchi glitter jargony lantern oranges ";
      String words4 = "ammo bawl chow clap dine dirt food frog hook inch into jest keys meme mesh mice onto once onyx ribs ride slam taxi thin ";
      
   
      Scanner keyboard = new Scanner ( System.in );
      
         //Enter a seed: 
         
         System.out.print ("Enter a seed: ");
         long seed= keyboard.nextLong();
         System.out.println();
      
         //Random Generations 
      
         int firstRandom, secondRandom, thirdRandom, fourthRandom, fifthRandom, sixthRandom;
        
         //Create random generator with seed
         Random random = new Random();
            random.setSeed(seed);
            
         //Calculate first word (7)
         firstRandom = random.nextInt(12) + 1;
            int firstCharacter = ((firstRandom * 8) - 8);
         String firstWord = words7.substring(firstCharacter, firstCharacter + 7);
         String password = firstWord;
            
         //First 7-letter word:
            System.out.println ("First 7-letter word: '" + password + "'");

         
         //Caclculate second number   
            secondRandom = random.nextInt(10);
            password += secondRandom;
            password += secondRandom;
            
         //With two digits:
            System.out.println ("With two digits: '" + password + "'");
            System.out.println();
         
         //Calculate third word (4)
            thirdRandom = random.nextInt(24) + 1;
            firstCharacter = ((thirdRandom * 5) - 5);
            String secondWord = words4.substring(firstCharacter, firstCharacter + 4);
            password += secondWord;
            
            //With the 4-letter word:
               System.out.println ("With the 4-letter word: '" + password + "'");
          
         //Calculate third number
            fourthRandom = random.nextInt(10);
            password += fourthRandom;
            password += fourthRandom;
               
               //With the two digits:
               System.out.println ("With the two digits: '" + password + "'");
               System.out.println();
         
         //Calculate reverse second word (4)  
            char tempChar = secondWord.charAt(3);
            String tempWord = String.valueOf(tempChar);
            tempChar = secondWord.charAt(2);
            tempWord += String.valueOf(tempChar);
            tempChar = secondWord.charAt(1);
            tempWord += String.valueOf(tempChar);
            tempChar = secondWord.charAt(0);
            tempWord += String.valueOf(tempChar);
            password += tempWord;
            
               //With the 4-letter word backwards:
               System.out.println ("With the 4-letter word backwards: '" + password + "'");
            
         //Calculate third number
            fifthRandom = random.nextInt(10);
            password += fifthRandom;
            password += fifthRandom;
            
               //With the two digits:
               System.out.println ("With the two digits: '" + password + "'");
               System.out.println();
            
            
         //Calculate fourth word (7)
            sixthRandom = random.nextInt(12) + 1;
               firstCharacter = ((sixthRandom * 8) - 8);
            String fourthWord = words7.substring(firstCharacter, firstCharacter + 7);
            password += fourthWord;
            
               //Final password:
               System.out.print ("Final password: '" + password + "'");



   } // end of method main
} // end of class GeneratePassword
