package com.testng;

import org.testng.annotations.Test;

public class TestcaseGrouping {
	@Test(groups="Regression")
	public void Testcaseone() {
		System.out.println("It is in Regression group -Testcaseone");
	}

	@Test(groups="Regression")
	public void Testcasetwo() {
		System.out.println("It is in Regression group -Testcasetwo");
	}
	
	@Test(groups={"smoke","sanity"})
	public void Testcasethree() {
		System.out.println("It is in smoke group -Testcasethree");
	}
	
	@Test(groups="sanity")
	public void Testcasefour() {
		System.out.println("It is in smoke group -TestcaseFour");
	}
	
	
}
