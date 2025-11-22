package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WebElement selectedCity= driver.findElement(By.xpath("
public class BookPVRticket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.pvrcinemas.com/");
driver.manage().window().maximize();
WebElement selectedCity= driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]"));
String currentcity =selectedCity.getText();
System.out.println("current city " + currentcity);
if(!currentcity.equals("Chennai")) {
	selectedCity.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement Chennaicity= driver.findElement(By.xpath("//div[@class='cities-names']/h6[text()='Chennai']"));
	Chennaicity.click();
	System.out.println("Chennai city is selected");

}
WebElement selectCinema= driver.findElement(By.xpath("//div[@class='date-show']/span[text()='Cinema']"));
selectCinema.click();
System.out.println("Cinema option is clicked");
WebElement Cinema= driver.findElement(By.xpath("//span[text()='Select Cinema']"));
Cinema.click();
Thread.sleep(3000);
WebElement Cinemalocation= driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']"));
//WebElement Cinemalocation= driver.findElement(By.xpath("//span[text()='PVR, Grand Mall, Velachery']"));
Cinemalocation.click();
System.out.println("cinema location is selected");
WebElement sD= driver.findElement(By.xpath("//span[text()='Tomorrow']"));
sD.click();
System.out.println("cinema date is selected");
WebElement selectcinemaname= driver.findElement(By.xpath("//li/span[text()='MASK']"));
selectcinemaname.click();
System.out.println("cinema name is selected");
WebElement stime= driver.findElement(By.xpath("//span[text()='04:20 PM']"));
stime.click();
System.out.println("cinema time is selected");

WebElement book= driver.findElement(By.xpath("//button[@type='submit']"));
book.click();
System.out.println("book is clicked");
WebElement Accept= driver.findElement(By.xpath("//button[text()='Accept']"));
Accept.click();
System.out.println("Accept is clicked");

WebElement selectedseat= driver.findElement(By.xpath("//span[contains(@id,'D')][text()='8']"));
selectedseat.click();
System.out.println("selected seat is clicked");

WebElement seatinfo= driver.findElement(By.xpath("//h6[text()='Seat Info']/following-sibling::div/div/p"));
//selectedseat.click();
System.out.println("selected seat info " +seatinfo.getText());

WebElement price= driver.findElement(By.xpath("//div[@class='grand-prices']/h6"));
//selectedseat.click();
System.out.println("selected seat price " + price.getText());
WebElement proceed= driver.findElement(By.xpath("//button[text()='Proceed']"));
proceed.click();
System.out.println("proceeded is clicked");
WebElement closethepopup= driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]"));
closethepopup.click();
System.out.println("closed the popup");

System.out.println("page title is "+ driver.getTitle());
driver.quit();
	}

}
