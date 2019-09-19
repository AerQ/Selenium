package PromBot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PromFirstPage {
    private WebDriver driver;

    public PromFirstPage(WebDriver driver) {
        this.driver = driver;
    }
    private By loginField = By.xpath("//input[@class='lp-vertical-form__input' and @placeholder='Как вас зовут?']");
    private By emailField = By.xpath("//input[@class='lp-vertical-form__input' and @placeholder='Введите email']");
    private By passwordField = By.xpath("//input[@class='lp-vertical-form__input' and @placeholder='Придумайте пароль']");
    private By submitButton = By.xpath("//button[@type='submit' and @class='lp-button lp-button_width_full lp-button_theme_blue lp-button_height_50']//b[text()='Зарегистрироваться']");


    public PromFirstPage getLoginName(String userName){
        driver.findElement(loginField).sendKeys(userName);
        return this;
    }

    public PromFirstPage getEmailName(String userEmail){
        driver.findElement(emailField).sendKeys(userEmail);
        return this;
    }

    public PromFirstPage getPassword(String userPassword){
        driver.findElement(passwordField).sendKeys(userPassword);
        return this;
    }
    public PromSecondPage regButton(){
        driver.findElement(submitButton).click();
        return new PromSecondPage(driver);
    }
    public PromSecondPage register(String userName, String userEmail, String userPassword){
        this.getLoginName(userName);
        this.getEmailName(userEmail);
        this.getPassword(userPassword);
        this.regButton();
        return new PromSecondPage(driver);
    }
}
