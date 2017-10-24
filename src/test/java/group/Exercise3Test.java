package test.java.group;

import org.junit.Test;
import static org.junit.Assert.*;

import main.java.group.Exercise3;

public class Exercise3Test {
	@Test
	public void testTriNumberSeq0(){
		assertEquals(Exercise3.triangularNumberSeq(0), 0);
	}
	@Test
	public void testTriNumberSeq1(){
		assertEquals(Exercise3.triangularNumberSeq(1), 1);
	}
	@Test
	public void testTriNumberSeq10(){
		assertEquals(Exercise3.triangularNumberSeq(10), 55);
	}
	
	@Test
	public void testLazySeq0(){
		assertEquals(Exercise3.lazySeq(0), 1);
	}
	
	@Test
	public void testLazySeq1(){
		assertEquals(Exercise3.lazySeq(1), 2);
	}
	
	@Test
	public void testLasySeq10(){
		assertEquals(Exercise3.lazySeq(10), 56);
	}
}