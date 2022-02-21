package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pageobject.KtronisPages;
import steps.KtronicsBusquedaStep;

import java.util.ArrayList;
import java.util.Map;

public class KtronicsBusqStepDefinition {

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();
    @Steps
    KtronicsBusquedaStep busquedaStep = new KtronicsBusquedaStep();

    @Given("^Dado que se debe realizar la busqueda por categoria, el home y la barra de busqueda$")
    public void dadoQueSeDebeRealizarLaBusquedaPorCategoriaElHomeYLaBarraDeBusqueda() {
        SeleniumWebDriver.chromeDrive("https://www.ktronix.com/");
    }

    @When("^cuando llamo a los datos en el archivo de excel$")
    public void cuandoLlamoALosDatosEnElArchivoDeExcel() {
        busquedaStep.darclic();
        busquedaStep.buscarexcel();


    }

    @Then("^hace la busqueda y me muestra resultados$")
    public void haceLaBusquedaYMeMuestraResultados() {
      busquedaStep.validar(KtronisPages.getLblvalidacion(),"Parlante SONOS Five Negro");

    }
}
