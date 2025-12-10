package LocatorsandBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
	public static void main(String[] args) throws InterruptedException  {

    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();

    	driver.get("https://lms2.ai.saveetha.in/login/index.php");
    	driver.findElement(By.cssSelector("#username")).sendKeys("22008950");
    	driver.findElement(By.cssSelector("#password")).sendKeys("8950");
    	Thread.sleep(5000); 
    	driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg")).click();
    	System.out.println("login success");
	}


}