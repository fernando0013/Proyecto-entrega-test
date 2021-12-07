package co.com.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDispositivos {

    public static final Target CONTENEDOR_DISPOSITIVO_MOVIL = Target.the("Contenedor de dispositivos moviles")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public static final Target DISPOSITIVO_MOVIL = Target.the("Dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    public static final Target CONTENEDOR_MODELO_MOVIL = Target.the("Contenedor de modelo de dispositivos moviles")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public static final Target MODELO_MOVIL = Target.the("Modelo de dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target CONTENEDOR_SISTEMA_OPERATIVO = Target.the("Contenedor de Sistema Operativo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target SISTEMA_OPERATIVO = Target.the("Sistema Operativo de Dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target BOTON_FINAL = Target.the("Boton que lleva a la secciòn final")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
