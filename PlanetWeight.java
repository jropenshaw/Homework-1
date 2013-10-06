/*===========================================================================
   Assignment #1: PlanetWeight.java
   Macayla Openshaw (macaylaopenshaw@email.arizona.edu)
   Karin Blanford
   
   127A
   I. Kishi
   Wednesday, September 11 by 9:00 pm
   
   The goal of this program is to calculate a person's weight on several
   different planets. I achieved this by first assigning variables to each 
   of the planets' rates of acceleration. I then input these variables into 
   the formula for calculating the weight on that specific planet. In order
   to get the desired output, I combined text with the calculations from
   the formula. 
   
   I am not aware of there being any unsatisfied requirements or 
   logic errors. (It runs without errors on my computer).
   
===========================================================================*/



public class PlanetWeight
   {
      public static void main( String args[] )
      {
      
//Weight Variables

   int weight= 145;
   int suitWeight=110;
   
//Acceleration Variables

   float earth= 32.2f;
   float triton= 2.558f;
   float callisto= 4.054f;
   float venus= 29.1f;
   float mercury= 12.1f;
   float asteroid= 0.000391f;
   
//Weight Calculations

   float wEarth= (earth / earth) * (weight + suitWeight);
   float wTriton= (triton / earth) * (weight + suitWeight);
   float wCallisto= (callisto / earth) * (weight + suitWeight);
   float wVenus= (venus / earth) * (weight + suitWeight);
   float wMercury= (mercury / earth) * (weight + suitWeight);
   float wAsteroid= (asteroid / earth) * (weight + suitWeight);
  
      
 //Output
 
System.out.println("Weight on Earth is " + weight + " pounds");
System.out.println("Weight on Earth including spacesuit is " + wEarth + " pounds");
System.out.println();
System.out.println("Weight on Triton would be " + wTriton + " pounds");
System.out.println("Weight on Callisto would be " + wCallisto + " pounds");
System.out.println("Weight on Venus would be " + wVenus + " pounds");
System.out.println("Weight on Mercury would be " + wMercury + " pounds");
System.out.println("Weight on Asteroid 1999 RQ36 would be " + wAsteroid + " pounds");      
      
      
      }
        
   }

