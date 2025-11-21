package calculator.JunitCheckSubNumber;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubTwoNumbersTest 
{
	static SubTwoNumbers stn;
	
	@BeforeClass
	public static void setup() {
		System.out.println("creating object.....");
		stn = new SubTwoNumbers(); 
	}
	
	@AfterClass
	public static void cleanup() {
		System.out.println("cleaning up obbject.....");
		stn = null;
	}
	
	@Test
	public void testSubTwoNumber() {
		System.out.println("executing the tests..");
		
		int expect = 5;
		int actual = stn.sunTwoNumber(10, 5);
		assertEquals(expect,actual);
	}
}
