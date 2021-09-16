package week2.day2;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				//String test = "feeling good";
				 
				//int i=0;

				// Build the logic to find the count of each
				/* Pseudo Code: 1
					a) Convert the String to character array
					b) Traverse through each character (using loop in reverse direction)
					c) Print the character (without newline -> like below
					   System.out.print(ch);
				

				char ch[]=test.toCharArray();
				
				int length=ch.length;
				
				for(i=length-1;i>=0;i--)
				{
					System.out.print(ch[i]);
				}
				*/
				
				/* Pseudo Code: 2
				a) Find the length of the string
				b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
				c) Find the character of the String using its index
				*/
				String str="Juliet Rajam";
				
				int strlength=str.length();
				
				int i=0;
				
				for(i=strlength-1;i>=0;i--)
				{
                  System.out.print(str.charAt(i));
				}
	}

}
