package day2;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://facebook.com");

	}

}
