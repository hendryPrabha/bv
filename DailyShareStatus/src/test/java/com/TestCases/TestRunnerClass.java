package com.TestCases;

import org.testng.annotations.Test;

public class TestRunnerClass extends BaseClass {
@Test
	public void getStockDetails() {
		
		String title=driver.getTitle();
		System.out.println(title);
	}
}
