package day8Assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		List<Integer> newlist1 = new ArrayList<Integer>();
		List<Integer> newlist2 = new ArrayList<Integer>();
		if (arr1.length == arr2.length) {
		
			for (int i = 0; i < arr1.length; i++) {
				newlist1.add(arr1[i]);
			}
			for (int i = 0; i < arr2.length; i++) {
				newlist2.add(arr2[i]);
			}

			for(int j=0;j<newlist1.size();j++) {
			for(int inte: newlist1) {
				if(inte==newlist2.get(j)) {
					System.out.print(inte);
					System.out.print(" ");
				}
			}
			}
					}
		

		else {
			System.out.println("both arrays are not equal");
		}
	}
}
