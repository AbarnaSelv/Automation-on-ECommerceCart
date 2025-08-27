package com.ab.cart.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
			String reportPath = System.getProperty("user.dir") + "/reports/extent-report.html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
			reporter.config().setReportName("Demo Web Shop Automation Report");
			reporter.config().setDocumentTitle("Automation Test Results");

			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Abarna");
			extent.setSystemInfo("Browser", "Chrome");
		}
		return extent;
	}
}
