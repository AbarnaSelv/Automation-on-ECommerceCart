package com.ab.cart.base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ab.cart.pages.BasePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.openqa.selenium.WebDriver;

public class TestListener implements ITestListener {
	ExtentReports extent = ExtentManager.getInstance();
	ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
		test.set(extentTest);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Object testClass = result.getInstance();
		WebDriver driver = ((BaseTest) testClass).driver;

		ScreenshotUtils.takeScreenshot(driver, result.getName());
		System.out.println("Screenshot captured for failed test: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Object testClass = result.getInstance();
		WebDriver driver = ((BaseTest) testClass).driver;
		ScreenshotUtils.takeScreenshot(driver, result.getName());
		System.out.println("Screenshot captured for passed test: " + result.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
