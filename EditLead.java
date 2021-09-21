package Leaftap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		// driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");

		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		// Click Leads

		driver.findElement(By.linkText("Leads")).click();

		// Click Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		WebElement firstRecord = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
				//(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String firstRecordTitle = firstRecord.getText();
		System.out.println("First Record Title :" + firstRecordTitle);
		
		//Click First Record
		firstRecord.click(); 	
		
		WebElement delete=driver.findElement(By.xpath("//a[text()='Delete']"));
		
		
		//Click Delete
		delete.click();
		
		// Click Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		WebElement leadID=driver.findElement(By.xpath("//input[@name='id']"));
		leadID.sendKeys(firstRecordTitle);
		
		//Click Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement mesg=driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
		String message=mesg.getText();
		System.out.println("Message:"+message);
		
		String org="No records to display";
		
		if(message.equals(org))
		{
			System.out.println("The particular lead successfully deleted");
		}
		

	}

}
