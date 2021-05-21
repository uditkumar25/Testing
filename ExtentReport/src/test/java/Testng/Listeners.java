package Testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Pass one"+result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Failed one"+result.getName());
	}

	}
