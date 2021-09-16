package week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Method 1
		 * Pseudo Code
		 
		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) using replaceAll(), replace all the non-digits into ""
		 * b) Now, convert the String into array
		 * c) Iterate over the array and get each character
		 * d) Using Character.getNumericValue(), Change the char into int
		 * e) Add the values to sum & print
		 * 
		 */
		
	
		
		/*
		 * Method 2
		 * Pseudo Code
		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) Iterate an  array over the String
		 * b) Get each character and check if it is a number using Character.isDigit()
		 * c) Now covert char to int using 
 and add it to sum
		 * d) Now Print the value
		 */
		
		
		  String text = "Tes12Le79af65"; int sum=0;
		  String numbers=text.replaceAll("^0-9]", "");
		  System.out.println("Digits in string :"+numbers);
		  
		  
		  int i=0,n;
		  
		  char ch;
		  
		  for(i=0;i<numbers.length();i++)
		  
		  {
		  
		  ch=numbers.charAt(i);
	      n=Character.getNumericValue(ch);
		  sum=sum+n;
		  
		  }
		  
		  System.out.println("Sum of the converted char into int is:"+sum);
		 
		
		/*
		 * String text = "Tes12Le79af65"; char[] ch=text.toCharArray(); int
		 * sumOfDigits=0; for(int i=0;i<ch.length;i++) {
		 * sumOfDigits=sumOfDigits+Integer.parseInt(ch[i]); }
		 * System.out.println("Sum of Digits is: "+sumOfDigits);
		 */
		
	}

}
