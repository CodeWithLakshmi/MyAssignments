package day4Assignments;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
//- Initialize a variable ‘count’
		int count = 0;
//- Split the text into an array of words
		String[] words = text.split(" ");
//- Create two nested for loops to compare each word
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equalsIgnoreCase(words[j])) {
					// - If a duplicate word is found, it is replaced with an empty string
					words[j] = " ";
					count++;

				}
			}
		}
//		System.out.println(count);
		if (count > 0) {
			for (String wr : words) {
				System.out.print(wr +" ");
			}
	}
	}

}
