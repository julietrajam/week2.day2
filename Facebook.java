package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;


public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   WebDriverManager.chromedriver().setup();
	   
	   ChromeDriver driver=new ChromeDriver();
	   
	   driver.get("https://en-gb.facebook.com/");
	   
	   driver.manage().window().maximize();
	   
	   WebElement create=driver.findElement(By.linkText("Create New Account"));
	   create.click();
	   
	   driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	   
	   
	   driver.findElement(By.name("firstname")).sendKeys("Jose");
	   
	   driver.findElement(By.name("lastname")).sendKeys("Ajay");
	   
	   driver.findElement(By.name("reg_email__")).sendKeys("9779867670");
	   
	   driver.findElement(By.id("password_step_input")).sendKeys("ghjgkjgkjgkjvkj");
	   
	   WebElement date=driver.findElement(By.id("day"));
	   Select s = new Select(date);
	   s.selectByValue("14");
	   
	   WebElement month=driver.findElement(By.id("month"));
	   Select s1 = new Select(month);
	   s1.selectByIndex(7);
	   
	   WebElement year=driver.findElement(By.id("year"));
	   Select s2 = new Select(year);
	   s2.selectByValue("1963");
	   
	   driver.findElement(By.xpath("//input[@value='1']")).click();
	   
	   driver.findElement(By.name("websubmit")).click();
	   
	   
	   
	}

}
