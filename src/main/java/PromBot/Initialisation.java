package PromBot;

import org.openqa.selenium.WebDriver;

public class Initialisation {
    private WebDriver driver;

    public Initialisation(WebDriver driver) {
        this.driver = driver;
    }


    public Initialisation info() {
        PromFirstPage promFirstPage = new PromFirstPage(driver);
        LoadRandomValueToFirstPage regFir = new LoadRandomValueToFirstPage(driver);
        PromSecondPage promSecondPage = new PromSecondPage(driver);
        LoadRandomValuesToSecondPage profile = new LoadRandomValuesToSecondPage();
        promFirstPage.register(regFir.getCustomerName(5), regFir.getEmail(), regFir.getPassword(1, 10000));
        promFirstPage.regButton();
        promSecondPage.saveProperties(profile.getNickName(), profile.getSecondName(), profile.getPatronymic(), profile.getGender(),
                profile.getStatus(), (String.valueOf(profile.getDayOfBirthDay())), (String.valueOf(profile.getMonthOfBirthDay())), (String.valueOf(profile.getYearOfBirthDay())), profile.getCity(), profile.getEmail(), (String.valueOf(profile.getMailIndex())), (String.valueOf(profile.getPhoneNumber())), profile.getSelfDescription(), profile.getHobby(), profile.getInterests());

        promSecondPage.submitButton();

        return this;
    }
}
