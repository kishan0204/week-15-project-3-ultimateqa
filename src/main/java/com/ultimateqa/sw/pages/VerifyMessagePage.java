package com.ultimateqa.sw.pages;



import com.aventstack.extentreports.Status;
import com.ultimateqa.sw.customlisteners.CustomListeners;
import com.ultimateqa.sw.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class VerifyMessagePage extends Utility {

    @CacheLookup
            @FindBy(xpath="//input[@type='email']")
    WebElement userIdField;
   // By userIdField = By.xpath("//input[@type='email']");
    @CacheLookup
           @FindBy(xpath="//input[@type='password']")
    WebElement passwordField;
    //By passwordField=By.xpath("//input[@type='password']");
    @CacheLookup
            @FindBy(xpath="//button[contains(text(),'Sign in')]")
            WebElement signInField;
    //By signInField = By.xpath("//button[contains(text(),'Sign in')]");
    @CacheLookup
            @FindBy(xpath="//li[contains(text(),'Invalid email or password.')]")
    WebElement textMessage;
   // By textMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public void enterUserIdField (String username){
       Reporter.log("Enter username field"+username+"User field"+userIdField);
        sendTextToElement(userIdField , username);
        CustomListeners.test.log(Status.PASS,"User Id field"+username.toString());
    }
    public void enterPasswordField (String password){
        Reporter.log("Enter password field"+password+"password field"+passwordField);
        sendTextToElement(passwordField,password);
        CustomListeners.test.log(Status.PASS, "Your password is \"" + password.toString() + "\"");}
    public void clickOnSingIn(){
        Reporter.log("click on loging button" + signInField);
        clickOnElement(signInField);
        CustomListeners.test.log(Status.PASS,"click\""+"\"");
    }
    public String verifyTextMessage() {
        String verifyMessage = getTextFromElement(textMessage);
        return verifyMessage;
        //verifyTextFromElements(textMessage,"Invalid email or password.");}
    }


    }

