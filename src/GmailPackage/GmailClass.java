package GmailPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailClass {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://gmail.com");
		d.findElement(By.id("identifierId")).sendKeys("");
		d.findElement(By.className("CwaK9")).click();
		Thread.sleep(3000);
		d.findElement(By.name("password")).sendKeys("");
		d.findElement(By.className("RveJvd snByac")).click();
		
	


	}

}
