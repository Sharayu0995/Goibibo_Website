/*package com.codebine;

import java.awt.List;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.google.common.io.Files;


public class TestA 
{  
	WebDriver driver=null;
	@BeforeSuite
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fidel\\Downloads/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void enterurl() throws InterruptedException
	{
		driver.get("https://www.goibibo.com/");
		Thread.sleep(10000);
		
	}
	@Test
	public void setdata() throws InterruptedException
	{
		driver.findElement(By.xpath("(//a[@href=\"/gostays/\"])[1]")).click();
		Thread.sleep(10000);
		//click on date
		driver.findElement(By.xpath("(//p[@class=\"SearchBlockUIstyles__RadioText-fity7j-5 giuHie\"])[1]")).click();
		WebElement datebox= driver.findElement(By.xpath("(//div[@class=\"SearchBlockUIstyles__CheckInCheckOutWrap-fity7j-17 cguuJM\"])[1]"));
		datebox.click();
		//click on arrow
		driver.findElement(By.xpath("//div[@class=\"dcalendarstyles__MonthChangeRightArrowDiv-r2jz2t-16 eVCvYn\"]")).click();
		//2 nd click
		driver.findElement(By.xpath("(//div[@class=\"dcalendarstyles__SliderArrow-r2jz2t-14 jGviQM\"])[2]")).click();
		//3rd click
		driver.findElement(By.xpath("(//div[@class=\"dcalendarstyles__SliderArrow-r2jz2t-14 jGviQM\"])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'10')])[2]")).click();
		driver.findElement(By.xpath("(//div[@class=\"CalendarMainComponentstyles__SliderArrow-wxaw45-13 lcwCBv\"])[2]")).click();
       	driver.findElement(By.xpath("(//span[contains(text(),'29')])[2]")).click();
       	Thread.sleep(10000);
       	//select room
       	driver.findElement(By.xpath("(//div[@class=\"SearchBlockUIstyles__SearchInputWrap-fity7j-10 fHIpnu\"])[2]")).click();
       	//Room
       	driver.findElement(By.xpath("(//span[@class=\"PaxWidgetstyles__ContentActionIconWrapperSpan-gv3w6r-7 dUGaFj\"])[2]")).click();
       	//Thread.sleep(1000);
       	//adult
       	driver.findElement(By.xpath("(//span[@class=\"PaxWidgetstyles__ContentActionIconWrapperSpan-gv3w6r-7 dUGaFj\"])[4]")).click();
       	//Children
       	driver.findElements(By.xpath("(//span[@class=\"PaxWidgetstyles__ContentActionIconWrapperSpan-gv3w6r-7 dUGaFj\"])[6]"));
       	driver.findElement(By.xpath("//Button[@class=\"PaxWidgetstyles__ButtonWrapper-gv3w6r-9 driPxZ\"]")).click();
       	Thread.sleep(10000);
       	//enter location
       	WebElement loc= driver.findElement(By.xpath("//input[@class=\"HomePageAutosuggeststyles__SearchInputStyles-sc-1v6s32j-1 fqYzvY\"]"));
       	loc.click();
       	driver.findElement(By.xpath("(//div[@class=\"TrendingDestinationsUI__PopularBigImageOverlayWrap-qz22gb-6 iNXMwO\"])[2]")).click();
       	Thread.sleep(10000);
      //Search hotel
       //	driver.findElement(By.xpath("//div[2]//div[1]//div[3]//div[2]//div[2]//div[1]//div[3]//button[1]")).click();  	
	}
	@Test
	public void gethoteldetails() throws InterruptedException
	{
	   driver.findElement(By.xpath("//div[2]//div[1]//div[3]//div[2]//div[2]//div[1]//div[3]//button[1]")).click();
	    Thread.sleep(10000);
	    //Change tab
	    //driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+"t");
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.goibibo.com/gostays/");
		//Scroll page
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,550);");
		//get data
		WebElement webElement = driver.findElement(By.xpath("//div[2]//div[1]//div[2]//div[1]//div[3]//button[1]")); 
		webElement.click();
		System.out.println(webElement.getText());
	
		List<WebElement> hotelinfo= driver.findElements(By.className("HotelCardstyles__WrapperSectionMetaDiv-sc-1s80tyk-1 hOMrjh"));
		for(WebElement eachTitle: hotelinfo )
		{
			System.out.println(hotelinfo.getText());
		}
	}
}*/
