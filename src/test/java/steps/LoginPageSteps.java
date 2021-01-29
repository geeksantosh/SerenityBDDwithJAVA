package steps;

import UIpages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps {
    public LoginPage loginPage;

    @Step
     public void isOnLoginPage(){
        loginPage.open();

    }

    @Step
    public void loginAsUser(){
        loginPage.doLogin();
    }

    @Step
    public void userShouldBeLogin(){
        Assert.assertTrue(loginPage.accountPageIsVisible().equals("MY ACCOUNT"));
    }
}
