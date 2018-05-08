package org.test.ExampleTask;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepD {

	static String parentwindows;


	
	
 WebDriver driver;

	@Given("^user in the flipkart$")
	public void user_in_the_flipkart() throws Throwable {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\bharathi Excep\\ExampleTask\\driver\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-phones-store");
	}

	@When("^The user added to the cart \"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void the_user_added_to_the_cart(String mobilemodel1, String mobilemodel2, String mobilemodel3, String mobilemodel4, String mobilemodel5) throws Throwable {
		
driver.manage().window().maximize();
		//iteam1
			driver.findElement(By.name("q")).sendKeys (mobilemodel1);
			
			driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
			Thread.sleep(2000);
			   String parentwindows = driver.getWindowHandle();
			driver.findElement(By.xpath("//a[contains(text(), 'Samsung Galaxy J2 Pro (Gold, 16 GB)')][1]")).click();			
	        Set<String> allwindows=driver.getWindowHandles();
	        for(String a:allwindows) {
	        	if(!parentwindows.equals(a)) {
	        driver.switchTo().window(a);
	        	}
	        
	        } 
	   	 driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	   	
	//item2
		driver.findElement(By.name("q")).sendKeys (mobilemodel2);
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(2000);
		   parentwindows = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(), 'Samsung Galaxy J3 Pro (Gold, 16 GB)')]")).click();
		
	    
       
       Set<String> allwindow=driver.getWindowHandles();
       for(String a:allwindow) {
       	if(!parentwindows.equals(a)) {
       driver.switchTo().window(a);
       	}
       
       }
  	 driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();	
  	//item3
  	driver.findElement(By.name("q")).sendKeys (mobilemodel3);
	driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	Thread.sleep(2000);
	   parentwindows = driver.getWindowHandle();
	driver.findElement(By.xpath("//a[@title='Apple iPhone X (Silver, 64 GB)']")).click();
	
    
   
   Set<String> allw=driver.getWindowHandles();
   for(String a:allw) {
   	if(!parentwindows.equals(a)) {
   driver.switchTo().window(a);
   	}
   
   }
   driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
   //item4
   driver.findElement(By.name("q")).sendKeys (mobilemodel4);
	driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	Thread.sleep(2000);
	   parentwindows = driver.getWindowHandle();
	driver.findElement(By.xpath("//a[@title='Apple iPhone X (Silver, 256 GB)']")).click();
	
  Set<String> all=driver.getWindowHandles();
  for(String a:all) {
  	if(!parentwindows.equals(a)) {
  driver.switchTo().window(a);
  	}
  
  }
  driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
  //iteam5
  driver.findElement(By.name("q")).sendKeys (mobilemodel5);
	driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	Thread.sleep(2000);
	   parentwindows = driver.getWindowHandle();
	driver.findElement(By.xpath("//a[@title='Usha EI 1602 Dry Iron']")).click();
	
Set<String> al=driver.getWindowHandles();
for(String a:al) {
	if(!parentwindows.equals(a)) {
driver.switchTo().window(a);
	}
}
driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	}
		
	

	@Then("^user add the selected phone model in the cart$")
	public void user_add_the_selected_phone_model_in_the_cart() throws Throwable {
		Assert.assertEquals("MY CART (5)",driver.findElement(By.xpath("//span[@class='_1WMqsr']")).getText());
	  
	}


}
