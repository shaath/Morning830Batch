package day12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class alertseg2 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		Sleeper.sleepTightInSeconds(5);
		alt.accept();
		
	}

}
