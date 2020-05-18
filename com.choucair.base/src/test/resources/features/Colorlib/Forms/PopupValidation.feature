#Sample feature definition template

@Regresion
Feature: Formulario Popup Validation
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe de presentar las validaciones respectivas
  para cada campo a través de un globo informativo.

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario Popup Validation,
  no se presenta ningun mensaje de validación.
    Given Autetico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio formulario Popup Validation
      | Required | Select | MultipleS1 | MultipleS2 | Url                 |Email          |Password1  |Password2  |MinSize |MaxSize | Number | IP         |Date      | DateEarlier |
      | Valor1   | Golf   | Tennis     | Golf       |http://www.valor1.com|valor1@mail.com|valor1     |valor1     |123456  |123456  | -99.99 | 200.200.5.4|2018-01-22|2012/09/12   |
    Then Verifico ingreso exitoso

   @CasoAlterno
   Scenario: Diligenciamiento con errores del formulario Popup Validation,
   Se presenta Globo informativo indicando error en el diligenciamiento de alguno de los campos.
     Given Autetico en colorlib con usuario "demo" y clave "demo"
     And Ingreso a la funcionalidad Forms Validation
     When Diligencio formulario Popup Validation
       | Required | Select | MultipleS1 | MultipleS2 | Url                 |Email          |Password1  |Password2  |MinSize |MaxSize | Number | IP         |Date      | DateEarlier |
       |          | Golf   | Tennis     | Golf       |http://www.valor1.com|valor1@mail.com|valor1     |valor1     |123456  |123456  | -99.99 | 200.200.5.4|2018-01-22|2012/09/12   |
       | valor1   | Golf   |Choose a sport  | Golf       |http://www.valor1.com|valor1@mail.com|valor1     |valor1     |123456  |123456  | -99.99 | 200.200.5.4|2018-01-22|2012/09/12   |
     Then verificar que se presente Globo informativo de validación