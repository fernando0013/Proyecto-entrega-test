package co.com.Utest.tasks;

import co.com.Utest.model.UtestDatos;
import co.com.Utest.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static co.com.Utest.userinterface.PaginaFinal.*;
public class LlenarFinal implements Task {

    private List<UtestDatos> datos;

    public LlenarFinal(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarFinal LaPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarFinal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrClave()).into(CLAVE),
                Enter.theValue(datos.get(0).getStrClave()).into(CONFIRMAR_CLAVE),
                Click.on(CHECKBOX_1),
                Click.on(CHECKBOX_2),
                Click.on(CHECKBOX_3),
                Click.on(BOTON_COMPLETAR)



        );

    }
}
