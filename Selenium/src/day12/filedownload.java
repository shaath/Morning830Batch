package day12;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class filedownload 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("3.0.0-beta3")).click();
		
		Sleeper.sleepTightInSeconds(5);

		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\filedownload.exe");
	}

}
