package week2.day2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Entering Firstname
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Rohan");
		
		//Entering lastname
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Krishna");
		
		//Entering EMail
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("sjrk@gmail.com");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Knowing your')]"));
		
		
		//Entering Job Title
		WebElement jobTitle=driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select drop=new Select(jobTitle);
		
		
		
		List<WebElement> options = drop.getOptions();
		drop.selectByIndex(options.size()-2);
		
		/*
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//div[contains(text(),'we know where')]")).click
		 * ();
		 */
		
		//For Printing the values in Dropdown
		for (WebElement allOptions : options) {
			
			allOptions.getText();
		}
		
		
		
		
		//Entering Company
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Deliotee");
		
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//div[contains(text(),'route you')]"));
		 */
		
		//Selecting values in Employees dropdown
		WebElement companyEmployee=driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select companyEmployeeDropdown=new Select(companyEmployee);
		companyEmployeeDropdown.selectByValue("950");
		
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//div[contains(text(),'number helps us')]"));
		 */
		
		
		//Entering Phone Number
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9176556111");
		
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//div[contains(text(),'have different')]"));
		 */
		
		//Selecting Country
		WebElement country=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select countrydrop=new Select(country);
		countrydrop.selectByVisibleText("Australia");
		
		//Selecting state
		WebElement state=driver.findElement(By.xpath("//select[@name='CompanyState']"));
		Select statedrop=new Select(state);
		statedrop.selectByVisibleText("Queensland");
	
		
		//Select Checkbox I agree
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		//Select checkbox Yes
		driver.findElement(By.xpath("//div[contains(text(),'would like to')]")).click();
		
		//Click Start my new trail
		driver.findElement(By.xpath("//button[@name='start my free trial']")).click();
		
		
		
	};
	

}
