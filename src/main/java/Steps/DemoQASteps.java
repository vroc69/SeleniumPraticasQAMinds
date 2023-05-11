package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class DemoQASteps extends BaseSteps{

    public DemoQASteps(WebDriver driver){
        super(driver);
    }

    public boolean verifyFullNameIsDisplayed(){
        WebElement ele = webDriver.findElement(By.id("userName"));
        printToConsole("Full name field displayed: " + isCorrectlyDisplayedElement(ele));
        return isCorrectlyDisplayedElement(ele);
    }

    public boolean verifyEmailIsDisplayed(){
        WebElement ele = webDriver.findElement(By.id("userEmail"));
        printToConsole("Email field displayed: " + isCorrectlyDisplayedElement(ele));
        return isCorrectlyDisplayedElement(ele);
    }

    public boolean verifyCurrentAddressIsDisplayed(){
        WebElement ele = webDriver.findElement(By.id("currentAddress"));
        printToConsole("Current Address field displayed: " + isCorrectlyDisplayedElement(ele));
        return isCorrectlyDisplayedElement(ele);
    }

    public boolean verifyPermanentAddressIsDisplayed(){
        WebElement ele = webDriver.findElement(By.id("permanentAddress"));
        printToConsole("Permanet Address field displayed: " + isCorrectlyDisplayedElement(ele));
        return isCorrectlyDisplayedElement(ele);
    }

    public boolean verifySubmitButtonIsEnabled(){
        WebElement ele = webDriver.findElement(By.cssSelector("button[class*=btn-primary]"));
        printToConsole("Btn submit is enabled: " + isEnabledElement(ele));
        return isEnabledElement(ele);
    }

    public void populateFormDemoQA(){
        WebElement fullName = webDriver.findElement(By.id("userName"));
        WebElement email = webDriver.findElement(By.id("userEmail"));
        WebElement currentAddss = webDriver.findElement(By.id("currentAddress"));
        WebElement permantAddss = webDriver.findElement(By.id("permanentAddress"));

        printToConsole("Comenzando a llenar el formulario ++++++++++++++++++++++++++++++++++++++++++++++");
        sendTextToElement(fullName,"Victor Ruben Orozco Cisneros");
        sendTextToElement(email,"victor@gmail.com");
        sendTextToElement(currentAddss,"Av. Doctores #109");
        sendTextToElement(permantAddss,"Calle Miguel Hidalgo #45 int:60");
        printToConsole("Formulario completo ++++++++++++++++++++++++++++++++++++++++++++++");
    }

}
