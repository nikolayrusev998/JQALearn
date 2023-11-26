package Homework11.Tests;

import Homework11.Helpers.Hooks;
import Homework11.PageObjectModels.DemoQa_TextBox;
import org.junit.Test;

public class DemoQaTextBoxTests extends Hooks {

    DemoQa_TextBox textBoxPage;

    @Test
    public void isNamePresented() {
        textBoxPage = new DemoQa_TextBox(driver);

        textBoxPage.setFullNameTextField("Random Randomov");
        textBoxPage.waitForLoginButton();
        textBoxPage.clickSubmitButton();
        textBoxPage.namePresented();
    }

    @Test
    public void IsEmailPresented() {
        textBoxPage = new DemoQa_TextBox(driver);

        textBoxPage.setEmailTextField("randomrandomov@random.com");
        textBoxPage.waitForLoginButton();
        textBoxPage.clickSubmitButton();
        textBoxPage.emailPresented();

    }
}
