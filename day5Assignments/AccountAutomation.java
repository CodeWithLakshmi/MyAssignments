package day5Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountAutomation {

	public static void main(String[] args) {
		  //  Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        //Load the URL
        driver.get("http://leaftaps.com/opentaps/");
        // Maximize the browser window
        driver.manage().window().maximize();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  Enter Username and Password
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfanew");

        // Click on the Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        //  Click on CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click on Accounts tab
        driver.findElement(By.linkText("Accounts")).click();

        // Click on Create Account button
        driver.findElement(By.linkText("Create Account")).click();

        // Enter Account Name
        driver.findElement(By.id("accountName")).sendKeys("TestLeaf Automation");

        //  Enter Description
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

        //Select Industry as ComputerSoftware
        WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
        industryDropdown.click();
        Select industry = new Select(industryDropdown);
        industry.selectByValue("IND_SOFTWARE");

        //  Select Ownership as S-Corporation
        WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
        Select ownership = new Select(ownershipDropdown);
        ownership.selectByVisibleText("S-Corporation");

        // Select Source as Employee (using value)
        WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
        Select source = new Select(sourceDropdown);
        source.selectByValue("LEAD_EMPLOYEE");

        //Select Marketing Campaign as eCommerce Site Internal Campaign (using index)
        WebElement marketingDropdown = driver.findElement(By.id("marketingCampaignId"));
        Select marketing = new Select(marketingDropdown);
        marketing.selectByIndex(6); // Adjust index if needed

        //  Select State/Province as Texas (using value)
        WebElement statedd = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select state = new Select(statedd);
        state.selectByValue("TX");

        // Click the Create Account button
        driver.findElement(By.className("smallSubmit")).click();
        System.out.println("created account");

        //  Verify that the Account Name is displayed correctly
        String accountName = driver.findElement(By.xpath("//td[@class='titleCell']/following-sibling::td[1]/span")).getText();
        if (accountName.contains("TestLeaf Automation")) {
            System.out.println(" Account created successfully: " + accountName);
        } else {
            System.out.println(" Account creation failed. Displayed name: " + accountName);
        }

        // Close the browser
        driver.quit();
    }
}
