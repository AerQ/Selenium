package PromBot;

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
        Initialisation initialisation1 = new Initialisation(driver);
        driver.get(MAIN_URL);
        driver.get(REG_URL);
        initialisation1.firstLoad();
        initialisation.secondLoad();

    }
}
