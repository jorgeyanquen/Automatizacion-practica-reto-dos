package com.practicados.Step;

import com.practicados.pages.SimulacionPagePrincipal;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class SimuladorValidationSteps {

    SimulacionPagePrincipal simulacionPagePrincipal;

    @Step
    public void diligenciar_simulacion_datos_tabla(List<List<String>> data, int id){

        simulacionPagePrincipal.simular(data.get(id).get(0).trim());
        simulacionPagePrincipal.fecha(data.get(id).get(1).trim());
        simulacionPagePrincipal.tipotasa(data.get(id).get(2).trim());
        simulacionPagePrincipal.producto(data.get(id).get(3).trim());
        simulacionPagePrincipal.plazo(data.get(id).get(4).trim());
        simulacionPagePrincipal.valor(data.get(id).get(5).trim());
        simulacionPagePrincipal.validate();

    }

    @Step
    public void ingresar_form_validation(){
        //abre el link de la pagina
        simulacionPagePrincipal.open();
        simulacionPagePrincipal.menuFormValidation();

    }

}
