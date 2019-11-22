package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\induja udhayak\\Javascriptexecutor\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
	WebElement down = driver.findElement(By.xpath("//label[text()='Email or Phone']"));
	String s = down.getText();
	System.out.println(s);
	WebElement pass = driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]"));
	pass.sendKeys("235465669");	
	String t = pass.getAttribute("data-testid");
	System.out.println(t);
	//WebElement button = driver.findElement(By.xpath("//input[@value='Log In']"));
	//button.click();
	WebElement p = driver.findElement(By.xpath("(//span[@class='_5k_2 _5db'])[2]"));
	p.click();
	
	
//	js.executeScript("arguments[0].scrollIntoView(true)",down);	
//		
//	WebElement up = driver.findElement(By.xpath("COURSES"));
//	js.executeScript("arguments[0].scrollIntoview(false)",up);
//	
//	driver.manage().window().maximize();	
//		
		
		
		
		
		
		
	}

}
