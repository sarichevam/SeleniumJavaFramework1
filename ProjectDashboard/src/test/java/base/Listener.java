package base;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	public void onTestStart(ITestResult result) {
	
	}
	
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test stops here, because it failed.");
		
		
		
	}
	public void onTestSuccess(ITestResult result) {
		
		
		
	}
	
	
	public void onTestSkipped(ITestResult result) {
		
		
	
	}
	
	

}
