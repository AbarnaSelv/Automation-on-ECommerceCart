# ECommerceCartAutomation

ECommerceCartAutomation is a Selenium and TestNG based automation framework designed to validate the **end-to-end flow of an E-Commerce web application**.

The project covers core user journeys such as **login**, **adding products to cart**, **checkout**, **order verification**, and **logout**.  
It also includes **automatic screenshot capture**, **listeners**, and **reporting** to track execution details clearly.

---

## Features

- Page Object Model (POM) design for clean separation of test logic  
- TestNG framework for structured test execution  
- WebDriverManager for automatic browser driver handling  
- Utility classes for screenshots and reusable helper methods  
- TestNG Listeners for logging, reporting, and screenshot capture on pass and failure  
- Extent Reports integration for detailed HTML reports  
- TestNG default HTML reports inside `test-output`  
- Git-friendly setup with `.gitignore` included  

---

## Project Structure

- **ECommerceCartAutomation**
  - **src/main/java**
    - **com.ab.cart.base**
      - BaseTest.java  
      - DriverFactory.java  
      - ExtentManager.java  
      - ScreenshotUtils.java  
      - TestListener.java  
    - **com.ab.cart.pages**
      - BasePage.java  
      - CartPage.java  
      - CheckoutPage.java  
      - HomePage.java  
      - LoginPage.java  

  - **src/test/java**
    - **com.ab.cart.tests**
      - CartTest.java  
      - CheckoutTest.java  
      - HomePageTest.java  
      - LoginTest.java  

  - **reports/**  
    Extent report output  

  - **screenshots/**  
    Captured screenshots  

  - **test-output/**  
    Default TestNG reports  

  - **pom.xml**  
    Maven dependencies and build configuration  

  - **testng.xml**  
    TestNG suite configuration  

  - **.gitignore**  
    Git ignore configuration  

---

## Tech Stack

- **Java 17 (JDK 17)**
- **Selenium WebDriver**
- **TestNG (7.11.0)**
- **Maven** – build and dependency management  
- **WebDriverManager** – driver auto-management  
- **ExtentReports** – advanced HTML reporting  
- **Apache Commons IO** – file handling for screenshots  

---

## Reports & Screenshots

- **TestNG Reports**  
  Generated inside `test-output/`  
  Includes `index.html` and `emailable-report.html`

- **Extent Reports**  
  Stored inside `reports/` with detailed execution logs

- **Screenshots**  
  Automatically captured for both **passed and failed tests**  
  Stored inside `screenshots/`

---

## Summary

This project demonstrates a **scalable and maintainable automation framework** with:

- Complete E-commerce flow coverage  
  (Login → Add to Cart → Checkout → Order Verification → Logout)
- Advanced reporting using **Extent Reports** and **TestNG reports**
- Automatic screenshot capture for better debugging
- Clean and professional coding practices using **Page Object Model (POM)**

---

## Execution Video

Execution video of the automation run is available here:
[[Click here to watch the execution video]](https://drive.google.com/file/d/1hjDus1EO10qqK1ESgETwhy25kmrsSgeV/view?usp=sharing)

---

## Execution Screenshots

Execution screenshots are available inside the repository under the **ProjectDemo/** folder.

---

## How to Run

1. Open the project in **IntelliJ IDEA** or **Eclipse**
2. Open a terminal inside the project folder
3. Run:
