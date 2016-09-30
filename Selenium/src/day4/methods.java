package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class methods
{
	public static void main(String[] args) 
	{
		String expval="google";
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		String actval=driver.getTitle();
		System.out.println(actval);
		
		if ((expval.toUpperCase()).equalsIgnoreCase(actval.toUpperCase()))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
