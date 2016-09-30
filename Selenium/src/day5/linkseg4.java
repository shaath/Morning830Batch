package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class linkseg4
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.bing.com/");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.id("sc_hdu"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			String lText=links.get(i).getText();
			
			links.get(i).click();
			
			System.out.println(driver.getTitle()+"------"+driver.getCurrentUrl());
			driver.navigate().back();
			if (lText.equalsIgnoreCase("search history")) 
			{
				break;
			}
			Sleeper.sleepTightInSeconds(5);
			block=driver.findElement(By.id("sc_hdu"));
			links=block.findElements(By.tagName("a"));
		}
	}

}
