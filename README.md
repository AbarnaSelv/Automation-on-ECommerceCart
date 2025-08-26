# 🛒 ECommerceCartAutomation

**ECommerceCartAutomation** is a Selenium + TestNG based automation framework designed for testing the end-to-end flow of an **E-Commerce web application**.  
The project covers login, adding products to the cart, performing checkout, verifying order success, and logging out, with integrated **screenshot capture, reporting, and listeners** for detailed execution tracking.

---

## 🚀 Features
- ✅ Page Object Model (POM) design pattern for clean separation of logic  
- ✅ TestNG framework for test management  
- ✅ WebDriverManager for automatic driver handling  
- ✅ Utility classes for **screenshots** and reusable methods  
- ✅ TestNG Listeners for logging, reporting, and screenshot capture on pass/failure  
- ✅ Extent Reports integration for professional HTML reports  
- ✅ TestNG HTML reports (`test-output`)  
- ✅ Git-friendly with `.gitignore` included  

---

## 📂 Project Structure

ECommerceCartAutomation

src/main/java
    com.ab.cart.base
        BaseTest.java
        DriverFactory.java
        ExtentManager.java
        ScreenshotUtils.java
        TestListener.java

    com.ab.cart.pages
        BasePage.java
        CartPage.java
        CheckoutPage.java
        HomePage.java
        LoginPage.java

src/test/java
    com.ab.cart.tests
        CartTest.java
        CheckoutTest.java
        HomePageTest.java
        LoginTest.java

reports
    (Extent report output)

screenshots
    (Captured screenshots)

test-output
    (Default TestNG reports)

pom.xml
    (Maven dependencies & build file)

testng.xml
    (TestNG suite configuration)

.gitignore
    → Git ignore file


 



---

## 🛠️ Tech Stack
- **Java 17** (JDK 17)  
- **Selenium WebDriver**  
- **TestNG** (7.11.0)  
- **Maven** (Build & dependency management)  
- **WebDriverManager** (Driver auto-management)  
- **ExtentReports** (Advanced HTML reporting)  
- **Apache Commons IO** (File handling for screenshots)  

---

## 📊 Reports & Screenshots
- **TestNG Reports** → Generated inside `test-output/` (`index.html`, `emailable-report.html`)  
- **ExtentReports** → Stored inside `reports/` with detailed execution logs  
- **Screenshots** → Captured automatically for **both passed & failed tests** inside `screenshots/`  

---

## ▶️ How to Run
1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/ECommerceCartAutomation.git
   cd ECommerceCartAutomation

2. Run tests with Maven:

   mvn clean test

3. View reports:

   TestNG default report → test-output/index.html  
   Extent Report → reports/ExtentReport.html  
   Screenshots → screenshots/

## ▶️ Git Setup

This project includes a .gitignore to avoid pushing unnecessary files:

   test-output/  
   reports/  
   screenshots/  
   .idea/, .classpath, .project  
   target/

## ▶️ 📖 Summary

This project demonstrates a scalable automation testing framework with:

   • Full E-commerce flow coverage (Login → Add to Cart → Checkout → Order Verification → Logout)  
   • Advanced reporting with ExtentReports + TestNG Reports  
   • Automatic screenshot capture for better debugging  
   • Professional coding practices using Page Object Model (POM) and utilities for reusability
   