package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		
		//email
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		//password
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		//Clicking Login BUtton
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String title=driver.getTitle();
		System.out.println("TItle of the webpage :"+title);
		
		//Click Log Out
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		
		driver.close();
	}

}
