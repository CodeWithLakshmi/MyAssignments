package day6Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     WebDriver driver = new ChromeDriver();

	     driver.get("https://leafground.com/button.xhtml");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	    driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']//..//span[text()='Click']")).click();
	   System.out.println(driver.getTitle());
	   if(driver.getTitle().equals("Dashboard")) {
		   System.out.println("Title Dashboard is displayed as expected");
	   }
	   else {
		   System.out.println("title is not dashboard");
	   }
	   driver.navigate().back();
	 
	   
       WebElement disabledButton = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button"));
      if( disabledButton.isEnabled())
       System.out.println("Is 'Confirm if the button is disabled' enabled? : " + disabledButton.isEnabled());

	   WebElement submitButton = driver.findElement(By.xpath("//span[text()='Submit']/parent::button"));
       Rectangle x = submitButton.getRect();
       System.out.println("Submit button position " + x.getHeight());
       System.out.println("Submit button position " + x.getWidth());
       System.out.println("Submit button position " + x.getX());
       System.out.println("Submit button position " + x.getY());

       WebElement saveButton = driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following-sibling::button"));
       String colour = saveButton.getCssValue("background-color");
       System.out.println("Save button background color is " + colour);

       WebElement sizeButton = driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']//..//span[text()='Submit']"));
       Rectangle y = sizeButton.getRect();
       System.out.println("Button height: " + y.getHeight() + " width: " + y.getWidth());

       driver.close();
   }
	}


