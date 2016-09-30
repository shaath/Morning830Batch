package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class checkboxeg 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("Http://gmail.com");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
		driver.findElement(By.id("next")).click();
		
		WebElement check=driver.findElement(By.id("PersistentCookie"));
		Sleeper.sleepTightInSeconds(5);
		if (check.isSelected())
		{
			check.click();
			System.out.println("It has Unselected");
		}
		else
		{
			System.out.println("It already in unchecked position");
		}
		
	}

}
