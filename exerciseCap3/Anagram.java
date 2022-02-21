package exerciseCap3;

public class Anagram {
	
	 int resolvaProblemaA (String word) 
	   {
	   
	      int i=0;
	      int c1=0;
	      int positionMoreONe=1;
	      
	      while (i<word.length())
	       {
	             char aux=word.charAt(i);
	            	              
	             for (int j=positionMoreONe;j<word.length();j++)
	             {
	                if (word.charAt(j)==aux)
	                c1++;
	             }
	             i++;
	             positionMoreONe++;
	             
	       }
		return c1;        
	   }
	
}