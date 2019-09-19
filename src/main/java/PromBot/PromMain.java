package PromBot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PromMain {
    private static WebDriver driver;
    private static String REG_URL = "https://prom.ua/join-customer?source_id=txt.register.customer";
    private static String MAIN_URL = "https://prom.ua/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Остап\\IdeaProjects\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        Initialisation initialisation = new Initialisation(driver);
        driver.get(MAIN_URL);
        driver.get(REG_URL);
        initialisation.info();
//        LoadRandomValueToFirstPage regFir = new LoadRandomValueToFirstPage(driver);
//        PromSecondPage promSecondPage = new PromSecondPage(driver);
//        PromFirstPage promFirstPage = new PromFirstPage(driver);
//        promFirstPage.register(regFir.getCustomerName(5), regFir.getEmail(), regFir.getPassword(1, 10000));
//        promFirstPage.regButton();
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//        new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='b-textbox b-form-unit__field' and @data-qaid='nickname_input']")));
//        driver.findElement(By.xpath("//input[@class='b-textbox b-form-unit__field' and @data-qaid='nickname_input']/preceding-sibling::label")).sendKeys("dssdsd");
//        promSecondPage.submitButton();
    }
}
