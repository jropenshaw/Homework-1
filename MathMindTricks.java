/*=============================================================================================================

Assignment #3: GeneratePasswords and MathMindTricks
Macayla Openshaw
Karin Blanford

CSc 127A
I. Kishi
2 October 2013 9:00 pm

The goal of the program 'MathMindTricks' is to take a seed given by the user and manipulate it so that the 
program seemingly takes a number 1-10 and then randomly produces mathematical magic. This program 
required a lot of calculations and manipulations in order to get the desired output.

There are no known problems with the code; the program runs without errors and produces the desired output.
The only issue is that WebGS doesn't like it very much! 

==============================================================================================================*/
import java.util.Scanner;
import java.util.Random;

public class MathMindTricks
{
  
   public static void main( String[] args )
   {
   
      
      Scanner keyboard = new Scanner ( System.in );
      
      //Enter a seed: 
         
      System.out.print ("Please enter a seed: ");
      long seed= keyboard.nextLong();
      System.out.println();
      
      //Create random generator with seed
      Random random = new Random();
      random.setSeed(seed);
            
      //Calculate first word (7)
      int firstRandom = random.nextInt(10) + 1;
     
      
      System.out.println("Generate a random number between 1 and 10: " + firstRandom);
         firstRandom = firstRandom * 9; 
      System.out.println("Multiply it by nine: " + firstRandom);
         int firstNumber = firstRandom / 10;
         int secondNumber = firstRandom % 10;
         int firstResult = firstNumber + secondNumber;
      System.out.println("Add the digits of the result together: " + firstResult);
         firstResult += 4;
      System.out.println("Add four to your result: " + firstResult);
      System.out.println();
      System.out.println("You should get 13!"); 
      System.out.println();
      
      
      //Second MathMindTrick
      int secondRandom = random.nextInt(999 - 100 + 1) + 100;
         System.out.println("Generate a random three digit number: " + secondRandom);
      secondRandom *= 80;      
         System.out.println("Multiply it by 80: " + secondRandom);
      secondRandom += 1; 
         System.out.println("Add one to the result: " + secondRandom);
      secondRandom *= 250;
         System.out.println("Multiply the result by 250: " + secondRandom);
     
     //Random 4 digit
      int thirdRandom = random.nextInt(9999 - 1000 + 1) + 1000;
         System.out.println("Generate a random four digit number: " + thirdRandom);
      secondRandom += thirdRandom;
         System.out.println("Add the four digit number to your result: " + secondRandom);
      secondRandom += thirdRandom;
         System.out.println("Add the four digit number to your result again: " + secondRandom);
      secondRandom -= 250;
         System.out.println("Subtract 250 from your result: " + secondRandom);
      secondRandom /= 2;
         System.out.println("Divide the result by two: " + secondRandom);
         System.out.println();
         System.out.println("Does that look familiar?");
         System.out.println();
         
         
      //Third trick
    
    
         System.out.println("Generate a random three digit number where the first digit and");
         System.out.println("   the last digit differ by at least 2:");
         System.out.println();
     
      int fourthRandom = random.nextInt(999 - 100 +1) + 100;
      int firstDigit = fourthRandom / 100;
      int lastDigit = fourthRandom % 10;

         System.out.println("Base three digit number: " + fourthRandom);
         System.out.println("First digit: " + firstDigit);
         firstDigit += 3;
         int newLastDigit = firstDigit % 10;
         System.out.println("Add three to the first digit: " + firstDigit);
         System.out.println("Current last digit: " + lastDigit);
         System.out.println("New last digit: " + newLastDigit);
         
         String intString = Integer.toString(fourthRandom);
         char tempChar = intString.charAt(0);
         String tempWord = String.valueOf(tempChar);
         tempChar = intString.charAt(1);
         tempWord += String.valueOf(tempChar);
         tempWord += String.valueOf(newLastDigit);
         int newNumber = Integer.parseInt(tempWord);
         
         System.out.println("New three digit number: " + newNumber);
         System.out.println();
      
      
      //Final Trick
      
      System.out.println("Now for the final trick:");
      int reverseNumber = (100)*(newNumber % 10) + ((newNumber - (newNumber % 10)) % 100) + (newNumber - (newNumber % 100)) / 100;
      System.out.println("New three digit number reversed: " + reverseNumber);
         int answer;
         if (newNumber >= reverseNumber) 
         {
            answer = (newNumber - reverseNumber);  
         }
         else
         {
            answer = (reverseNumber - newNumber);
         }
      System.out.println("Take the three digit number you built and the result of reversing");
      System.out.println("   it. Subtract the smaller of the two from the larger: " + answer);
      int secondReverse = (100)*(answer % 10) + ((answer - (answer % 10)) % 100) + (answer - (answer % 100)) / 100;
      System.out.println("Now reverse the result of that subtraction: " + secondReverse);
      int secondResult = secondReverse + answer;
      System.out.println("Now add the number you got from the subtraction to the number you");
      System.out.println("   just created: " + secondResult);
      System.out.println();
      System.out.println("Your number is: " + secondResult + "!");   

   
   
   
   
   }//end of main method
}//end of class MathMindTricks
