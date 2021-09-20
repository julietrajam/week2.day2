package Leaftap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");
		
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Jeya");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Seeli");
	
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Je");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Se");
		
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("Mrs");
		
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("07/14/1992");
		
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("Teacher");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Education");
		
		WebElement currency=driver.findElement(By.xpath("//select[@name='preferredCurrencyUomId']"));
		Select currencyDrop=new Select(currency);
		currencyDrop.selectByValue("INR");
		
		driver.findElement(By.name("description")).sendKeys("Athletes and sports competitors typically do the following: Practice to develop and improve their skills. Maintain their sports equipment in good condition. Train, exercise, and follow special diets to stay in the best physical condition.");
		
		driver.findElement(By.name("importantNote")).sendKeys("Practice to develop and improve their skills.");
		
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("92");
		
		driver.findElement(By.name("primaryPhoneExtension")).sendKeys("025");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("xyz@gmail.com");
		
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("86756767687");
		
		driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("Jack");
		
		driver.findElement(By.name("generalToName")).sendKeys("Zhou");
		
		driver.findElement(By.name("generalAddress1")).sendKeys("Indira Nagar");
		
		driver.findElement(By.name("generalCity")).sendKeys("Chennai");
		
		driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("600 010");
		
		driver.findElement(By.id("createContactForm_generalPostalCodeExt")).sendKeys("90");
		
		driver.findElement(By.name("generalAttnName")).sendKeys("Ramsamy");
		
		driver.findElement(By.name("generalAddress2")).sendKeys("Tambaram");
		
		WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateDrop=new Select(state);
		stateDrop.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
	}

}
