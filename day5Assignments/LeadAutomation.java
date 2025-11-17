package day5Assignments;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadAutomation {

public static void main(String[] args) {

  //Initialize ChromeDriver
  WebDriver driver = new ChromeDriver();

  //Load the URL
  driver.get("http://leaftaps.com/opentaps/");

  //Maximize the browser window
  driver.manage().window().maximize();

  // Add implicit wait
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  // Enter Username and Password
  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
  driver.findElement(By.id("password")).sendKeys("crmsfanew");

  // Click the Login button
  driver.findElement(By.className("decorativeSubmit")).click();

  // Click on the CRM/SFA link
  driver.findElement(By.linkText("CRM/SFA")).click();

  // Click on the Leads tab
  driver.findElement(By.linkText("Leads")).click();

  //Click on the Create Lead button
  driver.findElement(By.linkText("Create Lead")).click();

  // Enter FirstName, LastName, CompanyName, and Title
  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("lakshmi");
  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA Engineer");

  // Click the Create Lead button
  driver.findElement(By.name("submitButton")).click();

  // Verify that the Title is displayed correctly
  String pageTitle = driver.getTitle();
  if (pageTitle.contains("View Lead")) {
      System.out.println(" Lead created successfully — Title verified: " + pageTitle);
  } else {
      System.out.println(" Title verification failed. Current Title: " + pageTitle);
  }

  //  Close the browser
  driver.quit();
}
}