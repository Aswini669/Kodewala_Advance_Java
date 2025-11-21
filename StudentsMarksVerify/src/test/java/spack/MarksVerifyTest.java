package spack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MarksVerifyTest 
{
	MarksVerify marksVerify;
	
	@Before
	public void setup() {
		System.out.println("object has creayed...");
		marksVerify = new MarksVerify();
	}
	
	@After
	public void tearDown() {
		System.out.println("cleaning up object...");
	}
	
	@Test
	public void testMarksAbove30() {
		System.out.println("test execution started...");
		String expect = "D";
		String actual = marksVerify.verifyGrades(31);
		assertEquals(expect,actual);
		
	}
	
	@Test
	public void testMarksAbove65() {
		System.out.println("test execution started...");
		String expect = "C";
		String actual = marksVerify.verifyGrades(66);
		assertEquals(expect, actual);
	}
	
	@Test
	public void testMarksAbove80() {
		System.out.println("test execution started...");
		String expect = "B";
		String actual = marksVerify.verifyGrades(83);
		assertEquals(expect, actual);
	}
	
	@Test
	public void testMarksAbove90() {
		System.out.println("test execution started...");
		String expect = "A";
		String actual = marksVerify.verifyGrades(96);
		assertEquals(expect, actual);
	}
	
	@Test
	public void testMarksLess30() {
		System.out.println("test execution started...");
		String expect = "F";
		String actual = marksVerify.verifyGrades(21);
		assertEquals(expect, actual);
	}
	
	
}
