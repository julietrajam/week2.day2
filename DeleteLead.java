package Leaftap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {

			// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");

			driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");

			driver.findElement(By.xpath("//input[@value='Login']")).click();

			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			
			//Click Leads

			driver.findElement(By.linkText("Leads")).click();
			
            //Click Find Leads
			driver.findElement(By.linkText("Find Leads")).click();
			
			//Click Phone
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
            
			
			//Click Country Code
			WebElement countryCode = driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));

			countryCode.clear();
			countryCode.sendKeys("4");

			//Edit Areacode
			driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("64");

			//Enter Phone Number
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567899");

			//Click Find Leads
			driver.findElement(By.linkText("Find Leads")).click();

			//Click First Lead
			WebElement deleteRow = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
			String deleteData = deleteRow.getText();
			System.out.println("Deleted Data:" + deleteData);

			deleteRow.click();
			
			
			//Click Delete
			driver.findElement(By.linkText("Delete")).click();

			//Click Find Leads
			driver.findElement(By.linkText("Find Leads")).click();

			// driver.switchTo().frame(org.opentaps.gwt.crmsfa.crmsfa);
			
			
            //Passing the deleted lead id
			driver.findElement(By.name("id")).sendKeys(deleteData);
			
			//Click Find Leads
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

			WebElement message = driver.findElement(By.xpath("//div[text()='No records to display']"));

			String finalMsg = message.getText();

			System.out.println("Message: " + finalMsg);

			if (finalMsg.equals("No records to display"))
				System.out.println("The paricular lead was deleted");
			else
				System.out.println("The paricular lead was not deleted");

			driver.quit();
		} 
	

	}



