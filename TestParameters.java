package com.testng;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
	@Parameters("browser")
	@Test
	public void Testone(String browser) {
		System.out.println("browser passed as :-"+browser);
	}
	
	@Parameters({"username" ,"password"})
	@Test
	public void Testtwo(String username , String password) {
		System.out.println("Parameter for Username :-"+username);
		System.out.println("Parameter for password :-"+password);
	}

	
}
