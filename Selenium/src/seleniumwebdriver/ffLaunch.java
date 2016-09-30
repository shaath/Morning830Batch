package seleniumwebdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ffLaunch 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");

	}

}
