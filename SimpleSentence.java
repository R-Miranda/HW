/*
	Ricardo Miranda
	306699034
	CS 2011-04
	Program takes a random number and takes a sentence piece from each array at that index to create a simple senetence.
*/

import java.util.Random;

public class SimpleSentence{
	
	public static void main(String[] args){
		
		String[] subjects = {"taco", "dog", "teacher, mom", "dad", "uncle", "pizza", "cat", "car", "pencil"};
		String[] verbs = {"tastes", "looks", "runs", "hits", "sits", "bites", "writes", "watches", "carries", "eats", "is", "appears"};
		String[] adjectives = {"fast", "good", "cute", "adorable", "strong", "broken", "weak", "fashionable", "slim", "smart", "scared", "big", "small", "agile", "smooth"};
		
		String sentence = getSimpleSentence(subjects, verbs, adjectives);
		
		System.out.print(sentence);
	}	
		public static String getSimpleSentence(String[] subjects, String[] verbs, String[] adjectives) {
			
			Random random = new Random(); 
			
			String subject = (subjects[random.nextInt(9)] + " ");
			String verb = (verbs[random.nextInt(11)] + " ");
			String adjective = (adjectives[random.nextInt(14)] + ".");
			
			String s = (subject + verb + adjective);
			return s;
		}
	
}	
			
		
		
		
				
	 
	 