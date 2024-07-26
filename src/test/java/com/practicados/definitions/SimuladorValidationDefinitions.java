package com.practicados.definitions;

import com.practicados.Step.SimuladorValidationSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class SimuladorValidationDefinitions {

    @Steps
    SimuladorValidationSteps simuladorValidationSteps;

    @Given("the Bancolombia page is accessed")
    public void the_bancolombia_page_is_accessed() {
        simuladorValidationSteps.ingresar_form_validation();
        }

    @Given("the credit simulation is performed")
    public void the_credit_simulation_is_performed() {
        simuladorValidationSteps.ingresar_form_validation();
    }
    @When("the simulation form is completed")
    public void the_simulation_form_is_completed(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();

        for(int i=1; i<cells.size(); i++){
            simuladorValidationSteps.diligenciar_simulacion_datos_tabla(cells, i);
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){}
        }
    }
    @Then("it is verified that the entry was successful")
    public void it_is_verified_that_the_entry_was_successful() {

    }

}
