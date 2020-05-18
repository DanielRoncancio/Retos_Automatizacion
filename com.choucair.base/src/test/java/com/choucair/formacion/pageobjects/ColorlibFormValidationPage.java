package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.yecht.Data;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ColorlibFormValidationPage extends PageObject {

    //campo required
    @FindBy(xpath = "//*[@id='req']")
    public WebElementFacade txtRequired;
    //campo seleccion de deporte 1
    @FindBy(xpath = "//*[@id='sport']")
    public WebElementFacade cmbSport1;
    //campo URL
    @FindBy(xpath = "//*[@id='url1']")
    public WebElementFacade txtUrl;
    //campo email
    @FindBy(id="email1")
    public WebElementFacade txtEmail1;
    //campo password1
    @FindBy(id="pass1")
    public WebElementFacade txtPass1;
    //campo password2
    @FindBy(id="pass2")
    public WebElementFacade txtPass2;
    //campo Minsize
    @FindBy(id="minsize1")
    public WebElementFacade txtMinsize1;
    //campo Maxsize
    @FindBy(id="maxsize1")
    public WebElementFacade txtMaxsize1;
    //campo number
    @FindBy(id="number2")
    public WebElementFacade txtNumber;
    //campo IP
    @FindBy(id="ip")
    public WebElementFacade txtIp;
    //campo Date
    @FindBy(id="date3")
    public WebElementFacade txtDate;
    //campo Date Earlier
    @FindBy(id="past")
    public WebElementFacade txtDateEarlier;
    //boton Validate
    @FindBy(xpath = "//*[@id='popup-validation']/div[14]/input")
    public WebElementFacade btnValidate;
    // Seleccion multiple de deporte
    @FindBy(xpath = "//*[@id='sport2']")
    public WebElementFacade cmbSport2;
    // Globo informativo
    @FindBy(xpath = "(//div[@class='formErrorContent'])[1]")
    public WebElementFacade globoInformativo;

    public void Required(String datoPrueba){
        txtRequired.click();
        txtRequired.clear();
        txtRequired.sendKeys(datoPrueba);
    }

    public void Select_Sport(String datoPrueba){
        cmbSport1.click();
        cmbSport1.selectByVisibleText(datoPrueba);
    }

    public void url(String datoPrueba){
        txtUrl.click();
        txtUrl.clear();
        txtUrl.sendKeys(datoPrueba);
    }

    public void email(String datoPrueba){
        txtEmail1.click();
        txtEmail1.clear();
        txtEmail1.sendKeys(datoPrueba);
    }

    public void password(String datoPrueba){
        txtPass1.click();
        txtPass1.clear();
        txtPass1.sendKeys(datoPrueba);
    }

    public void confirm_password(String datoPrueba){
        txtPass2.click();
        txtPass2.clear();
        txtPass2.sendKeys(datoPrueba);
    }

    public void minimun_field_size(String datoPrueba){
        txtMinsize1.click();
        txtMinsize1.clear();
        txtMinsize1.sendKeys(datoPrueba);
    }

    public void maximun_field_size(String datoPrueba){
        txtMaxsize1.click();
        txtMaxsize1.clear();
        txtMaxsize1.sendKeys(datoPrueba);
    }

    public void number(String datoPrueba){
        txtNumber.click();
        txtNumber.clear();
        txtNumber.sendKeys(datoPrueba);
    }

    public void ip(String datoPrueba){
        txtIp.click();
        txtIp.clear();
        txtIp.sendKeys(datoPrueba);
    }

    public void date(String datoPrueba){
        txtDate.click();
        txtDate.clear();
        txtDate.sendKeys(datoPrueba);
    }

    public void date_earlier(String datoPrueba){
        txtDateEarlier.click();
        txtDateEarlier.clear();
        txtDateEarlier.sendKeys(datoPrueba);
    }

    public void validate(){
        btnValidate.click();
    }

    public void Multiple_Select(String datoPrueba){
        cmbSport2.selectByVisibleText(datoPrueba);
    }

    public void form_sin_errores(){
      assertThat(globoInformativo.isCurrentlyVisible(),is(false));
    }

    public void form_con_errores(){
        assertThat(globoInformativo.isCurrentlyVisible(),is(true));
    }





}
