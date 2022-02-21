package pageobject;

import org.openqa.selenium.By;

public class KtronisPages {
    private static By BtnBoton = By.xpath("//button[@class='button-primary js-cookie-notification-accept']");
    private static By lblproducto = By.xpath("//a[@title='Celulares']");
    private static By Btncelulare = By.xpath("//a[@href=\"/accesorios-electronica/accesorios-celulares/c/BI_102_KTRON\"]");
    private static By Btndetalle = By.xpath("//a[@id=\"js-view-details-745883670185\"]");
    private static By BtnHome = By.xpath("//img[@title=\"Ktronix\"]");
    private static By txtbarrabusqueda = By.xpath("//input [@id='js-site-search-input']");
    private static By btnaudio = By.xpath("//a[@href=\"/audio/c/BI_AUDI_KTRON \"]");
    private static By lblsonido = By.xpath("//a[@href=\"/marcas/sonos/c/sonos\"]");
    private static By lblsonidodeta= By.xpath("//a[@id=\"js-view-details-878269009894\"]");
    private static By lblvalidacion = By.xpath("//h1[contains(text(),'Parlante')]");

    public static By getLblvalidacion() {
        return lblvalidacion;
    }

    public static By getBtnaudio() {

        return btnaudio;
    }

    public static By getBtnHome() {

        return BtnHome;
    }

    public static By getLblsonido() {

        return lblsonido;
    }

    public static By getBtncelulare() {

        return Btncelulare;
    }

    public static By getBtnBoton() {
        return BtnBoton;
    }

    public static By getLblproducto() {
        return lblproducto;
    }

    public static By getTxtbarrabusqueda() {
        return txtbarrabusqueda;
    }


    public static By getBtndetalle() {
        return Btndetalle;
    }

    public static By getLblsonidodeta() {
        return lblsonidodeta;
    }
}
