package testNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@listeners (package name and class name .class) initialization
@Listeners(testNG.ListenerTestNG.class)
public class CallingListenerTestNG {

	@Test
	public void divide() {
		System.out.println("testNG override method testing : ");
		int a=100,b=0, c;
		c=a/b;
		System.out.println(c);
	}
}
