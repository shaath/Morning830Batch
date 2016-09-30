package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowneg1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/Sharath/Desktop/cars.html");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("html/body/select"));
		
		Select s=new Select(drop);
		
//		s.selectByIndex(2);
//		Thread.sleep(5000);
//		s.selectByValue("audi");
//		Thread.sleep(5000);
//		s.selectByVisibleText("Saab");
		
		List<WebElement> cList=s.getOptions();
		System.out.println(cList.size());
		
		for (int i = 0; i < cList.size(); i++)
		{
			s.selectByIndex(i);
			String cText=cList.get(i).getText();
			System.out.println(cText);
			Thread.sleep(5000);
		}
	}

}
