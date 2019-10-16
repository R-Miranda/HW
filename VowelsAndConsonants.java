/*Ricardo Miranda
306699034
CS 2011-04
Program looks at a string and evaluates if a character is a consonant or vowel, counts each, and prints them out.
*/
public class VowelsAndConsonants{
   public static void main(String[] args){
	  System.out.println("Testing with String Arduino Uno: ");
	  
      String test = "Arduino Uno";
   	
      printVowels(test);
      getNumVowels(test);
      printConsonants(test);
      getNumConsonants(test);
   }
   public static boolean isVowel(char c){
      char letter = Character.toLowerCase(c);
      switch(letter){
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u': 
            return true;
         default: 
            return false;
      }
   }
   public static int getNumVowels(String s){
      int vowelNum = getVowels(s).length();
      System.out.println(vowelNum);
      return vowelNum;
   }
   public static String getVowels(String s){
      String vowels = "";
      for(int i = 0; i < s.length();i++){
         if(isVowel(s.charAt(i))){
            vowels = vowels + s.charAt(i);
         }
      }
      return vowels;
   }
   public static boolean isConsonant(char c){
      char letter = Character.toLowerCase(c);
   	
      if(Character.isLetter(c)){
         return true;
      }else{
         return false;
      }
   }
   public static int getNumConsonants(String s){
      int consNum = getConsonants(s).length();
      System.out.println(consNum);
      return consNum;
   }
   public static String getConsonants(String s){
      String cons = "";
      for(int i = 0; i < s.length(); i++){
         if(!isVowel(s.charAt(i))){
            if(isConsonant(s.charAt(i))){
               cons = cons + s.charAt(i);
            }
         }
      }
      return cons;
   }
   public static void printVowels(String s){
      System.out.println(getVowels(s));
   }
   public static void printConsonants(String s){
      System.out.println(getConsonants(s));
   }
}