package week2.day2;

public class ReverseEvenPositionCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="I am a software tester";
		char ch[]=test.toCharArray();
		char result[]=new char[ch.length/2];
		int k=0;
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(i%2==0)
			{
				result[k]=ch[i];
				k++;
				
			}
	
			}
		for(int i=result.length-1;i>=0;i--)
		{
			System.out.print(""+result[i]);
		}
		
		
		
		/*
		 * String[] t = test.split(" ");
		 * 
		 * String val = ""; for (int i = 0; i < t.length; i++) {
		 * 
		 * if (i % 2 == 1) val = val + new StringBuilder(t[i]).reverse().toString() +
		 * " "; else val = val + t[i] + " "; } val = val.trim();
		 * System.out.println(val);
		 */
	}

}
