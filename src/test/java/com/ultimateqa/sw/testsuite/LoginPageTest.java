package com.ultimateqa.sw.testsuite;



import com.ultimateqa.sw.customlisteners.CustomListeners;
import com.ultimateqa.sw.pages.LoginPage;
import com.ultimateqa.sw.pages.VerifyMessagePage;
import com.ultimateqa.sw.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    VerifyMessagePage verifyMessagePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        verifyMessagePage = new VerifyMessagePage();
    }

    @Test (groups =   { "sanity" , "regression"})
    public void userShouldNavigateToLoginPageSuccessfully(){
        loginPage.clickOnSignInLink();
        loginPage.verifyTextMessage();

    }
    @Test (groups =   { "smoke" , "regression"})
    public void verifyTheErrorMessage(){
        loginPage.clickOnSignInLink();
        verifyMessagePage.enterUserIdField("kishan_0204@yahoo.co.in");
        verifyMessagePage.enterPasswordField("Vivek241990");
        verifyMessagePage.clickOnSingIn();
        verifyMessagePage.verifyTextMessage();


    }


}