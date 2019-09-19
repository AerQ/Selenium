package PromBot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PromSecondPage {
    private WebDriver driver;
//    private final long timeoutInSeconds = 30;
//    private WebDriverWait wait = new WebDriverWait(driver ,timeoutInSeconds);
private WebDriverWait wait;
    public PromSecondPage(WebDriver driver){
        this.driver = driver;

    }

    private By nickField = By.xpath("//input[@class='b-textbox b-form-unit__field' and @data-qaid='nickname_input']");
    private By secondNameField = By.xpath("//div[@class='b-grid__col'][3]//input[@data-qaid='input_field']");
    private By patronymicField = By.xpath("//div[@class='b-grid__col'][4]//input[@data-qaid='middle_name_input']");
    private By genderManField = By.xpath("//span[text()='Мужчина']/preceding-sibling::input");
    private By genderWomanField = By.xpath("//span[text()='Женщина']/preceding-sibling::input");
    private By marriageCheckBox = By.xpath("//span[text()='В браке']/preceding-sibling::spinput");
    private By haveChildrenCheckBox = By.xpath("//span[text()='Есть дети']/preceding-sibling::input");
    private By dayOfBirthDayFieldClick = By.xpath("//div[@class='dropdown__root__18yaG']//span[text()='День']");
    private By daysOfBirthDayFieldClick = By.xpath("//ul[@class='dropdown__listWrapper__3re0R']//li");/*findElements*//*foreach->click*/
    private By monthOfBirthDayFieldClick = By.xpath("//div[@class='dropdown__root__18yaG']//span[text()='Месяц']");
    private By monthsOfBirthDayFieldClick = By.xpath("//ul[@class='dropdown__listWrapper__3re0R']//li");/*findElements*//*foreach->click*/
    private By yearOfBirthDayFieldClick = By.xpath("//div[@class='dropdown__root__18yaG']//span[text()='Год']");
    private By yearsOfBirthDayFieldClick = By.xpath("//ul[@class='dropdown__listWrapper__3re0R']//li");/*findElements*//*foreach->click*/
    private By cityFieldClick = By.xpath("//div//span[@class='dropdown__value__ghyNB' and text()='Киев']");
    private By cityesFieldClick = By.xpath("//ul[@class='dropdown__listWrapper__3re0R']//li");/*findElements*//*foreach->click*/
    private By mailAdressField = By.xpath("//input[@type='text' and @placeholder='Укажите ваш почтовый адрес']");
    private By mailIndexField = By.xpath("//input[@type='text' and @placeholder='Например: 49000']");
    private By mobilePhoneField = By.xpath("//input[@type='text' and @placeholder='Например: +38 039 1234567']");
    private By aboutSelfDescriptionField = By.xpath("//textarea[@data-qaid='about_me_input']");
    private By hobbyDescriptionField = By.xpath("//textarea[@data-qaid='hobby_input']");
    private By interestsDescriptionField = By.xpath("//textarea[@data-qaid='interests_input']");
    private By saveButton = By.xpath("//button[@type='button' and @data-qaid='save_profile']");

    public PromSecondPage getNick(String nickName) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(nickName)));
        driver.findElement(nickField).sendKeys(nickName);
        return this;
    }

    public PromSecondPage getSecondName(String secondName) {
        driver.findElement(secondNameField).sendKeys(secondName);
        return this;
    }

    public PromSecondPage getPatronymic(String patronymic) {
        driver.findElement(patronymicField).sendKeys(patronymic);
        return this;
    }

    public PromSecondPage getGender(String gender) {
        if (gender.equals("Мужчина")) {
            driver.findElement(genderManField).click();
        } else if (gender.equals("Женщина")) {
            driver.findElement(genderWomanField).click();
        }
        return this;
    }

    public PromSecondPage getStatus(String status) {
        if (status.equals("В браке")) {
            driver.findElement(marriageCheckBox).click();
        } else if (status.equals("Есть дети")) {
            driver.findElement(haveChildrenCheckBox).click();
        }
        return this;
    }

    public PromSecondPage getDay(String day) {
        driver.findElement(dayOfBirthDayFieldClick).click();
        List<WebElement> dayCheckBoxes = driver.findElements(daysOfBirthDayFieldClick);
        for (WebElement days : dayCheckBoxes) {
            if (days.equals(day)) {
                days.click();
            }
        }
        return this;
    }

    public PromSecondPage getMonth(String month) {
        driver.findElement(monthOfBirthDayFieldClick).click();
        List<WebElement> monthCheckBoxes = driver.findElements(monthsOfBirthDayFieldClick);
        for (WebElement months : monthCheckBoxes) {
            if (months.equals(month)) {
                months.click();
            }
        }
        return this;
    }

    public PromSecondPage getYear(String year) {
        driver.findElement(yearOfBirthDayFieldClick).click();
        List<WebElement> yearCheckBoxes = driver.findElements(yearsOfBirthDayFieldClick);
        for (WebElement years : yearCheckBoxes) {
            if (years.equals(year)) {
                years.click();
            }
        }
        return this;
    }

    public PromSecondPage getCity(String city) {
        driver.findElement(cityFieldClick).click();
        List<WebElement> citiesList = driver.findElements(cityesFieldClick);
        for (WebElement cityes : citiesList) {
            if (cityes.equals(city)) {
                cityes.click();
            }
        }
        return this;
    }

    public PromSecondPage getMailAdress(String mail) {
        driver.findElement(mailAdressField).sendKeys(mail);
        return this;
    }

    public PromSecondPage getMailIndex(String index) {
        driver.findElement(mailIndexField).sendKeys(index);
        return this;
    }

    public PromSecondPage getMobilePhone(String phoneNumber) {
        driver.findElement(mobilePhoneField).sendKeys(phoneNumber);
        return this;
    }

    public PromSecondPage getAboutSelfDescription(String description) {
        driver.findElement(aboutSelfDescriptionField).sendKeys(description);
        return this;
    }

    public PromSecondPage getHobbyDescription(String hobby) {
        driver.findElement(hobbyDescriptionField).sendKeys(hobby);
        return this;
    }

    public PromSecondPage getInterests(String interests) {
        driver.findElement(interestsDescriptionField).sendKeys(interests);
        return this;
    }

    public Initialisation submitButton() {
        driver.findElement(saveButton).click();
        return new Initialisation(driver);
    }

    public PromSecondPage saveProperties(String nickName, String secondName, String patronymic, String gender,
                                         String status, String day, String month, String year, String city, String mail,
                                         String index, String phoneNumber, String description, String hobby, String interests) {
        this.getNick(nickName);
        this.getSecondName(secondName);
        this.getPatronymic(patronymic);
        this.getGender(gender);
        this.getStatus(status);
        this.getDay(day);
        this.getMonth(month);
        this.getYear(year);
        this.getCity(city);
        this.getMailAdress(mail);
        this.getMailIndex(index);
        this.getMobilePhone(phoneNumber);
        this.getAboutSelfDescription(description);
        this.getHobbyDescription(hobby);
        this.getInterests(interests);
        this.submitButton();
        return new PromSecondPage(driver);
    }
}