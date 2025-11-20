package day6Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RadioButtonAutomation {

public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();

     driver.get("https://www.leafground.com/radio.xhtml");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize();
     WebElement favbrowser =driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/following-sibling::div//label[text()='Chrome']"));
   
     if (favbrowser.isEnabled()) {
    	  favbrowser.click();
         System.out.println("Fav  browse chrome is selected.");
     }
     WebElement defaultbrow =driver.findElement(By.xpath("//input[@value='Option1']"));//  not selected and click
     if (defaultbrow.isSelected()) {
         System.out.println("Default chrome browse is already selected.");
     }
     else {
         WebElement defaultbrowvalue =driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following-sibling::div//label[text()='Chrome']"));
    	 defaultbrowvalue.click();
    	 if (defaultbrowvalue.isSelected()) {
             System.out.println("Default chrome browse is selected now.");
         }
     }
     WebElement unsele =driver.findElement(By.xpath("//input[@value='Chennai']"));
     if (unsele.isSelected()) {
         System.out.println("Chennai is already selected.");
     }
     else {
   WebElement unselect =driver.findElement(By.xpath("//h5[text()='UnSelectable']/following-sibling::div//label[text()='Chennai']"));
    	 unselect.click();
    	 if (unsele.isSelected()) {
             System.out.println("Chennai is selected now.");
         }
             unselect.click();
    	 if (!unsele.isSelected()) {
             System.out.println("Chennai is unselected now.");
         }
     }
 
  WebElement radio =driver.findElement(By.xpath("//input[@value='21-40 Years']"));

Thread.sleep(2000);

     if (radio.isSelected()) {
         System.out.println("Age Radio button is already selected.");
     } else {
    	 radio.click();
         System.out.println("Age Radio button is still not selected.and now its selected");
     }
      driver.quit();
 }
}