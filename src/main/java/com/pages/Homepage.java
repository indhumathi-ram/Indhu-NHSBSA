package com.pages;

//import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	private WebDriver driver;

	// 1. By Locators: OR
	
	private By startnowbutton = By.id("next-button");
	
	// 2. Constructor of the page class:
		public Homepage(WebDriver driver) {
			this.driver = driver;
		}
	
		// 3. page actions: features(behavior) of the page the form of methods:

		public String gethomePageTitle() {
			return driver.getTitle();
		}
		public void clickOnstartnowbutton() {
			driver.findElement(startnowbutton).click();
		}
		public void countryselectionwales()
		{
		WebElement ele = driver.findElement(By.xpath("//input[@id='radio-wales']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		}
		public void countryselectionnorthernireland()
		{
		WebElement ele = driver.findElement(By.xpath("//input[@id='radio-nire']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		}
		
		public void taxcreditselection()
		{
			WebElement ele = driver.findElement(By.xpath("//input[@id='yes-universal']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
		}
		
		public void radioyesquestions() {
			WebElement ele = driver.findElement(By.xpath("//input[@id='radio-yes']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
		    
		}
		public void radionoquestions() {
			WebElement ele = driver.findElement(By.xpath("//input[@id='radio-no']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
		     
		}
		
		public void Nhscostdetailsfor29year()
		{
			 String t = "You get help with NHS costs You get free NHS prescriptions";
		      // getPageSource() to get page source
		      if ( driver.getPageSource().contains("You get help with NHS costs")){
		         System.out.println("Text: " + t + " is present. ");
		      } else {
		         System.out.println("Text: " + t + " is not present. ");
		      }
		   
		}
		
		public void Nhscostdetailsforstudent()
		{
			 String t = "Because you're under 19 and in full-time education You get free:NHS prescriptions NHS dental check-ups and treatment sight tests	NHS wigs and fabric supports";
		      // getPageSource() to get page source
		      if ( driver.getPageSource().contains("you're under 19 ")){
		         System.out.println("Text: " + t + " is present. ");
		      } else {
		         System.out.println("Text: " + t + " is not present. ");
		      }
		   
		}
		
		public void Nhscostdetailshomecare()
		{
			 String t = "You can apply for help with NHS costs Because you get help from your local council to pay for your care home, you're entitled to help";
		      // getPageSource() to get page source
		      if ( driver.getPageSource().contains("Because you get help from your local council  ")){
		         System.out.println("Text: " + t + " is present. ");
		      } else {
		         System.out.println("Text: " + t + " is not present. ");
		      }
		   
		}
		
		public void Nhscostdetailsforseniorcitizen()
		{
			 String t = "Because you and your partner get Universal Credit and your combined take-home pay was less than £935:You get free: NHS prescriptions NHS dental check-ups and treatment sight tests";
		      // getPageSource() to get page source
		      if ( driver.getPageSource().contains("you and your partner get Universal Credit ")){
		         System.out.println("Text: " + t + " is present. ");
		      } else {
		         System.out.println("Text: " + t + " is not present. ");
		      }
		   
		}
		
		public void nextbutton()
		{
	    WebElement nextButton = 
		driver.findElement(By.xpath("//*[@id='next-button']"));
			nextButton.click();
}
		
		
		public void errormessage()
		{
			if(driver.getPageSource().contains("You cannot use this service because you live in Northern Ireland")){
				System.out.println("You cannot use this service because you live in Northern Ireland");
				}else
				{
				System.out.println("Text is absent");
			
				}
		}

		
		public void Dateofbirth29()
		{
			
			WebElement dateBox = driver.findElement(By.xpath("//input[@id='dob-day']"));
			 dateBox.sendKeys("18");
			 dateBox.sendKeys(Keys.TAB);
			 WebElement monthBox = driver.findElement(By.xpath("//input[@id='dob-month']"));
			 monthBox.sendKeys("04");
			 monthBox.sendKeys(Keys.TAB);
			 WebElement yearBox = driver.findElement(By.xpath("//input[@id='dob-year']"));
			 yearBox.sendKeys("1992");
			
		}
		public void Dateofbirthstudent()
		{
			
			WebElement dateBox = driver.findElement(By.xpath("//input[@id='dob-day']"));
			 dateBox.sendKeys("18");
			 dateBox.sendKeys(Keys.TAB);
			 WebElement monthBox = driver.findElement(By.xpath("//input[@id='dob-month']"));
			 monthBox.sendKeys("04");
			 monthBox.sendKeys(Keys.TAB);
			 WebElement yearBox = driver.findElement(By.xpath("//input[@id='dob-year']"));
			 yearBox.sendKeys("2004");
			
		}
		public void Dateofbirthseniorcitizen()
		{
			
			WebElement dateBox = driver.findElement(By.xpath("//input[@id='dob-day']"));
			 dateBox.sendKeys("18");
			 dateBox.sendKeys(Keys.TAB);
			 WebElement monthBox = driver.findElement(By.xpath("//input[@id='dob-month']"));
			 monthBox.sendKeys("04");
			 monthBox.sendKeys(Keys.TAB);
			 WebElement yearBox = driver.findElement(By.xpath("//input[@id='dob-year']"));
			 yearBox.sendKeys("1958");
			
		}
		
		public void Dateofbirthsmiddleage()
		{
			
			WebElement dateBox = driver.findElement(By.xpath("//input[@id='dob-day']"));
			 dateBox.sendKeys("18");
			 dateBox.sendKeys(Keys.TAB);
			 WebElement monthBox = driver.findElement(By.xpath("//input[@id='dob-month']"));
			 monthBox.sendKeys("04");
			 monthBox.sendKeys(Keys.TAB);
			 WebElement yearBox = driver.findElement(By.xpath("//input[@id='dob-year']"));
			 yearBox.sendKeys("1978");
			
		}
}
