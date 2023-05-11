import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class BaseTest {
    private WebDriver webDriver;

    public WebDriver getWebDriver(){
        //File rootPath = new File("C:/Arkangel/Instaladores/geckodriver-v0.33.0-win64/geckodriver.exe");
        //System.setProperty("webdriver.gecko.driver",rootPath.getPath());
        //webDriver = new FirefoxDriver();

        File rootPath = new File("C:/Arkangel/Instaladores/chromedriver_win32/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",rootPath.getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
        return webDriver;
    }

}
