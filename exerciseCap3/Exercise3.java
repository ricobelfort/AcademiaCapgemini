package exerciseCap3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      
	      	Scanner entry = new Scanner(System.in);
	    	
	    	System.out.print("Digite uma palavra: ");
			String word = entry.next();
			
			Anagram anagram = new Anagram();
			
			anagram.resolvaProblemaA(word);
					
	}

}