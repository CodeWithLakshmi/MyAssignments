package day7Assignments;

public class LoginPage extends BasePage{
	int i=10;
@Override
public void performCommonTasks() {
	System.out.println("perform CommonTasks in subclass");
}

	public static void main(String[] args) {
		LoginPage lg= new LoginPage();
		lg.performCommonTasks();
		lg.clickElement();
		lg.enterText();
		lg.findElement();
		System.out.println(lg.i);

		BasePage bsp= new BasePage();
		bsp.performCommonTasks();
		System.out.println(bsp.i);
		
		BasePage bp = new LoginPage();
		bp.performCommonTasks();
		bp.clickElement();
		System.out.println(bp.i);
		// TODO Auto-generated method stub

	}

}
