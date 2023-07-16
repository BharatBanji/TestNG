package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAndAfterSuite {

	
	//create a many methods 
	@BeforeSuite
	public void sum() {
		System.out.println("i'm first case in BeforeMethod ");	
	}
	
    @AfterSuite 
		public void Equal() {
		System.out.println("i'm first case in AfterMethod ");	
	}
    
    @Test
	public void Multiple() {
		System.out.println("i'm first case in test 1 : ");	
	}
    
    @Test
	public void Divide() {
		System.out.println("i'm first case in test 2 : ");	
	}
    
    @Test
	public void Subtrect() {
		System.out.println("i'm first case in test 3 : ");	
	}
    
    @Test
	public void Persentage() {
		System.out.println("i'm first case in test 4 : ");	
	}
    
    @Test
	public void Mod() {
		System.out.println("i'm first case in test 5 : ");	
	}

}
