package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;
import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {

    ColorlibLoginPage colorlibLoginPage;
    ColorlibMenuPage colorlibMenuPage;

    @Step
    public void login_colorlib(String strUsuario, String strPass){
        //abrir el navegador con la url de la prueba
        colorlibLoginPage.open();
        /*ingresar usuario demo
        ingresar  contraseña demo
        Clic en el boton Sign in
         */
        colorlibLoginPage.IngresarDatos(strUsuario,strPass);
        //verificar la autenticacion (label en home)
        colorlibLoginPage.VerificaHome();

    }

    @Step
    public void ingresar_form_validation(){
        colorlibMenuPage.menuFormValidation();
    }
}
