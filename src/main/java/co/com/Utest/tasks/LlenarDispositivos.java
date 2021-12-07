package co.com.Utest.tasks;

import co.com.Utest.model.UtestDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.Utest.userinterface.PaginaDispositivos.*;
public class LlenarDispositivos implements Task {

    private List<UtestDatos> datos;

    public LlenarDispositivos(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarDispositivos LaPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONTENEDOR_DISPOSITIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrDispositivoMovil()).into(DISPOSITIVO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_MODELO_MOVIL),
                Enter.theValue(datos.get(0).getStrModeloMovil()).into(MODELO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_SISTEMA_OPERATIVO),
                Enter.theValue(datos.get(0).getStrSistemaOperativoMovil()).into(SISTEMA_OPERATIVO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BOTON_FINAL)
                );
    }
}
