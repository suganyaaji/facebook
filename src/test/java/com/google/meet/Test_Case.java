package com.google.meet;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case {
	@Test
	   private void Testcase() {
System.out.println(" run successfully");
Assert .assertEquals(true, true);
	}
	@Test
	private void Testcase1() {
System.out.println("failed");
Assert.assertEquals(true, false);
	}

}
