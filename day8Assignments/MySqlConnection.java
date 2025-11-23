package day8Assignments;

public class MySqlConnection implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect in SQL");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect in SQL");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate in SQL");
	}
	public void executeQuery(){
		System.out.println("executequery in SQL");
		
	}

}
