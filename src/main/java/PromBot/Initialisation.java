package PromBot;

import org.openqa.selenium.WebDriver;

public class Initialisation {
    private WebDriver driver;

    public Initialisation(WebDriver driver) {
        this.driver = driver;
    }

    public PromSecondPage info(){
        PromSecondPage rUpB = new PromSecondPage(driver);

        LoadRandomValuesToSecondPage profile = new LoadRandomValuesToSecondPage();
       return rUpB.saveProperties(profile.getNickName(), profile.getSecondName(),profile.getPatronymic(),profile.getGender(),
                profile.getStatus(),(String.valueOf(profile.getDayOfBirthDay())),(String.valueOf(profile.getMonthOfBirthDay())),(String.valueOf(profile.getYearOfBirthDay())),profile.getCity(),profile.getEmail(),(String.valueOf(profile.getMailIndex())),(String.valueOf(profile.getPhoneNumber())),profile.getSelfDescription(),profile.getHobby(),profile.getInterests());
    }
}
