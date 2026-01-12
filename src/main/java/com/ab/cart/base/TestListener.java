package com.ab.cart.base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListener implements ITestListener {

	ExtentReports extent = ExtentManager.getInstance();
	ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
		test.set(extentTest);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		WebDriver driver = ((BaseTest) result.getInstance()).driver;

		String screenshotPath = ScreenshotUtils.takeScreenshot(driver, result.getName());


		test.get()
		.pass("Test Passed")
		.addScreenCaptureFromPath(new File(screenshotPath).getAbsolutePath());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = ((BaseTest) result.getInstance()).driver;

		String screenshotPath = ScreenshotUtils.takeScreenshot(driver, result.getName());

		test.get()
		.fail("Test Failed")
		.addScreenCaptureFromPath(new File(screenshotPath).getAbsolutePath());
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
