package co.com.Utest.stepdefinitions;


import co.com.Utest.model.UtestDatos;
import co.com.Utest.questions.Responder;
import co.com.Utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Luis desea registrarse en la plataforma Utest$")
    public void luisDeseaRegistrarseEnLaPlataformaUtest() throws Exception{
        OnStage.theActorCalled("Luis").wasAbleTo(Abrir.Lapagina());

    }

    @When("^El usuario ingresa los datos requeridos por el sistema Utest$")
    public void elUsuarioIngresaLosDatosRequeridosPorElSistemaUtest(List<UtestDatos> datos) throws Exception{
    OnStage.theActorInTheSpotlight().attemptsTo(Llenar.LaPagina(datos), LlenarDireccion.LaPagina(datos),
            LlenarDispositivos.LaPagina(datos), LlenarFinal.LaPagina(datos)
    );
    }

    @Then("^El registro se completa al ver el boton de complete Setup$")
    public void elRegistroSeCompletaAlVerElBotonDeCompleteSetup(List<UtestDatos> datos) throws Exception{


    }

}
