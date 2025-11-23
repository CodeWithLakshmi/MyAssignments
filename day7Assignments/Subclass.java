package day7Assignments;

public class Subclass extends Superclass {
	@Override
	public void override() {
		System.out.println("method in subclass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Subclass sub =new Subclass();
sub.override();
Superclass sup= new Superclass();
sup.override();
	}

}
