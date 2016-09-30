package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseg3 
{
	public static void main(String[] args) 
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
//			System.out.println(links.get(i).getText());
			String lText=links.get(i).getText();
			if (!lText.equals("")) 
			{
				System.out.println(links.get(i).getText());
				count=count+1;
			}
			
		}
		System.out.println("The visible links count in Gogle Page is "+count);
		System.out.println("The Invisible links count in google page is "+(links.size()-count));
		
	}

}
