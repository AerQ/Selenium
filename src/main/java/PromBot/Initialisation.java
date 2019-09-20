package PromBot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Initialisation {
    private WebDriver driver;
//    private final long timeoutInSeconds = 60;
//    private WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);

    public Initialisation(WebDriver driver) {
        this.driver = driver;
    }

    public PromFirstPage firstLoad() {
        PromFirstPage promFirstPage = new PromFirstPage(driver);
        LoadRandomValueToFirstPage rega = new LoadRandomValueToFirstPage(driver);
        promFirstPage.register(rega.getCustomerName(6), rega.getEmail(), rega.getPassword(1, 100000));

        promFirstPage.regButton();
        return new PromFirstPage(driver);
    }

    public PromSecondPage secondLoad() {
        PromSecondPage rUpB = new PromSecondPage(driver);

        LoadRandomValuesToSecondPage profile = new LoadRandomValuesToSecondPage(driver);
        rUpB.saveProperties(profile.getNickName(), profile.getSecondName(), profile.getPatronymic(), profile.getGender(),
                profile.getStatus(), profile.getEmail(),
                (String.valueOf(profile.getMailIndex())), (String.valueOf(profile.getPhoneNumber())), profile.getSelfDescription(),
                profile.getHobby(), profile.getInterests());
        rUpB.submitButton();
//        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        return new PromSecondPage(driver);
    }

}