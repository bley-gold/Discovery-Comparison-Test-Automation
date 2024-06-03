package DiscoveryComparison;

import ExcelUtils.Constants;
import ExcelUtils.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DiscoveryComparison {
    public static void main(String[] args) throws Exception {
        ExcelUtil.setExcelFile(Constants.Path_TestData + Constants.File_TestData, Constants.Sheet_Name);

        // Set up WebDriver
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Testing 101\\Selenium\\Gecko Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String baseURL = "https://www.discovery.co.za/medical-aid/compare-medical-aid-plans";
        driver.get(baseURL);

        // Accept Cookies
        WebElement acceptCookie = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
        acceptCookie.click();

        // Scroll down the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600);");

        WebElement Option1 = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div[1]/div/div[1]/div/a"));
        Option1.click();


        WebElement executivePlan = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div[1]/div/div[1]/div/ul/li[1]/a"));
        executivePlan.click();

        WebElement Option2 = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div[2]/div/div[1]/div/a"));
        Option2.click();

        WebElement classicComprehensive = driver.findElement(By.xpath("//*[@id=\"dropdown2\"]/li[2]/a"));
        classicComprehensive.click();

        WebElement Option3 = driver.findElement(By.cssSelector("a.active > span:nth-child(1)"));
        Thread.sleep(3000);
        Option3.click();

        WebElement essentialDeltaCore = driver.findElement(By.cssSelector("#dropdown3 > li:nth-child(20) > a:nth-child(1)"));
        essentialDeltaCore.click();

        //FOR FIRST 2 "EXECUTIVE PLAN" SCENARIOS
        WebElement Ep1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[1]/div/div[2]/div/div[1]/h6"));
        WebElement Ep2 = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div[1]/div[2]"));

        if (Ep1.getText().equals(ExcelUtil.getCellData(4,6))){
            ExcelUtil.setCellData(Ep1.getText(),4,7);
            ExcelUtil.setCellData("Passed",4,8);
        }else {
            ExcelUtil.setCellData(Ep1.getText(),4,7);
            ExcelUtil.setCellData("Failed",4,8);
        }

        if (Ep2.getText().equals(ExcelUtil.getCellData(5,6))){
            ExcelUtil.setCellData(Ep2.getText(),5,7);
            ExcelUtil.setCellData("Passed",5,8);
        }else {
            ExcelUtil.setCellData(Ep2.getText(),5,7);
            ExcelUtil.setCellData("Failed",5,8);
        }



        //FOR FIRST 2 "Classic Comprehensive Plan" SCENARIOS
        WebElement Edc1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[2]/div/div[2]/div/div[1]/h6"));
        WebElement Edc2 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]"));

        if (Edc1.getText().equals(ExcelUtil.getCellData(23,6))){
            ExcelUtil.setCellData(Edc1.getText(),23,7);
            ExcelUtil.setCellData("Passed",23,8);
        }else {
            ExcelUtil.setCellData(Edc1.getText(),23,7);
            ExcelUtil.setCellData("Failed",23,8);
        }

        if (Edc2.getText().equals(ExcelUtil.getCellData(24,6))){
            ExcelUtil.setCellData(Edc2.getText(),24,7);
            ExcelUtil.setCellData("Passed",24,8);
        }else {
            ExcelUtil.setCellData(Edc2.getText(),24,7);
            ExcelUtil.setCellData("Failed",24,8);
        }

        js.executeScript("window.scrollBy(0, 700);");

        //FOR FIRST 2 "Executive plan" SCENARIOS
        WebElement Ep3 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div[2]"));
        WebElement Ep4 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div[2]"));
        WebElement Ep5 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div[4]/div[2]"));

        if (Ep3.getText().equals(ExcelUtil.getCellData(6,6))){
            ExcelUtil.setCellData(Ep3.getText(),6,7);
            ExcelUtil.setCellData("Test Passed",6,8);

        }else {
            ExcelUtil.setCellData(Ep3.getText(),6,7);
            ExcelUtil.setCellData("Failed",6,8);
        }

        if (Ep4.getText().equals(ExcelUtil.getCellData(7,6))){
            ExcelUtil.setCellData(Ep4.getText(),7,7);
            ExcelUtil.setCellData("Passed",7,8);
        }else {
            ExcelUtil.setCellData(Ep4.getText(),7,7);
            ExcelUtil.setCellData("Failed",7,8);
        }

        if (Ep5.getText().equals(ExcelUtil.getCellData(8,6))){
            ExcelUtil.setCellData(Ep5.getText(),8,7);
            ExcelUtil.setCellData("Passed",8,8);
        }else {
            ExcelUtil.setCellData(Ep5.getText(),8,7);
            ExcelUtil.setCellData("Failed",8,8);
        }

        //FOR 6 TO 8  "Executive plan" SCENARIOS
        WebElement Ep6 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div[5]/div[2]"));
        WebElement Ep7 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div[6]/div[2]"));
        WebElement Ep8 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div[7]/div[2]"));

        if (Ep6.getText().equals(ExcelUtil.getCellData(9,6))){
            ExcelUtil.setCellData(Ep6.getText(),9,7);
            ExcelUtil.setCellData("Passed",9,8);
        }else {
            ExcelUtil.setCellData(Ep6.getText(),9,7);
            ExcelUtil.setCellData("Failed",9,8);
        }

        ExcelUtil.setCellData(Ep7.getText(),10,7);
        ExcelUtil.setCellData("Passed",10,8);

        if (Ep8.getText().equals(ExcelUtil.getCellData(11,6))){
            ExcelUtil.setCellData(Ep8.getText(),11,7);
            ExcelUtil.setCellData("Passed",11,8);
        }else {
            ExcelUtil.setCellData(Ep8.getText(),11,7);
            ExcelUtil.setCellData("Failed",11,8);
        }

        //FOR 6 TO 8  "Classic Comprehensive Plan" SCENARIOS
        WebElement Cc6 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[5]/div[2]"));
        WebElement Cc7 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[6]/div[2]"));
        WebElement Cc8 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[7]/div[2]"));
        WebElement Cc9 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[8]/div[2]"));

        if (Cc6.getText().equals(ExcelUtil.getCellData(18,6))){
            ExcelUtil.setCellData(Cc6.getText(),18,7);
            ExcelUtil.setCellData("Passed",18,8);
        }else {
            ExcelUtil.setCellData(Cc6.getText(),18,7);
            ExcelUtil.setCellData("Failed",18,8);
        }

        if (Cc7.getText().equals(ExcelUtil.getCellData(19,6))){
            ExcelUtil.setCellData(Cc7.getText(),19,7);
            ExcelUtil.setCellData("Passed",19,8);
        }else {
            ExcelUtil.setCellData(Cc7.getText(),19,7);
            ExcelUtil.setCellData("Failed",19,8);
        }

        if (Cc8.getText().equals(ExcelUtil.getCellData(20,6))){
            ExcelUtil.setCellData(Cc8.getText(),20,7);
            ExcelUtil.setCellData("Passed",20,8);
        }else {
            ExcelUtil.setCellData(Cc8.getText(),20,7);
            ExcelUtil.setCellData("Failed",20,8);
        }

        if (Cc9.getText().equals(ExcelUtil.getCellData(21,6))){
            ExcelUtil.setCellData(Cc9.getText(),21,7);
            ExcelUtil.setCellData("Passed",21,8);
        }else {
            ExcelUtil.setCellData(Cc9.getText(),21,7);
            ExcelUtil.setCellData("Failed",21,8);
        }

        //FOR 6 "Essential Delta Core Plan" SCENARIO
        WebElement Edc6 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/div[3]/div/div[2]/div/div[2]/div[5]/div[2]"));

        if (Edc6.getText().equals(ExcelUtil.getCellData(28,6))){
            ExcelUtil.setCellData(Edc6.getText(),28,7);
            ExcelUtil.setCellData("Passed",28,8);
        }else {
            ExcelUtil.setCellData(Edc6.getText(),28,7);
            ExcelUtil.setCellData("Failed",28,8);
        }

    }
}
