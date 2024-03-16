Feature: Buscar Destino

  @BuscarHotel
  Scenario: Buscar Hotel para nuestro destino
    Given ingreso a la aplicacion Airbnb
    When doy clic a buscador
    And doy clic a buscar destino
    And escribo el destino "Cusco"
    Then valido que nos nuestra la fecha a reservar