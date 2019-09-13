import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMain {

    public static void main(String[] args) {
        RegistrationRandomValues registrationRandomValues = new RegistrationRandomValues();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Остап\\IdeaProjects\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Dimension dimension = new Dimension(800, 800);
        driver.get("https://prom.ua");
        driver.navigate().to("https://prom.ua/join-customer?source_id=txt.register.customer");
        driver.manage().window().setSize(dimension);

        driver.findElement(By.xpath("//form//input[@type='text' and @class='lp-vertical-form__input']")).clear();
        driver.findElement(By.xpath("//form//input[@type='text' and @class='lp-vertical-form__input']")).sendKeys(registrationRandomValues.getCustomerName(6));

        driver.findElement(By.xpath("//form//input[@type='email' and @class='lp-vertical-form__input']")).clear();
        driver.findElement(By.xpath("//form//input[@type='email' and @class='lp-vertical-form__input']")).sendKeys(registrationRandomValues.getEmail());

        driver.findElement(By.xpath("//form//input[@type='password' and @class='lp-vertical-form__input']")).clear();
        driver.findElement(By.xpath("//form//input[@type='password' and @class='lp-vertical-form__input']")).sendKeys(registrationRandomValues.getPassword(1, 9999));

        WebElement button = driver.findElement(By.xpath("//button[@class='lp-button lp-button_width_full lp-button_theme_blue lp-button_height_50' and @type='submit']//b"));
        System.out.println("asasa" + button.getText());
        button.submit();
    }
}