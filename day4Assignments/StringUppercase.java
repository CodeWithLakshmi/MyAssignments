package day4Assignments;

public class StringUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test= "changeme";
		
		//Convert the given String to a character array.
		char[] ch= test.toCharArray();
		
			//loop to iterate through each character of the String (from end to start).
		for(int i=ch.length-1;i>=0;i--) {
			//odd index within the loop
			if(i%2==1) {
				//change the character to uppercase
				ch[i]= Character.toUpperCase(ch[i]);
//				System.out.println(ch[i]);
			}
				
		}
		//Print the characters with the expected output
		for(char c:	ch) {
			System.out.print (c);
		}
	}

}
