package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmaillogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		//manage()
		driver.manage().window().maximize();
		
		//findElement
		
		WebElement email=driver.findElement(By.id("Email"));
		//textbox
		
		email.sendKeys("gandesharath");
//		Sleeper.sleepTightInSeconds(5);
//		email.clear();
		
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}
