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
   // SimulacionTasaVariableValidationSteps simulacionTasaVariableValidationSteps;

    @Given("the Bancolombia page is accessed")
    public void the_bancolombia_page_is_accessed() {
        simuladorValidationSteps.ingresar_form_validation();
    }

    @Given("the credit simulation is performed")
    public void the_credit_simulation_is_performed() {
        simuladorValidationSteps.ingresar_form_validation();
    }
    @When("The simulation form is complete for the Fixed Rate installment for a Free Investment loan, with terms of 32 months")
    public void The_simulation_form_is_complete_for_the_Fixed_Rate_installment_for_a_Free_Investment_loan_with_terms_of_32_months(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();

        for(int i=1; i<cells.size(); i++){
            simuladorValidationSteps.diligenciar_simulacion_datos_tabla(cells, i);
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){}
        }
    }

    @When("The simulation form is complete for the Fixed Rate installment for a Free Investment loan, with terms of 48 months")
    public void The_simulation_form_is_complete_for_the_Fixed_Rate_installment_for_a_Free_Investment_loan_with_terms_of_48_months(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();

        for(int i=1; i<cells.size(); i++){
            simuladorValidationSteps.diligenciar_simulacion_datos_tabla(cells, i);
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){}
        }
    }

    @When("The simulation form is complete for the Fixed Rate installment for a Free Investment loan, with terms of 60 months")
    public void The_simulation_form_is_complete_for_the_Fixed_Rate_installment_for_a_Free_Investment_loan_with_terms_of_60_months(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();

        for(int i=1; i<cells.size(); i++){
            simuladorValidationSteps.diligenciar_simulacion_datos_tabla(cells, i);
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){}
        }
    }

    @When("The simulation form is complete for a Free Investment loan with Variable Rate, with terms of 36 months")
    public void The_simulation_form_is_complete_for_a_Free_Investment_loan_with_Variable_Rate_with_terms_of_36_months(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();

        for(int i=1; i<cells.size(); i++){
            simuladorValidationSteps.diligenciar_simulacion_datos_tabla(cells, i);
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){}
        }
    }

    @When("The simulation form is complete for a Free Investment loan with Variable Rate, with terms of 48 months")
    public void The_simulation_form_is_complete_for_a_Free_Investment_loan_with_Variable_Rate_with_terms_of_48_months(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();

        for(int i=1; i<cells.size(); i++){
            simuladorValidationSteps.diligenciar_simulacion_datos_tabla(cells, i);
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){}
        }
    }

    @When("The simulation form is complete for a Free Investment loan with Variable Rate, with terms of 60 months")
    public void The_simulation_form_is_complete_for_a_Free_Investment_loan_with_Variable_Rate_with_terms_of_60_months(DataTable dtDatosForm) {
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
