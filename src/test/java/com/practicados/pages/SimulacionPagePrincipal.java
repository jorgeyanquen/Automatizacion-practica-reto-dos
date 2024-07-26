package com.practicados.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


@DefaultUrl("https://www.bancolombia.com/personas/creditos/consumo/simulador-credito-consumo##sim-results")
public class SimulacionPagePrincipal extends PageObject {


    //campo que deseas simular
    @FindBy(xpath = "//*[@id=\"sim-detail\"]/form/div[2]/select")
     public WebElementFacade txtSelectsimular;

    //campo fecha nacimiento
     @FindBy(xpath = "//*[@class=\"form-control calendar100YB ng-pristine ng-invalid ng-invalid-required ng-valid-min ng-valid-max ng-valid-ymdateformatstring ng-valid-ymdate-no-weekends hasDatepicker\"]")
     public WebElementFacade txtfecha;

    //campo tipo tasa
      @FindBy(xpath = "//*[@id=\"sim-detail\"]/form/div[4]/select")
      public WebElementFacade txttipotasa;

    //campo producto
     @FindBy(xpath = "//*[@id=\"sim-detail\"]/form/div[5]/div[1]/select")
     public WebElementFacade txtproducto;

    //campo plazo
     @FindBy(xpath = "//*[@id=\"sim-detail\"]/form/div[7]/div[1]/input")
     public WebElementFacade txtplazo;

    //campo valor
      @FindBy(xpath = "//*[@id=\"sim-detail\"]/form/div[7]/div[2]/input")
      public WebElementFacade txtvalor;

    //Boton
     @FindBy(xpath = "//*[@id=\"sim-detail\"]/form/div[8]/button")
     public WebElementFacade btnsimular;

    //Form Validation - label informativo
    @FindBy(xpath = "//*[@id=\"for-detail\"]/div[1]/h1")
    public WebElement lblFormValidation;

    //label del home a verificar
    @FindBy(xpath = "//*[@id=\"for-detail\"]/div[1]/h1")
    public WebElementFacade lblHomePpal;


    public void simular(String datoPrueba){
           txtSelectsimular.click();
           txtSelectsimular.selectByVisibleText(datoPrueba);
        txtSelectsimular.click();

    }

    public void fecha(String datoPrueba){
         txtfecha.click();
         txtfecha.clear();
         txtfecha.sendKeys(datoPrueba);
    }

    public void tipotasa(String datoPrueba){
        txttipotasa.click();
         txttipotasa.selectByVisibleText(datoPrueba);
        txtSelectsimular.click();
    }

    public void producto(String datoPrueba){
         txtproducto.click();
            txtproducto.selectByVisibleText(datoPrueba);
        txtSelectsimular.click();
    }

    public void plazo(String datoPrueba){
        txtplazo.click();
         txtplazo.clear();
            txtplazo.sendKeys(datoPrueba);
    }

    public void valor(String datoPrueba){
         txtvalor.click();
         txtvalor.clear();
            txtvalor.sendKeys(datoPrueba);
    }

    public void validate(){
        btnsimular.click();
    }


    public void menuFormValidation() {


        String strMensaje = lblFormValidation.getText();
        assertThat(strMensaje, containsString("Simula tu Crédito"));

    }
}
