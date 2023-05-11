import Steps.PracticeAutomationSteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PracticeAutomationTest extends BaseTest{
    private WebDriver webDriver = getWebDriver();
    private PracticeAutomationSteps practiceAutomationSteps = new PracticeAutomationSteps(webDriver);

    @Test
    public void practica3Test(){
        //1. Abrir: practicetestautomation.com/practice-test-login/
        practiceAutomationSteps.openUrlWeb("https://practicetestautomation.com/practice-test-login/");

        //2. Ingrese el nombre de usuario
        practiceAutomationSteps.enterUserName();

        //3. Ingrese la contraseña
        practiceAutomationSteps.enterPassword();

        //4. Click en el boton de submit
        practiceAutomationSteps.clickOnSubmitButton();

        //5. Verifique que la URL de la nueva página contenga practicetestautomation.com/logged-in-successfully/
        practiceAutomationSteps.verifyUrlLoginSuccess();

        //6. Verifique que la nueva página contenga el texto esperado ('Felicitaciones' o 'inicio de sesión exitoso')
        practiceAutomationSteps.verifyTextLoginSuccess();

        //7. Verifique que el botón Cerrar sesión se muestre en la nueva página
        practiceAutomationSteps.verifyLogOutButtonIsDisplayed();

        //8. Close window
        practiceAutomationSteps.closeWebDriverSession();
    }
}

