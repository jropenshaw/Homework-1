/*============================================================================

Assignment #2 Height, Mileage, and Password
Macayla Openshaw
Karin Blanford

CSc 127A
I. Kishi
25 September 2013 at 9:00 pm

Goal: the goal of this program is to take several numbers, integers, and
a symbol given by the user and manipulate those inputs using substrings. 
The desired output is one password generated based on what the user has
given.
 
Deficiencies: there are no known deficiencies. The program runs without
error on my machine.


============================================================================*/

import java.util.Scanner;

public class Password {
   public static void main (String [] args) {
   

//Scanner   

      Scanner keyboard = new Scanner ( System.in );
      
//Welcome

      System.out.println ("Welcome to the Password Generation Program!");
      System.out.println ();


//Words (4)  
      System.out.println ("Please enter the first word to use: "); 
      String firstWord = keyboard.next();
      
      System.out.println ("Please enter the second word to use: ");
      String secondWord = keyboard.next();
      
      System.out.println ("Please enter the third word to use: ");
      String thirdWord = keyboard.next();
      
      System.out.println ("Please enter the fourth word to use: ");
      String fourthWord = keyboard.next();
//Numbers (2)   
      System.out.println ("Please enter the first number to use: ");
      int firstNumber = keyboard.nextInt();
      
      System.out.println ("Please enter the second number to use: ");
      int secondNumber = keyboard.nextInt();
//Symbol (1)    
      System.out.println ("Please enter the symbol to use: ");
      String firstSymbol = keyboard.next();
      

//Modified Inputs  

   //First Word  Manipulation 
         String newFirstWord =  firstWord.substring (0,3);
         newFirstWord = newFirstWord.toUpperCase();
         String password = newFirstWord;
    
   //First Number Manipulation
         int newFirstNumber = firstNumber * 3;
         password += newFirstNumber;
         
   //Second Word Manipulation         
         String tempSecondWord = secondWord.substring(1,2);
         String newSecondWord = tempSecondWord.toLowerCase();
      
         tempSecondWord = secondWord.substring(3,4);
         newSecondWord += tempSecondWord; 
         
         tempSecondWord = secondWord.substring(5,6);
         tempSecondWord = tempSecondWord.toLowerCase();
         newSecondWord += tempSecondWord;
         password += newSecondWord;
         
   //Symbol Manipulation       
         String newSymbol = firstSymbol + firstSymbol + firstSymbol + firstSymbol;
         password += newSymbol; 
         
   //Third Word Manipulation
         
         int lenThirdWord = thirdWord.length();
         int middle = lenThirdWord / 2; 
         int start = middle - 2;
         String newThirdWord = thirdWord.substring(start,(start+5));
         password += newThirdWord;
         
   //Second Number Manipulation
         
         int newSecondNumber = secondNumber - 22;
         password += newSecondNumber; 
         
   //Fourth Word Manipulation
         
         int lenFourthWord = fourthWord.length();
         String newFourthWord = fourthWord.substring(lenFourthWord - 4, lenFourthWord);
         password += newFourthWord;  
         
   //Final Password Output                
  
         System.out.println ("\r\nYour New Password is: " + password);       
      
           
   } //end of main method
} //end of class Password