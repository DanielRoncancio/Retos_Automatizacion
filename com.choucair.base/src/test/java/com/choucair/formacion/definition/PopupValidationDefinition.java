package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ColorlibFormValidationSteps;
import com.choucair.formacion.steps.PopupValidationSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PopupValidationDefinition {
    @Steps
    PopupValidationSteps popupValidationSteps;
    @Steps
    ColorlibFormValidationSteps colorlibFormValidationSteps;
    @Given("^Autetico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void autetico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave)  {
    popupValidationSteps.login_colorlib(Usuario,Clave);
    }

    @Given("^Ingreso a la funcionalidad Forms Validation$")
    public void ingreso_a_la_funcionalidad_Forms_Validation()  {
    popupValidationSteps.ingresar_form_validation();
    }

    @When("^Diligencio formulario Popup Validation$")
    public void diligencio_formulario_Popup_Validation(DataTable dtDatosForm)  {
        List<List<String>> data = dtDatosForm.raw();
        for(int i = 1;i<data.size(); i++){
            colorlibFormValidationSteps.diligenciar_popup_datos_tabla(data, i);
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){}
            }
        }



    @Then("^Verifico ingreso exitoso$")
    public void verifico_ingreso_exitoso()  {
        colorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();

    }

    @Then("^verificar que se presente Globo informativo de validación$")
    public void verificar_que_se_presente_Globo_informativo_de_validación()  {
        colorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();
    }


}
