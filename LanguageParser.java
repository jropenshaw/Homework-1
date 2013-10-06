import java.util.Scanner;

public class LanguageParser {
   
   public static void main(String [] args){
   
      Scanner keyboard= new Scanner(System.in);
      
      System.out.print ("Enter a sentence: ");
      String firstWord = keyboard.next();
      String secondWord = keyboard.next();
      String thirdWord = keyboard.next();
      
//FLORB first letter = last letter
      
      char firstChar1 = firstWord.charAt(0);
      char lastChar1 = firstWord.charAt(firstWord.length()-1);
      char firstChar2 = secondWord.charAt(0);
      char lastChar2 = secondWord.charAt(secondWord.length()-1);
      char firstChar3 = thirdWord.charAt(0);
      char lastChar3 = thirdWord.charAt(thirdWord.length()-1);
     
      boolean firstIsFlorb = (firstChar1 == lastChar1);
      boolean secondIsFlorb = (firstChar2 == lastChar2);
      boolean thirdIsFlorb = (firstChar3 == lastChar3); 
      
               
//WOOBLE contains 'cj' or 'wq'

      boolean firstIsWooble = (firstWord.contains("cj") || firstWord.contains("wq"));
      boolean secondIsWooble = (secondWord.contains("cj") || secondWord.contains("wq"));
      boolean thirdIsWooble = (thirdWord.contains("cj") || thirdWord.contains("wq"));

      
//ZITH odd # and no 'z' or even # and no 'k'

      boolean isEven1 = (firstWord.length()%2==0);
      boolean containsZ1 = (firstWord.contains("z"));
      boolean containsK1 = (firstWord.contains("k"));
      
      boolean isEven2 = (secondWord.length()%2==0);
      boolean containsZ2 = (secondWord.contains("z"));
      boolean containsK2 = (secondWord.contains("k"));

      boolean isEven3 = (thirdWord.length()%2==0);
      boolean containsZ3 = (thirdWord.contains("z"));
      boolean containsK3 = (thirdWord.contains("k"));

      boolean firstIsZith = (!isEven1 && !containsZ1 || isEven1 && !containsK1);
      boolean secondIsZith = (!isEven2 && !containsZ2 || isEven2 && !containsK2);
      boolean thirdIsZith = (!isEven3 && !containsZ3 || isEven3 && !containsK3);
      
//ZARF last letter is uppercase

      String upperFirstWord = (firstWord.toUpperCase());
      char upperLastChar1 = upperFirstWord.charAt(upperFirstWord.length()-1);
      String upperSecondWord = (secondWord.toUpperCase());
      char upperLastChar2 = upperSecondWord.charAt(upperSecondWord.length()-1);
      String upperThirdWord = (thirdWord.toUpperCase());
      char upperLastChar3 = upperThirdWord.charAt(upperThirdWord.length()-1);
      
      boolean firstIsZarf = (upperLastChar1 == lastChar1);
      boolean secondIsZarf = (upperLastChar2 == lastChar2);
      boolean thirdIsZarf = (upperLastChar3 == lastChar3);
      
      int ruleNumber = 0;
            
      //Rule 1: wooble zith zarf
      
      boolean isRuleOne = (firstIsWooble && secondIsZith && thirdIsZarf);
      if (isRuleOne)
      {
      ruleNumber = 1;
      }
      else{}
      
      //Rule 2: zarf florb zith
      
      boolean isRuleTwo = (firstIsZarf && secondIsFlorb && thirdIsZith);
      if (isRuleTwo)
      {
      ruleNumber = 2;
      }
      else{}

      //Rule 3: wooble zarf florb
      
      boolean isRuleThree = (firstIsWooble && secondIsZarf && thirdIsFlorb);
      if (isRuleThree)
      {
      ruleNumber = 3;
      }
      else{}

      //Rule 4: florb zith zarf
      
      boolean isRuleFour = (firstIsFlorb && secondIsZith && thirdIsZarf);
      if (isRuleFour)
      {
      ruleNumber = 4;
      }
      else{}
      
      //Rule 5: zarf florb wooble
      
      boolean isRuleFive = (firstIsZarf && secondIsFlorb && thirdIsWooble);
      if (isRuleFive)
      {
      ruleNumber = 5;
      }
      else{}
   
      if (ruleNumber > 0) 
      {
          System.out.println ("According to rule " + ruleNumber + ", the sentence '" + firstWord + " " + secondWord + " " + thirdWord + "'");          
          System.out.print ("is part of our language");
      }
      else
      {
         System.out.println ("According to our rules, the sentence '" + firstWord + " " + secondWord + " " + thirdWord + "'");
         System.out.print ("is not part of our language");
      }
 
      
   }
}