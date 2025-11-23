package day8Assignments;

public class JavaConnection implements DatabaseConnection{
	public static void main(String[] args) {
		
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeupdate");
	}
	 

}
