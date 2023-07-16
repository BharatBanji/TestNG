package testNG;

import org.testng.annotations.Test;

public class Grouping {

	// there are Maine grouping in real life example
	//college
	//Society
	//Family
	//office
	//tuition
	
	
	//this is the college group
	@Test(groups= {"Bharat","Sagar","Kunal","Aarohi","Maahi"})
	public void College() {
		System.out.println("this is a young guneration aduilt motivate in your life ");
	}
	
	
	//this is a flipkart group
	@Test(groups= {"Bharat","Sagar","Kunal","Maahi"})
	public void Flipkart() {
		System.out.println("this is online shopping in your house ");
	}
	
	
	//this is a amazon group
	@Test(groups= {"Bharat","Sagar","Aarohi","Maahi"})
	public void Amazon() {
		System.out.println("this is a second option of the online shipping in your house");
	}
	
	
	//this is a motivation group 
	@Test(groups= {"Bharat","Aarohi","Maahi"})
	public void Bindragroup() {
		System.out.println("this is a aduilt motivate speach in your life ");
	}
	
	
	
	// this is a family group
	@Test(groups= {"Bharat","Sagar"})
	public void Home() {
		System.out.println("my family ");
	}
	
	
	
	//this is big faimly
	@Test(groups= {"Bharat","Sagar","Kunal","Aarohi","Maahi"})
	public void Grandfather() {
		System.out.println(" a bigest family ");
	}
	
	//there are Maine method create is a testNG package 
}
