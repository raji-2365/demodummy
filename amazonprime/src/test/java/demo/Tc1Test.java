package demo;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(dummy.Listner.class)
public class Tc1Test {
	@Test
	public void m1() {
		Reporter.log("tc1 running");
	}

}
