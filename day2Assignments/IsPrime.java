package day2Assignments;

public class IsPrime {
	public static String checkPrime(int n) {
		String cp ="non-Prime";
		for (int i=2;i<n;i++) {
			if (n%i==0) {
				cp= "Prime";
				return cp;
			}
		}
		return cp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=16;
System.out.println(checkPrime(num));
	}

}
