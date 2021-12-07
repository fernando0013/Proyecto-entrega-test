package co.com.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {
    public static final Target CLAVE = Target.the("Clave de usuario")
            .located(By.id("password"));
    public static final Target CONFIRMAR_CLAVE = Target.the("Confirmar Clave de usuario")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_1 = Target.the("Checkbox_1")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_2 = Target.the("Checkbox_2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_3 = Target.the("Checkbox_3")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_COMPLETAR = Target.the("Boton finalizar registro de usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
