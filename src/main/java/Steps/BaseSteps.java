package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BaseSteps {
    public WebDriver webDriver;

    //constructor
    public BaseSteps(WebDriver driver){
        this.webDriver = driver;
    }

    public String getTitleUrl(){
        return webDriver.getTitle();
    }

    public String getCurrentUrl(){
        return webDriver.getCurrentUrl();
    }

    public void closeWindow(){
        webDriver.close();
    }

    public String getPageSourceCode(){
        return webDriver.getPageSource();
    }

    public void closeWebDriverSession(){
        webDriver.quit();
    }

    public void printToConsole(String text){
        System.out.println(text);
    }

    public void openUrlWeb(String url){
        webDriver.get(url);
        webDriver.manage().window().maximize();
        printToConsole("Navegando a la web " + url);
    }

    public void verifyUrlIsCorrect(String urlExpected,String currentUrl){
        Assert.assertEquals(currentUrl,urlExpected);
    }

    public boolean isCorrectlyDisplayedElement(WebElement element){
        if(element.isDisplayed()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEnabledElement(WebElement element){
        if(element.isEnabled()){
            return true;
        }else{
            return false;
        }
    }

    public void hardAssertBooleanEquals(boolean s1,boolean s2){
        Assert.assertEquals(s1,s2);
    }

    public void hardAssertStringEquals(String s1,String s2){
        Assert.assertEquals(s1,s2);
    }

    public void sendTextToElement(WebElement ele,String txt){
        ele.sendKeys(txt);
    }

    public String getElementText(WebElement ele){
        return ele.getText();
    }
}
