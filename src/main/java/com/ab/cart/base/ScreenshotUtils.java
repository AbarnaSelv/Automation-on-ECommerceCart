package com.ab.cart.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

	public static String takeScreenshot(WebDriver driver, String testName) {

		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		String folderPath = "test-output/screenshots/";
		String fileName = testName + "_" + timestamp + ".png";
		String fullPath = folderPath + fileName;

		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File(fullPath);

			destFile.getParentFile().mkdirs();

			FileUtils.copyFile(src, destFile);
			System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());

		} catch (IOException e) {
			e.printStackTrace();
		}

		return fullPath;
	}
}
