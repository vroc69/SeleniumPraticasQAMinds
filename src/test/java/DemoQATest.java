import org.openqa.selenium.WebDriver;
import Steps.DemoQASteps;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoQATest extends BaseTest{
    private WebDriver webDriver = getWebDriver();
    private DemoQASteps demoQASteps = new DemoQASteps(webDriver);

    @Test
    public void practica1Test(){
        //1. Abrir: https://demoqa.com/text-box/
        demoQASteps.openUrlWeb("https://demoqa.com/text-box/");

        //2. Verifica que tengamos la URL correcta
        String expectedUrl = "https://demoqa.com/text-box/";
        String currentUrl = demoQASteps.getCurrentUrl();
        demoQASteps.verifyUrlIsCorrect(expectedUrl,currentUrl);

        //3. Compruebe si se muestra el cuadro de texto Nombre completo
        boolean fullName = demoQASteps.verifyFullNameIsDisplayed();
        demoQASteps.hardAssertBooleanEquals(fullName,true);

        //4. Compruebe si se muestra el cuadro de texto de correo electrónico
        boolean email = demoQASteps.verifyEmailIsDisplayed();
        demoQASteps.hardAssertBooleanEquals(email,true);

        //5. Compruebe si se muestra el cuadro de texto Dirección actual
        boolean currentAddss = demoQASteps.verifyCurrentAddressIsDisplayed();
        demoQASteps.hardAssertBooleanEquals(currentAddss,true);

        //6. Compruebe si se muestra la dirección permanente
        boolean permanetAddss = demoQASteps.verifyPermanentAddressIsDisplayed();
        demoQASteps.hardAssertBooleanEquals(permanetAddss,true);

        //7. Compruebe si el botón Enviar está habilitado
        boolean btnSubmit = demoQASteps.verifySubmitButtonIsEnabled();
        demoQASteps.hardAssertBooleanEquals(btnSubmit,true);

        //Close driver
        demoQASteps.closeWebDriverSession();
    }

    @Test
    public void practica2Test(){
        //1. Abrir: https://demoqa.com/text-box/
        demoQASteps.openUrlWeb("https://demoqa.com/text-box/");

        //2. Completa el formulario
        demoQASteps.populateFormDemoQA();

        //Close driver
        //demoQASteps.closeWebDriverSession();
    }
}
