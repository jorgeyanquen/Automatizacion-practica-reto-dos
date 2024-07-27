@Regresion
Feature: Bancolombia validation form
    The user must enter the required data in the forms
    Each field of the form performs mandatory simulations, data and format, the system must present the respective validations
    for each field through a text field

  @CasoExitoso

  Scenario: Successful completion of the simulation form, no validation message is displayed.
  Given the Bancolombia page is accessed
    And the credit simulation is performed
    When The simulation form is complete for the Fixed Rate installment for a Free Investment loan, with terms of 32 months
      | cuota           | fecha      | tipo tasa | producto            | plazo    | valor         |
      | Simula tu Cuota | 1992-08-31 | Tasa Fija | Libranza Protección | 36       | 10,000,000.00 |
    Then it is verified that the entry was successful

  @CasoExitoso2

  Scenario: Successful completion of the simulation form, no validation message is displayed.
    Given the Bancolombia page is accessed
    And the credit simulation is performed
    When The simulation form is complete for the Fixed Rate installment for a Free Investment loan, with terms of 48 months
      | cuota           | fecha      | tipo tasa | producto            | plazo    | valor         |
      | Simula tu Cuota | 1992-08-31 | Tasa Fija | Libranza Protección | 48       | 10,000,000.00 |
    Then it is verified that the entry was successful

  @CasoExitoso3

  Scenario: Successful completion of the simulation form, no validation message is displayed.
    Given the Bancolombia page is accessed
    And the credit simulation is performed
    When The simulation form is complete for the Fixed Rate installment for a Free Investment loan, with terms of 60 months
      | cuota           | fecha      | tipo tasa | producto            | plazo    | valor         |
      | Simula tu Cuota | 1992-08-31 | Tasa Fija | Libranza Protección | 60       | 10,000,000.00 |
    Then it is verified that the entry was successful

  @CasoExitoso4

  Scenario: Successful completion of the simulation form, no validation message is displayed.
    Given the Bancolombia page is accessed
    And the credit simulation is performed
    Then The simulation form is complete for a Free Investment loan with Variable Rate, with terms of 36 months
      | cuota           | fecha      | tipo tasa | producto            | plazo    | valor         |
      | Simula tu Cuota | 1992-08-31 | Tasa Variable | Libranza FOPEP | 36       | 10,000,000.00 |
    Then it is verified that the entry was successful

  @CasoExitoso5

  Scenario: Successful completion of the simulation form, no validation message is displayed.
    Given the Bancolombia page is accessed
    And the credit simulation is performed
    Then The simulation form is complete for a Free Investment loan with Variable Rate, with terms of 48 months
      | cuota           | fecha      | tipo tasa | producto            | plazo    | valor         |
      | Simula tu Cuota | 1992-08-31 | Tasa Variable | Libranza FOPEP | 48       | 10,000,000.00 |
    Then it is verified that the entry was successful

  @CasoExitoso6

  Scenario: Successful completion of the simulation form, no validation message is displayed.
    Given the Bancolombia page is accessed
    And the credit simulation is performed
    Then The simulation form is complete for a Free Investment loan with Variable Rate, with terms of 60 months
      | cuota           | fecha      | tipo tasa | producto            | plazo    | valor         |
      | Simula tu Cuota | 1992-08-31 | Tasa Variable | Libranza FOPEP | 60       | 10,000,000.00 |
    Then it is verified that the entry was successful