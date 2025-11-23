package day7Assignments;

public class LoginTestData extends TestData{
	public void enterUsername(String name) {
		System.out.println("enter user name as: " + name);
	}
	public void enterPassword(String pas) {
		System.out.println("enter pswrd as: " + pas);
	}
	public static void main(String[] args) {
		LoginTestData td= new LoginTestData();
	td.enterCredentials("lakshmi", "lak");	
	td.navigateToHomePage();
	td.enterUsername("lakshmi");
	td.enterPassword("lak");
	
	
	}

}
