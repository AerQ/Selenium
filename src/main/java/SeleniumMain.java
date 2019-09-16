
public class SeleniumMain {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Остап\\IdeaProjects\\Selenium\\drivers\\chromedriver.exe");

        SeleniumWebParsing seleniumWebParsing = new SeleniumWebParsing();
            seleniumWebParsing.seleniumFirstPageRegistration();

    }
}