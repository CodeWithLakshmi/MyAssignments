package day8Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={3, 2, 11, 4, 6, 7};
Arrays.sort(arr);
List<Integer> listint = new ArrayList<Integer>();
for (int i=0;i<arr.length;i++) {
	listint.add(arr[i]);
	
}
System.out.println(listint);
int si= listint.size();
System.out.println(listint.get(si-2));
	}

}
