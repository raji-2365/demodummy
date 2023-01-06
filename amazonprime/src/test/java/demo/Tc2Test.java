package demo;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(dummy.Listner.class)
public class Tc2Test {
	@Test
	public void m2() {
		Reporter.log("tc2 running");
	}
}
