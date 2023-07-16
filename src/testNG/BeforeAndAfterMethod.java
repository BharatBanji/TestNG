package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {

	
	//create a many methods 
	@BeforeMethod
	public void sum() {
		System.out.println("i'm first case in BeforeMethod ");	
	}
	
    @AfterMethod 
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
