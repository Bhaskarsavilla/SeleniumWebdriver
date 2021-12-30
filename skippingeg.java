package com.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skippingeg {
	@Test
	public void testone() {
		System.out.println("this is the test one ");
	}
@Test
	public void testtwo() {
		System.out.println("this is the test two ");
	}

@Test(enabled=false)
	public void testthree() {
		System.out.println("this is the test three");
	}
@Test
	public void testfour() {
		System.out.println("this is the test four ");
		throw new SkipException("skipping this test because itis incomplete");
	}

}
