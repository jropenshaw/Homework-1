/*===========================================================================
   Assignment #1: Hitting.java
   Macayla Openshaw (macaylaopenshaw@email.arizona.edu)
   Karin Blanford
   
   127A
   I. Kishi
   Wednesday, September 11 by 9:00 pm
   
   The goal of this program is to use the given baseball statistics to 
   calculate several other unknown baseball statistics. I assigned 
   variables to all known statistics first. I then assigned float
   variables to the more complex statistics that needed to be solved 
   for. Lastly, I combined the outputs from the calculations with text to 
   come up with the final product. 
   
   I am not aware of there being any unsatisfied requirements or 
   logic errors. (It runs without errors on my computer).
   
===========================================================================*/




public class Hitting
{
   public static void main( String args[] )
   {
               
//Variables: Provided Statistics               
   
   int bats= 8903;
   int doubles= 547;
   int triples= 38;
   int hRuns= 467;
   int walks= 1494;
   int sBunts= 150;
   float bAverage= 0.3041672f;

//Variables: Calculated Statistics
     
   float singles= bAverage * bats - doubles - triples - hRuns;
   float hits= singles + doubles + triples + hRuns;
   float totalBases= singles + 2 * doubles + 3 * triples + 4 * hRuns;
   float onBasePercentage= (hits + walks) / (bats + walks);
   float sluggingPercentage= (totalBases) / (bats + sBunts);
   
//Output


System.out.println("Larry Wayne \"Chipper\" Jones's career hitting:");
System.out.println("Provided Statistics:");

//Provided Stats List
                              
   System.out.println("\t At Bats:             " +bats);
   System.out.println("\t Doubles:             " +doubles);
   System.out.println("\t Triples:             " +triples);
   System.out.println("\t Home Runs:           " +hRuns);
   System.out.println("\t Walks:               " +walks);
   System.out.println("\t Sacrifice Bunts:     " +sBunts);
   System.out.println("\t Batting Average:     " +bAverage);
   
System.out.println("Computed Statistics:");

//Computed Stats List

   System.out.println("\t Singles:             " +singles);
   System.out.println("\t Total Bases:         " +totalBases);
   System.out.println("\t On-base Percentage:  " +onBasePercentage);
   System.out.println("\t Slugging Percentage: " +sluggingPercentage);

   }//end of method main
   
}//end of class Hitting 