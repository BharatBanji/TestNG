package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleBrowser {
  
	public WebDriver driver;
	
	
	// create a method
	@Test
	public void Google() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String a=driver.getTitle();
		System.out.println(a);
		driver.close();
	  }
	@Test
	public void Facebook() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String a=driver.getTitle();
		System.out.println(a);
		driver.close();
	  }
	@Test
	public void Amazon() {
		driver=new ChromeDriver();
		driver.get("https://www.Amazon.com/");
		String a=driver.getTitle();
		System.out.println(a);
		driver.close();
	  }
	
	@Test	
	public void Flipkart() {
		driver=new ChromeDriver();
		driver.get("https://www.Flipkart.com/");
		String a=driver.getTitle();
		System.out.println(a);
		driver.close();
	  }
	
	@Test
	public void Myntra() {
		driver=new ChromeDriver();
		driver.get("https://www.Myntra.com/");
		String a=driver.getTitle();
		System.out.println(a);
		driver.close();
	  }
}
