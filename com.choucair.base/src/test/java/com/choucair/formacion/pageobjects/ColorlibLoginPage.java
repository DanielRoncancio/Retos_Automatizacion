package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElementFacade txtUsername;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElementFacade txtPassword;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElementFacade btnSignIn;
    @FindBy(xpath = "//h1[@id='bootstrap-admin-template']")
    public WebElementFacade lblHomePpal;

    public void IngresarDatos(String strUsuario, String strPass){
        txtUsername.sendKeys(strUsuario);
        txtPassword.sendKeys(strPass);
        btnSignIn.click();
    }

    public void VerificaHome(){
        String labelv = "Bootstrap-Admin-Template";
        String strMensaje = lblHomePpal.getText();
        assertThat(strMensaje, containsString(labelv));
    }

}
