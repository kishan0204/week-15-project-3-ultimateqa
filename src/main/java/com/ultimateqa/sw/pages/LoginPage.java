package com.ultimateqa.sw.pages;


import com.aventstack.extentreports.Status;
import com.ultimateqa.sw.customlisteners.CustomListeners;
import com.ultimateqa.sw.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//header/div[2]/div[1]/nav[1]/ul[1]/li[1]")
    WebElement signInLink;

    //By signInLink = By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[1]");
    //* Verify the text ‘Welcome Back!’
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome Back!')]")
    WebElement textMessage;
    //By textMessage = By.xpath("//h2[contains(text(),'Welcome Back!')]");

    public void clickOnSignInLink() {
        Reporter.log("Click on login button"+signInLink);
        clickOnElement(signInLink);
        CustomListeners.test.log(Status.PASS,"Click on loginButton");
    }

    public String verifyTextMessage() {
        String message=getTextFromElement(textMessage);
        return message;


    }

}
