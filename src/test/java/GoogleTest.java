import Steps.GoogleSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
    private WebDriver webDriver = getWebDriver();
    private GoogleSteps googleSteps = new GoogleSteps(webDriver);

    @Test
    public void openGoogleTest(){
        googleSteps.abrirPaginaGoogle();
        String currentUrl = googleSteps.getCurrentUrl();
        System.out.println("currentURl: " + currentUrl);
        Assert.assertEquals(currentUrl.contains("https://www.google.com"),true);
    }

    @Test
    public void titleGoogleTest(){
        googleSteps.abrirPaginaGoogle();
        String titleUrl = googleSteps.getTitleUrl();
        System.out.println("titleUrl: " + titleUrl);
        Assert.assertEquals(titleUrl.contains("Google"),true);
    }

    @Test
    public void sourceCodeGoogleTest(){
        googleSteps.abrirPaginaGoogle();
        String sourceCode = googleSteps.getPageSourceCode();
        System.out.println("sourceCode: " + sourceCode);
    }

    @Test
    public void metodoNavigateTest(){
        String urlExpected = "https://www.google.com/";
        googleSteps.abrirPaginaGoogle();
        String currentUrl = googleSteps.getCurrentUrl();
        googleSteps.printToConsole("currentURl: " + currentUrl);
        Assert.assertEquals(currentUrl,urlExpected); //hard assert if this fail the execution will stop

        String titleExpectedFace = "Facebook - log in or sign up";
        googleSteps.navegarAPaginaFacebook();
        String currentTitleFace = googleSteps.getTitleUrl();
        googleSteps.printToConsole("Facebook title: " + currentTitleFace);
        Assert.assertEquals(currentTitleFace,titleExpectedFace);

        String urlExpectedEspn = "https://www.espn.com.mx/";
        googleSteps.navegarAPaginaESPN();
        String currentURLEspn = googleSteps.getCurrentUrl();
        googleSteps.printToConsole("ESPN pag: " + currentURLEspn);
        Assert.assertEquals(currentURLEspn,urlExpectedEspn);

        webDriver.navigate().back();
        googleSteps.printToConsole(currentTitleFace);
        Assert.assertEquals(currentTitleFace,titleExpectedFace);
        webDriver.navigate().back();
        googleSteps.printToConsole("currentURl: " + currentUrl);
        Assert.assertEquals(currentUrl,urlExpected);

        googleSteps.closeWebDriverSession();
    }

    @Test
    public void enviarBusquedaGoogle(){
        googleSteps.abrirPaginaGoogle();
        googleSteps.enviarBusquedaEnGoogle("selenium");
        //googleSteps.clickBuscar();
        googleSteps.enviarEnter();

        //googleSteps.closeWebDriverSession();
    }

    /*@AfterTest
    public void closeTest(){
        googleSteps.closeWindow();
        googleSteps.closeWebDriverSession();
    }*/
}
