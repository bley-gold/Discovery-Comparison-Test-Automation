### Discovery Comparison Automation
This repository contains a Selenium-based automation script that compares medical aid plans on the Discovery website. The script performs a series of tests to validate the accuracy of plan details against predefined data stored in an Excel file.

### Features
Web Automation: Uses Selenium WebDriver to automate interactions with the Discovery medical aid comparison page.
Data Verification: Compares the text of specific web elements to data stored in an Excel file.
Excel Integration: Reads from and writes results to an Excel file using custom utility classes.
Plan Comparison: Validates multiple scenarios for different medical aid plans including Executive Plan, Classic Comprehensive Plan, and Essential Delta Core Plan.

### Prerequisites
Java Development Kit (JDK)
Selenium WebDriver
Firefox and Geckodriver
Apache POI (for Excel file manipulation)
An Excel file with predefined test data

![Screenshot 1](https://github.com/bley-gold/Discovery-Comparison-Test-Automation/blob/master/Screenshot%202024-06-03%20204147.png)

### Usage
Set up Excel File: Ensure your Excel file is set up with the correct path and sheet name.
WebDriver Setup: Update the path to geckodriver in the script.
Run the Script: Execute the main method in the DiscoveryComparison class.
Script Details
WebDriver Initialization: Sets up FirefoxDriver with a WebDriverWait for handling dynamic web elements.
Cookie Acceptance: Automates the acceptance of cookies on the webpage.
Scrolling and Clicking: Uses JavaScript to scroll the page and interacts with plan options via XPath and CSS selectors.
Data Validation: Extracts text from specific elements and compares it with data from the Excel file. Writes the comparison results back to the Excel file.

![Screenshot 2]()https://github.com/bley-gold/Discovery-Comparison-Test-Automation/blob/master/Screenshot%202024-06-03%20204353.png

### Testing
This script performs functional testing by comparing the displayed details of different medical aid plans against expected values stored in an Excel file. Each test scenario's result is recorded in the same Excel file, providing a clear overview of pass/fail statuses.
