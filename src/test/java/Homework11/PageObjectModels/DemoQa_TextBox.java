package Homework11.PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;

public class DemoQa_TextBox {

    WebDriver driver;
   // WebDriverWait wait;

    By fullNameTextField = By.xpath("//input[@id='userName']");
    By namePresented = By.xpath("//p[@id='name']");
    By emailTextField = By.cssSelector("input#userEmail");
    By emailPresented = By.cssSelector("p#email");
    By currentAddressTextField = By.xpath("//textarea[@id='currentAddress']");
    By permanentAddressTextField = By.cssSelector("#permanentAddress");
    By submitButton = By.xpath("//button[@id='submit']");

    public DemoQa_TextBox(WebDriver driver) {
        this.driver = driver;
    }

    public void setFullNameTextField(String username) {
        driver.findElement(fullNameTextField).clear();
        driver.findElement(fullNameTextField).sendKeys(username);

    }

    public void setEmailTextField(String email) {
        driver.findElement(emailTextField).clear();
        driver.findElement(emailTextField).sendKeys(email);
    }

    public void setCurrentAddressTextField(String currentAddress) {
        driver.findElement(currentAddressTextField).clear();
        driver.findElement(currentAddressTextField).sendKeys(currentAddress);

    }

    public void setPermanentAddressTextField(String permanentAddress) {
        driver.findElement(permanentAddressTextField).clear();
        driver.findElement(permanentAddressTextField).sendKeys(permanentAddress);

    }

    public void clickSubmitButton() {

        ExpectedConditions.visibilityOfElementLocated(submitButton);
//        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(submitButton).click();


    }

    public void namePresented() {

        assertTrue(driver.findElement(namePresented).isDisplayed());
    }

    public void emailPresented() {

        ExpectedConditions.visibilityOfElementLocated(emailPresented);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(emailPresented)).isDisplayed();
        assertTrue(driver.findElement(emailPresented).isDisplayed());
    }



}
