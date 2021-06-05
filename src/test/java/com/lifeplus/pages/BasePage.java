package com.lifeplus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {



    @FindBy(css = ".popup-button.login-button")
    WebElement popUpLoginButton;

    @FindBy(xpath = "(//input[@name='user-name'])[2]")
    WebElement username;

    @FindBy(xpath = "(//input[@name='password'])[2]")
    WebElement password;

    @FindBy(xpath = "(//span[@class='iconbutton-text'])[2]")
    WebElement Login;




}
