package Leaftap;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		
		//Username
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");

		//Password
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");

		//Click Login
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		//Click CRM/SFA 
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Click Find Leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Click the first record
		Thread.sleep(5000);
		
		WebElement firstlead=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		String leadId=firstlead.getText();
		System.out.println("Lead Id :"+leadId);
		
		//Click first lead
		firstlead.click();
		
		//get Title
				WebElement dupTitle=driver.findElement(By.id("viewLead_generalProfTitle_sp"));
				String tit=dupTitle.getText();
				System.out.println("Title :"+tit);
		
		//Click Duplicate Lead
		WebElement dupLead=driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
		dupLead.click();
		
		/*
		 * String dupLeadTitle=dupLead.getText();
		 * System.out.println("Title of the Lead: "+dupLeadTitle);
		 */
		
		
		
		
		Thread.sleep(3000);
		//Click Create Lead
		WebElement createLead=driver.findElement(By.xpath("//input[@name='submitButton' and @value='Create Lead']"));
		createLead.click();
		
		Thread.sleep(5000);
		
		//get Title
				WebElement dupTitle1=driver.findElement(By.id("viewLead_generalProfTitle_sp"));
				String tit1=dupTitle1.getText();
				System.out.println("Title :"+tit1);
		
	   //Comparing title
				if(tit.equals(tit1))
					System.out.println("Both leads are same");
				else
					System.out.println("Leads are not same");

	}

}
