package day5Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {


public static void main(String[] args) throws InterruptedException {

  // Initialize ChromeDriver
  WebDriver driver = new ChromeDriver();

  //  Load the URL
  driver.get("https://en-gb.facebook.com/");

  //Maximize the browser window
  driver.manage().window().maximize();

  //Add implicit wait
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  //Click on Create new account button
  driver.findElement(By.xpath("//a[text()='Create new account']")).click();


  //Enter First name
  driver.findElement(By.name("firstname")).sendKeys("lak");

  //Enter Surname
  driver.findElement(By.name("lastname")).sendKeys("S");

  // Enter Mobile number or email address
  driver.findElement(By.name("reg_email__")).sendKeys("lakshmi.sample@gmail.com");

  // Enter New password
  driver.findElement(By.id("password_step_input")).sendKeys("Test@1234");

  //  Handle dropdowns for Date of birth
  WebElement dayDropdown = driver.findElement(By.id("day"));
  Select day = new Select(dayDropdown);
  day.selectByVisibleText("13");

  WebElement monthDropdown = driver.findElement(By.id("month"));
  Select month = new Select(monthDropdown);
  month.selectByVisibleText("Oct");

  WebElement yearDropdown = driver.findElement(By.id("year"));
  Select year = new Select(yearDropdown);
  year.selectByVisibleText("2000");

  //  Select the Gender radio button
  driver.findElement(By.xpath("//label[text()='Female']")).click();
System.out.println("registartion completed");

  //  Close the browser
  driver.quit();
}
}

