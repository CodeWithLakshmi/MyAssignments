package day8Assignments;

public class JavaconnectionSQL extends MySqlConnection{
	public void sample() {
		System.out.println("sample");
	}
public void connect() {
	System.out.println("connect in java");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MySqlConnection sq= new JavaconnectionSQL();
sq.connect();
sq.disconnect();
sq.executeUpdate();
sq.executeQuery();

JavaconnectionSQL ja= new JavaconnectionSQL();
ja.connect();
ja.sample();
ja.executeQuery();
ja.executeUpdate();
ja.disconnect();
	}

}
