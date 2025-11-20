package day6Assignments;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();

		     driver.get("https://leafground.com/checkbox.xhtml");
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.manage().window().maximize();
		     WebElement basiccheckbox =driver.findElement(By.xpath("//div/span[text()='Basic']"));
		     basiccheckbox.click();
		     WebElement basiccheckboxvalidate =driver.findElement(By.xpath("//div/input[@aria-label='Basic']"));//selected
	if(basiccheckboxvalidate.isSelected()) {
		System.out.println("Basic checkbox is selected");
	}
	  WebElement notificationCheckbox = driver.findElement(By.xpath("//span[text()='Ajax']"));
      notificationCheckbox.click();

      WebElement notificationMsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
      System.out.println("Notification Message: " + notificationMsg.getText());
      WebElement javaLang = driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div"));
      javaLang.click();
      System.out.println("Java Language is selected");
Thread.sleep(5000);
      WebElement triState = driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following-sibling::div//div[2]"));
      triState.click();

      WebElement stateMsg = driver.findElement(By.xpath("//p[text()='State = 1']"));
      System.out.println("Tri-State message " + stateMsg.getText());
      Thread.sleep(5000);
     WebElement toggleSwitch = driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following-sibling::div/div[2]"));
      toggleSwitch.click();

      WebElement toggleMsg = driver.findElement(By.xpath("//span[text()='Checked']"));
      System.out.println("Toggle Message is displayed as " + toggleMsg.getText());

      WebElement disabledCheckbox = driver.findElement(By.xpath("//input[@disabled='disabled']"));
        if(disabledCheckbox.isEnabled()){
        	System.out.println("the check is enabled please check ");
        }
        else {
        	System.out.println("checkbox disabled as expected");
        }
        driver.findElement(By.xpath("//h5[text()='Select Multiple']//..//ul")).click();
        driver.findElement(By.xpath("//ul[@role='group']//..//label[text()='Istanbul']")).click();
        driver.findElement(By.xpath("//ul[@role='group']//..//label[text()='Miami']")).click();
        driver.findElement(By.xpath("//ul[@role='group']//..//label[text()='Amsterdam']")).click();
      

      System.out.println("3 options are selected");
 
      driver.quit();
  
	
	}

}
