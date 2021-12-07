package co.com.Utest.tasks;

import co.com.Utest.userinterface.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private PaginaUtest Pagina;

    public static Abrir Lapagina() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(Pagina),
                Click.on(PaginaUtest.JOIN));

    }
}
