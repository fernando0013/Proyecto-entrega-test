package co.com.Utest.questions;

import co.com.Utest.model.UtestDatos;
import co.com.Utest.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question<Boolean> {

    private List<UtestDatos> datos;

    private Responder(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Responder aLos(List<UtestDatos> datos) {
        return new Responder(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Boton_final = Text.of(PaginaFinal.BOTON_COMPLETAR).viewedBy(actor).asString();
        return datos.get(0).getStrTextoFinal().equals(Boton_final);
    }
}
