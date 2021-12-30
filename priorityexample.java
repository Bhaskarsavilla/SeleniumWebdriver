package com.testng;

import org.testng.annotations.Test;

public class priorityexample {
	@Test
	public void select1() {
		System.out.println("this is first ");
	}
	@Test
	public void select2() {
		System.out.println("this is second ");
	}
	@Test (priority=1)
	public void select3() {
		System.out.println("this is third ");
	}
	@Test(priority=2)
	
	public void select4() {
		System.out.println("this is fourth");
	}
	@Test
	public void select5() {
		System.out.println("this is fifth");
	}

}
