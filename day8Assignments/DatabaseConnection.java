package day8Assignments;

public interface DatabaseConnection {
	public void connect(); 
	public void disconnect();
	public void executeUpdate();
}
