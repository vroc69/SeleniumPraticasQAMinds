package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSteps extends BaseSteps{

    public GoogleSteps(WebDriver driver){
        super(driver);
    }

    public void abrirPaginaGoogle(){
        webDriver.get("https://www.google.com");
        printToConsole("Navegando a google.com");
    }

    public void navegarAPaginaFacebook(){
        webDriver.navigate().to("https://www.facebook.com");
        printToConsole("Navegando a Facebook");
    }

    public void navegarAPaginaESPN(){
        webDriver.navigate().to("https://www.espn.com.mx");
        printToConsole("Navegando a ESPN");
    }

    public void enviarBusquedaEnGoogle(String busqeda){
        //WebElement barraBusqueda = webDriver.findElement(By.name("q"));
        WebElement barraBusqueda = webDriver.findElement(By.cssSelector("textarea[name='q']"));
        barraBusqueda.sendKeys(busqeda);
    }

    public void clickBuscar(){
        List<WebElement> botonesBusqueda = webDriver.findElements(By.cssSelector("input[name='btnK']"));
        botonesBusqueda.get(0).click();
    }

    public void enviarEnter(){
        WebElement barraBusqueda = webDriver.findElement(By.cssSelector("textarea[name='q']"));
        barraBusqueda.sendKeys(Keys.ENTER);
    }
}
