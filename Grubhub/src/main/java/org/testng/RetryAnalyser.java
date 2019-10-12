package org.testng;

public class RetryAnalyser implements IRetryAnalyzer {
	
	int mincount=0;
	int maxcount=5;
	public boolean retry(ITestResult arg0) {
		
		if (mincount<maxcount) {
			mincount++;
			return true;
		}
		return false;
	}
	

}	
