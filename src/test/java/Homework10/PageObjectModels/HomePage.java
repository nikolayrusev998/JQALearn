package Homework10.PageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
    WebDriver driver;


    @FindBy(how = How.XPATH, using = "//input[@id='userName']")
    private WebElement fullNameTextField;

    @FindBy(xpath = "//p[@id='name']")
    private WebElement namePresented;

    @FindBy(css = "input#userEmail")
    private WebElement emailTextField;

    @FindBy(css = "p#email")
    private WebElement emailPresented;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddressTextField;

    @FindBy(css = "#permanentAddress")
    private WebElement permanentAddressTextField;

    @FindBy(how = How.XPATH, using = "//button[@id='submit']")
    private WebElement submitButton;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterFullName(String username) {
        fullNameTextField.clear();
        fullNameTextField.sendKeys(username);
    }

    public void enterEmail(String email) {
        emailTextField.clear();
        emailTextField.sendKeys(email);

    }

    public HomePage enterCurrentAddress(String currentAddress) {
        currentAddressTextField.clear();
        currentAddressTextField.sendKeys(currentAddress);
        return this;

    }

    public HomePage enterPermanentAddress(String permanentAddress) {
        permanentAddressTextField.clear();
        permanentAddressTextField.sendKeys(permanentAddress);
        return this;
    }

    public HomePage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public HomePage namePresented() {
        Assert.assertTrue(namePresented.isDisplayed());
        return this;

    }

    public HomePage emailPresented() {
        Assert.assertTrue(emailPresented.isDisplayed());
        return this;

    }
}
