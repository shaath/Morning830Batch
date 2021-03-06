package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidereg 
{
	public static WebDriver driver;
	@Test(dataProvider="data")
	public void test(String br,String url)
	{
		
		System.out.println(br +"---"+ url );
		if (br.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
			
		}
		else if (br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.get(url);
		
	}
	
	
	@DataProvider(parallel=true)
	public Object[][] data()
	{
		Object[][] d=new Object[3][2];
		
		d[0][0]="firefox";
		d[0][1]="http://google.com";
		
		d[1][0]="chrome";
		d[1][1]="http://facebook.com";
		
		d[2][0]="ie";
		d[2][1]="http://gmail.com";
		
		return d;
	}

}
