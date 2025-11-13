package day4Assignments;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		//Split the words and have it in an array 
		String[] words=test.split(" ");
		//- Traverse through each word using loop
		for (int i=0;i<words.length;i++) {
			if(i%2==1) {//- Find the odd index 
char[] c=words[i].toCharArray();//- Convert the String array into a character array
for(int a=c.length-1;a>=0;a--) {
	System.out.print(c[a]);
}
System.out.print(" ");
			}
			if(i%2==0) //- Print the even position words using another loop
				System.out.print(words[i]+" ");
			
		}
		
		
		
	}

}
