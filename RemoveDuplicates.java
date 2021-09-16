package week2.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
		/*
		 * Method 2 Declare string 
		 * Convert it into char array Declare Linked Hast Set of
		 * character USe for each and add the characters to the set using
		 * Character.valueOf(char c)
		 */
		
		
		
		/*
		 * String s="We learn java basics as part of java sessions in java week1"; 
		 * char ch[]=s.toCharArray(); 
		 * Set<Character> set=new LinkedHashSet<Character>();
		 * for(char c:ch) 
		 * { 
		 * set.add(Character.valueOf(c)); 
		 * } 
		 * System.out.println(set);
		 */
		
		 String s = "harikrishna";
	        String s2 = "";
	        for (int i = 0; i < s.length(); i++) {
	            Boolean found = false;
	            for (int j = 0; j < s2.length(); j++) {
	                if (s.charAt(i) == s2.charAt(j)) {
	                    found = true;
	                    break; //don't need to iterate further
	                }
	            }
	            if (found == false) {
	                s2 = s2.concat(String.valueOf(s.charAt(i)));
	            }
	        }
	        System.out.println(s2);
	}

}
