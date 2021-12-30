package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	@Test
	public void selec1() {
		System.out.println("this is first ");
		Assert.assertEquals("Facebook", "Facebook");
	}
	@Test
	public void selec2() {
		System.out.println("this is second ");
		Assert.assertEquals(404, 200);
	}
	@Test
	public void selec3() {
		System.out.println("this is third ");
		Assert.assertTrue(true);
	}
	@Test
	
	public void selec4() {
		System.out.println("this is fourth");

	}
	@Test
	public void selec5() {
		System.out.println("this is fifth");
	}
}
