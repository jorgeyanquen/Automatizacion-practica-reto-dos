@Regresion:
Feature: Bancolombia validation form
    The user must enter the required data in the forms
    Each field of the form performs mandatory simulations, data and format, the system must present the respective validations
    for each field through a text field

  @CasoExitoso

  Scenario: Successful completion of the simulation form, no validation message is displayed.
  Given the Bancolombia page is accessed
    And the credit simulation is performed
    When the simulation form is completed
      | cuota           | fecha      | tipo tasa | producto            | plazo    | valor         |
      | Simula tu Cuota | 1992-08-31 | Tasa Fija | Libranza Protección | 36       | 10,000,000.00 |
    Then it is verified that the entry was successful