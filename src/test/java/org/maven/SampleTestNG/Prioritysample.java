package org.maven.SampleTestNG;

import org.testng.annotations.Test;

public class Prioritysample {
	@Test(priority = 2)
	private void tc1() {
		System.out.println("tc1");

	}

	@Test(priority = 1)
	private void tc2() {
		System.out.println("tc2");

	}

	@Test(priority = 4, invocationCount = 5)
	private void tc3() {
		System.out.println("tc3");

	}

	@Test(priority = 3, invocationCount = 2)
	private void tc4() {
		System.out.println("tc4");

	}

	@Test
	private void tc5() {
		System.out.println("tc5");

	}

}
