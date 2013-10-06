/*========================================================

Assignment #2 Height, Mileage, and Password
Macayla Openshaw
Karin Blanford

CSc 127A
I. Kishi
25 September 2013 at 9:00 pm

Goal: the goal of this program is to take the initial 
mileage, and the mileage and gallons at various stops
during a trip in order to calculate the overall mileage
and MPG based off the inputs.

Deficiencies: There are no known deficiencies. The 
program runs without errors on my machine. 

========================================================*/

import java.util.Scanner;

public class GasMileage {
   public static void main (String [] args) {
   

//Scanner   

   Scanner keyboard = new Scanner ( System.in );  
   
//Prompt User
   
   System.out.println ("Enter the starting mileage: ");
      int startMileage = keyboard.nextInt();

   System.out.println(); 
//First Fill Up
   System.out.println("Enter the miles at the first fill up: ");
      int firstMiles = keyboard.nextInt();
   System.out.println("Enter the gallons at the first fill up: ");
      double firstGall = keyboard.nextDouble();
      int firstDriven = firstMiles - startMileage;
      double firstMPG = firstDriven / firstGall;
         int totalMiles = firstDriven;
         double totalGas = firstGall;
   
   System.out.println();
//Second Fill Up 
   System.out.println("Enter the miles at the second fill up: ");
      int secondMiles = keyboard.nextInt();
   System.out.println("Enter the gallons at the second fill up: ");
      double secondGall = keyboard.nextDouble();
      int secondDriven = secondMiles - firstMiles;
      double secondMPG = secondDriven / secondGall;
         totalMiles = totalMiles + secondDriven;
         totalGas = totalGas + secondGall;

   System.out.println();
//Third Fill Up   
   System.out.println("Enter the miles at the third fill up: ");
      int thirdMiles = keyboard.nextInt();
   System.out.println("Enter the gallons at the third fill up: ");
      double thirdGall = keyboard.nextDouble();
      int thirdDriven = thirdMiles - secondMiles;
      double thirdMPG = thirdDriven / thirdGall;
         totalMiles = totalMiles + thirdDriven;
         totalGas = totalGas + thirdGall;
   
   System.out.println();   
//Fourth Fill Up   
   System.out.println("Enter the miles at the fourth fill up: ");
      int fourthMiles = keyboard.nextInt();
   System.out.println("Enter the gallons at the fourth fill up: ");
      double fourthGall = keyboard.nextDouble();
      int fourthDriven = fourthMiles - thirdMiles;
      double fourthMPG = fourthDriven / fourthGall;
         totalMiles = totalMiles + fourthDriven;
         totalGas = totalGas + fourthGall;
   
   System.out.println();
//Fifth Fill Up   
   System.out.println("Enter the miles at the fifth fill up: ");
      int fifthMiles = keyboard.nextInt();
   System.out.println("Enter the gallons at the fifth fill up: ");
      double fifthGall = keyboard.nextDouble();
      int fifthDriven = fifthMiles - fourthMiles;
      double fifthMPG = fifthDriven / fifthGall;
         totalMiles = totalMiles + fifthDriven;
         totalGas = totalGas + fifthGall;

   System.out.println();
   
       
   
//Table 

   System.out.println("Odometer\tMiles\tGas\tMiles Per");
   System.out.println("Reading\t\tDriven\tUsed\tGallon");
   System.out.println(firstMiles + "\t\t" + firstDriven + "\t" + firstGall + "\t" + firstMPG);
   System.out.println(secondMiles + "\t\t" + secondDriven + "\t" + secondGall + "\t" + secondMPG);
   System.out.println(thirdMiles + "\t\t" + thirdDriven + "\t" + thirdGall + "\t" + thirdMPG);
   System.out.println(fourthMiles + "\t\t" + fourthDriven + "\t" + fourthGall + "\t" + fourthMPG);
   System.out.println(fifthMiles + "\t\t" + fifthDriven + "\t" + fifthGall + "\t" + fifthMPG);
 
   System.out.println();
//Final Totals   
   System.out.println("Total miles: " + totalMiles);
   System.out.println("Overall MPG: " + totalMiles / totalGas);
 
 
   
   } //end of main method
   
} //end of class GasMileage