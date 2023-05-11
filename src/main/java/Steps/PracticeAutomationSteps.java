package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeAutomationSteps extends BaseSteps{
    public PracticeAutomationSteps(WebDriver driver){
        super(driver);
    }

    public void enterUserName(){
        WebElement ele = webDriver.findElement(By.id("username"));
        printToConsole("Ingresando nombre de usuario: student");
        sendTextToElement(ele,"student");
    }

    public void enterPassword(){
        WebElement ele = webDriver.findElement(By.id("password"));
        printToConsole("Ingresando contraseña: Password123");
        sendTextToElement(ele,"Password123");
    }

    public void clickOnSubmitButton(){
        WebElement ele = webDriver.findElement(By.xpath("//div[@id='form']//button[@class='btn']"));
        ele.click();
    }

    public void verifyUrlLoginSuccess(){
        String urlExpected = "https://practicetestautomation.com/logged-in-successfully/";
        String currentUrl = getCurrentUrl();
        printToConsole("Current url: " + currentUrl);
        verifyUrlIsCorrect(urlExpected,currentUrl);
    }

    public void verifyTextLoginSuccess(){
        WebElement ele = webDriver.findElement(By.cssSelector("h1[class='post-title']"));
        WebElement ele2 = webDriver.findElement(By.cssSelector("[class='has-text-align-center'] strong"));
        String txtEle = getElementText(ele);
        String secondTxtEle = getElementText(ele2);
        String txtExptected = "Logged In Successfully";
        printToConsole("Login text: " + txtEle);
        printToConsole("Second login text: " + secondTxtEle);
        hardAssertStringEquals(txtExptected,txtEle);
    }

    public void verifyLogOutButtonIsDisplayed(){
        WebElement ele = webDriver.findElement(By.cssSelector("a[href*='test-login']"));
        boolean btnLogOut = isCorrectlyDisplayedElement(ele);
        printToConsole("El boton de log out se muestra de forma correcta: " + btnLogOut);
        hardAssertBooleanEquals(btnLogOut,true);
    }
}
