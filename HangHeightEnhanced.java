/*===================================================================
Assignment #2: Height, Mileage, and Password
Macayla Openshaw (macaylaopenshaw@email.arizona.edu)
Karin Blanford

CSc 127A
I. Kishi
25 September 2013 at 9:00 pm

Program's Goal:

Deficiencies: 

====================================================================*/

import java.util.Scanner;

public class HangHeightEnhanced {
   public static void main (String [] args) {
   
//Scanner
   
   Scanner keyboard = new Scanner( System.in );
   double hangTime;
   
//Validate inputs

   do {
      System.out.println ("Enter the number of seconds the ball is in the air: ");
      while (!keyboard.hasNextDouble()) {
         System.out.println("That was not a number, please try again.");
         keyboard.next();
      }
   hangTime = keyboard.nextDouble();
   } while (hangTime <=0);
   
//Calculations 
   
   double hangTimeHalf = hangTime / 2; 
   
   double heightFeet = .5 * 32.17 * hangTimeHalf * hangTimeHalf;
   double heightMeters = .5 * 9.087 * hangTimeHalf * hangTimeHalf; 
   
//Output

   System.out.println();
   System.out.println("The ball's height: " + heightFeet + " feet or " + heightMeters + " meters.");
  
   }
}
   