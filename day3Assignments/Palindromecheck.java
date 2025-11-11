package day3Assignments;

public class Palindromecheck {
	public static void palicheck(int input) {
		int output=0;
		// TODO Auto-generated method stub
		for (int i= input;i>0;i/=10) {
			
			output =output *10 + i%10;
				}
		System.out.println(output);
		if(input == output)
		System.out.println("Its a palindrome");
		else
			System.out.println("Its not a palindrome");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =12345;
		palicheck(input);
	}

	

}
