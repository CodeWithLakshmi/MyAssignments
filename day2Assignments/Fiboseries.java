package day2Assignments;

public class Fiboseries {
public void fibo(int n) {
	int n1=0;
	int n2=1;
	for (int i=0;i<=n;i++) {
		
		System.out.println(n1);
		int n3= n1+n2;
		n1=n2;
		n2=n3;
		
		
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fiboseries fb= new Fiboseries();
int num= 8;
fb.fibo(num);
	}

}
