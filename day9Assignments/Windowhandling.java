package day9Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowhandling {
	
	public static void switchtochildhandle( WebDriver driver) {
		
		Set<String> windowHandles = driver.getWindowHandles();
		String parentID=driver.getWindowHandle();
//		System.out.println(windowHandles.size());
	for (String win : windowHandles) {
		if(!win.equals(parentID)) {
			driver.switchTo().window(win);
			break;
		}
	}
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--guest");
WebDriver driver = new ChromeDriver(options);
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.xpath("//a[text()='Contacts']")).click();
driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
String parentID=driver.getWindowHandle();
driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a/img")).click();
switchtochildhandle(driver);
driver.findElement(By.xpath("(//table[contains(@class,'table')]//tr/td/div/a)[1]")).click();
System.out.println("selected from contact");
driver.switchTo().window(parentID);
System.out.println("switched to parent");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a/img")).click();
switchtochildhandle(driver);
driver.findElement(By.xpath("((//table[contains(@class,'table')]//tr)[3]/td/div//a)[1]")).click();
System.out.println("selected to contact");
driver.switchTo().window(parentID);
driver.findElement(By.xpath("//a[text()='Merge']")).click();
driver.switchTo().alert().dismiss();
System.out.println("alert dismissed");
driver.quit();
	}



}
