package day3Assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,3,2,8,6,7 };
		Arrays.sort(arr);
		int n = arr.length+1;
		int sum = n*(n+1)/2;
		int arrsum=0;
		for (int i = 0; i <n-1; i++) {
			 arrsum =arrsum +arr[i];				
					}
if (sum !=arrsum) {
	int missnum= sum- arrsum;
	System.out.println(missnum);
}
			}
		}
	


