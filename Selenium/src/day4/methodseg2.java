package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class methodseg2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		
		String text=driver.findElement(By.linkText("Gmail")).getText();
		
		
		System.out.println(text);
		
		String href=driver.findElement(By.linkText("Gmail")).getAttribute("class");
		System.out.println(href);
		
//		System.out.println(driver.getPageSource());
		
//		driver.close();
		
//		driver.quit();
		
//		WindowsUtils.killByName("eclipse.exe");
	}
}
