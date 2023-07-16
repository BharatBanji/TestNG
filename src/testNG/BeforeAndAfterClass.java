package testNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAndAfterClass {

	
	//create a many methods 
	@BeforeClass
	public void sum() {
		System.out.println("i'm first case in BeforeMethod ");	
	}
	
    @AfterClass
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
