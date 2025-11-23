package day8Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 10, 6, 8 };
		List<Integer> numbers = new ArrayList<>();
		for (int num : arr) {
			numbers.add(num);
		}
		// sort the list
		Collections.sort(numbers);
		System.out.println("Sorted List: " + numbers);
		System.out.println("Missing Numbers:");

		// compare with next element
		for (int i = 0; i < numbers.size() - 1; i++) {
			if (!((numbers.get(i) + 1) == numbers.get(i + 1))) {

				System.out.print((numbers.get(i)) + 1);
				System.out.print(" ");
			}
		}
	}
}
