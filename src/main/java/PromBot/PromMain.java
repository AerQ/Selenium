package PromBot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromMain {
    private static WebDriver driver;
    private static String REG_URL = "https://prom.ua/join-customer?source_id=txt.register.customer";
    private static String MAIN_URL = "https://prom.ua/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Остап\\IdeaProjects\\Selenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        LoadRandomValueToFirstPage regFir = new LoadRandomValueToFirstPage(driver);
        PromSecondPage promSecondPage = new PromSecondPage(driver);
        PromFirstPage pr = new PromFirstPage(driver);
        Initialisation initialisation = new Initialisation(driver);
        driver.get(MAIN_URL);
        driver.get(REG_URL);
//        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
        pr.register(regFir.getCustomerName(5), regFir.getEmail(), regFir.getPassword(1, 10000));
        pr.regButton();
        initialisation.info();
        promSecondPage.submitButton();
    }
}
