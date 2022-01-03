package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiTesDependency {
	
	@Test
	public void start() {
		System.out.println("Starting the server");
	}
	
	@Test(dependsOnMethods="start")
	public void preprocessing() {
		System.out.println("Pre-processing the data");
	}
	
	@Test(dependsOnMethods="preprocessing")
	public void processing() {
		Assert.assertTrue(false);
		System.out.println("processing the data");
	}
	
	@Test(dependsOnMethods="processing")
	public void stop() {
		System.out.println("Stop the server");
	}

}
