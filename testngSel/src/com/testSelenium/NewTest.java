package com.testSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void testMethod() {
	  System.setProperty("webdriver.chrome.driver","/Users/kanchan.sharma/Downloads/chromedriver");
	
		    ChromeDriver driver = new  ChromeDriver();
		    driver.get("http://www.google.com");
		    WebElement element = driver.findElement(By.name("q"));
		    element.sendKeys("Kanchan Sharma"); 
		    element.submit();

		   
		}
  }

