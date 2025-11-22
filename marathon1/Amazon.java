package marathon1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
WebElement entertextbox= driver.findElement(By.xpath("//label[text()='Search Amazon.in']/following-sibling::input"));
entertextbox.sendKeys("Bags for boys",Keys.ENTER);
System.out.println("Bags for boys is searched");
WebElement result=driver.findElement(By.xpath("(//span[@class='rush-component']//h2/span)[1]"));
WebElement result1=driver.findElement(By.xpath("(//span[@class='rush-component']//h2/span)[3]"));
System.out.println(result.getText() +" "+  result1.getText());
driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
System.out.println("select 1st brand checkbox");
Thread.sleep(5000);
driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
System.out.println("select 2nd brand checkbox");
driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
System.out.println("click sort by");
driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
System.out.println("select newest arrivals");
String info=driver.findElement(By.xpath("//h2[contains(@class,'a-size-base-plus')]/span")).getText();
System.out.println("bag info : " + info);
String price=driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
System.out.println("bag price : " + price);
System.out.println(driver.getTitle());
driver.quit();




}
	}