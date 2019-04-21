/**
 * Copyright (c) 2019 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By usernameTxt = By.xpath("xpath here");
    By passwordTxt = By.id("id here");
    By submitBtn = By.id("id here");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String username, String password){
        driver.findElement(usernameTxt).sendKeys(username);
        driver.findElement(passwordTxt).sendKeys(password);
        driver.findElement(submitBtn).click();
    }
}
