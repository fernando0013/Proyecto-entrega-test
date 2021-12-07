package co.com.Utest.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInfoPersonal {

    public static final Target NOMBRE = Target.the("nombre")
            .located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("apellido")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("email")
            .located(By.id("email"));
    public static final Target MES_NACIMIENTO = Target.the("mes de nacimiento")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target DIA_NACIMIENTO = Target.the("dia de nacimiento")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target ANO_NACIMIENTO = Target.the("ano de nacimiento")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));
    public static final Target BOTON_DIRRECCION =Target.the("boton que lleva a la seccion de Direccion")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
