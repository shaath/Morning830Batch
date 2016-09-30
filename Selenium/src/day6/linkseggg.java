package day6;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseggg 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) 
		{
			String lText=links.get(i).getText();
			links.get(i).click();
			Thread.sleep(2000);
			
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("F:\\Morning830AM\\Selenium\\src\\screenshot\\"+lText+".png"));
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			block=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			links=block.findElements(By.tagName("a"));
		}
	}

}
