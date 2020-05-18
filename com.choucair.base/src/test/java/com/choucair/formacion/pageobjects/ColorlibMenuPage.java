package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibMenuPage extends PageObject {

    //Menu forms
    @FindBy(xpath = "//*[@id='menu']/li[6]/a")
    public WebElementFacade menuForms;

    //Submenu Forms General
    @FindBy(xpath = "//a[@href='form-general.html'][contains(.,'Form General')]")
    public WebElementFacade menuFormGeneral;

    //Submenu Forms Validation
    @FindBy(xpath = "//a[@href='form-validation.html'][contains(.,'Form Validation')]")
    public WebElementFacade menuFormValidation;

    //Form Validation Label informativo
    @FindBy(xpath = "//*[@id='content']/div/div/div[1]/div/div/header/h5")
    public WebElementFacade lblFormValidation;

    public void menuFormValidation(){
        menuForms.click();
        menuFormValidation.click();
        String strMensaje = lblFormValidation.getText();
        assertThat(strMensaje, containsString("Popup Validation"));

    }



}
