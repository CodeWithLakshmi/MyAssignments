package day7Assignments;

public class Poly {
	public void reportStep(String msg,String status) {
		System.out.println(msg);
		System.out.println(status);
	}
	public void reportStep(String msg,String status, boolean snap) {
		System.out.println(msg);
		System.out.println(status);
		if(snap)
			System.out.println("need to take snap");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Poly pl= new Poly();
pl.reportStep("message is printed", "Status is printed");
pl.reportStep("message", "status", true);
pl.reportStep("message displayed", "status of output", false);
	}

}
