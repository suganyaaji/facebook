package com.google.meet;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Iretry_Listentingfailed implements IRetryAnalyzer {
int failedcount=0;
int limit=4;

	@Override
	public boolean retry(ITestResult result) {
		
		if (failedcount<limit) {
			failedcount++;
			return true;
			
		}
		return false;
	}

}
