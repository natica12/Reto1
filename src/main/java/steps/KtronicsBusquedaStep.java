package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageobject.KtronisPages;
import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class KtronicsBusquedaStep {

    public void escribirEnter(By elemento, String Texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(Texto, Keys.ENTER);

    }


    public void botonseleccion(By elemento){

        SeleniumWebDriver.driver.findElement(elemento).click();
    }


    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Step
    public void buscarexcel() {
        try {


            leerExcel = Excel.leerXlsx("Ktronix.xlsx", "Busqueda");

        } catch (IOException e) {
            e.printStackTrace();

        }
        for (int i = 0; i < leerExcel.size(); i++) {
            escribirEnter(KtronisPages.getTxtbarrabusqueda(), leerExcel.get(i).get("celulares"));

        }
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }


    @Step
    public void darclic (){
        botonseleccion(KtronisPages.getBtnBoton());
       botonseleccion(KtronisPages.getLblproducto());
       botonseleccion(KtronisPages.getBtncelulare());
       botonseleccion(KtronisPages.getBtndetalle());
       botonseleccion(KtronisPages.getBtnHome());
       botonseleccion(KtronisPages.getBtnaudio());
       botonseleccion(KtronisPages.getLblsonido());
       botonseleccion(KtronisPages.getLblsonidodeta());



    }

    private String obtenerTexto(By elemento) {

        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }

    public void validar(By elemento, String texto) {

        assertEquals(obtenerTexto(elemento), texto);
    }
}
