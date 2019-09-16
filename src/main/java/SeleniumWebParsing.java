import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebParsing {
    private WebDriver driver = new ChromeDriver();
    private String url = "https://prom.ua";
    private String navigate = "https://prom.ua/join-customer?source_id=txt.register.customer";

    public RegistrationFirstPage seleniumFirstPageRegistration() {
        RegistrationFirstPage rfp = new RegistrationFirstPage();
        RegisteredUserProfile regUsProf = new RegisteredUserProfile();
        try {
            driver.get(url);
            driver.navigate().to(navigate);
            driver.manage().window().setSize(new Dimension(800, 800));
            //            рандом логин
            driver.findElement(By.xpath("//form//input[@type='text' and @class='lp-vertical-form__input']")).clear();
            driver.findElement(By.xpath("//form//input[@type='text' and @class='lp-vertical-form__input']")).sendKeys(rfp.getCustomerName(6));

            //            рандом почта
            driver.findElement(By.xpath("//form//input[@type='email' and @class='lp-vertical-form__input']")).clear();
            driver.findElement(By.xpath("//form//input[@type='email' and @class='lp-vertical-form__input']")).sendKeys(rfp.getEmail());

            //            рандом пароль
            driver.findElement(By.xpath("//form//input[@type='password' and @class='lp-vertical-form__input']")).clear();
            driver.findElement(By.xpath("//form//input[@type='password' and @class='lp-vertical-form__input']")).sendKeys(rfp.getPassword(1, 9999));
            //            баттон сабмит
            driver.findElement(By.xpath("//button[@class='lp-button lp-button_width_full lp-button_theme_blue lp-button_height_50' and @type='submit']//b")).submit();
//        driver.quit();
            //            рандом ник
            driver.findElement(By.xpath("//input[@class='b-textbox b-form-unit__field' and @data-qaid='nickname_input']")).clear();
            driver.findElement(By.xpath("//input[@class='b-textbox b-form-unit__field' and @data-qaid='nickname_input']")).sendKeys(regUsProf.getNickName());

            //            рандом фамилия
            driver.findElement(By.xpath("//input[@class='b-textbox b-form-unit__field'and @data-qaid='input_field' and @maxlength='100' and @value='']")).clear();
            driver.findElement(By.xpath("//input[@class='b-textbox b-form-unit__field'and @data-qaid='input_field' and @maxlength='100' and @value='']")).sendKeys(regUsProf.getSecondName());
            //            рандом отчество
            driver.findElement(By.xpath("//input[@class='b-textbox b-form-unit__field'and @data-qaid='middle_name_input' ]")).clear();
            driver.findElement(By.xpath("//input[@class='b-textbox b-form-unit__field'and @data-qaid='middle_name_input' ]")).sendKeys(regUsProf.getPatronymic());
            //            рандом пол
            driver.findElement(By.xpath("//div[@class='familyData-module__item__3txes']//div//label//span[@class='checkbox-module__fakeInput__1p5us']")).clear();
            driver.findElement(By.xpath("//div[@class='familyData-module__item__3txes']//div//label//span[@class='checkbox-module__fakeInput__1p5us']")).click();

          
            driver.findElement(By.xpath("//div//button[@data-qaid='save_profile']")).submit();
            driver.navigate().to(url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rfp;
    }


}
