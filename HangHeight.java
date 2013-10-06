/*===================================================================
Assignment #2: Height, Mileage, and Password
Macayla Openshaw (macaylaopenshaw@email.arizona.edu)
Karin Blanford

CSc 127A
I. Kishi
25 September 2013 at 9:00 pm

Goal: The goal of this program is to take the hang time given by the 
user and first divide it by two to satisfy the required variable
for the formula for hang height, and then calculate the hang height
and give the output in feet and meters for the user.

Deficiencies: There are no known deficiencies; it runs without 
error on my machine.

====================================================================*/

import java.util.Scanner;

public class HangHeight {
   public static void main (String [] args) {
   
//Scanner
   
   Scanner keyboard;
   keyboard = new Scanner ( System.in );
   
//Output 
   
   System.out.println ("Enter the number of seconds the ball is in the air: ");
      double hangTime = keyboard.nextDouble();
   
      double hangTimeHalf = hangTime / 2; 
   
      double heightFeet = .5 * 32.17 * hangTimeHalf * hangTimeHalf;
      double heightMeters = .5 * 9.087 * hangTimeHalf * hangTimeHalf; 
   
   System.out.println ();
   
   System.out.println ("The ball's height: " + heightFeet + " feet or " + heightMeters + " meters.");

  
   } //end of main method
} //end of class HangHeight
   