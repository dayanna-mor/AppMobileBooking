
Feature: Reserva de alojamiento en la app mobile Booking

@ReservaBooking
  Scenario: Realizar una búsqueda de alojamiento
    Given : Ingreso a la aplicación Booking
    When : realizo una búsqueda de alojamiento en la ciudad de Cusco
    And : Selecciono las fechas de estadía
    And :Selecciono 1 habitación, 2 adultos y 1 niño de 5 años
    And : Selecciono 1 alojamiento de los resultados
    And : Reservo la primera opción de habitación disponible
    And ingreso los datos del huésped
    Then verifico los datos de la reserva
    And selecciono pagar con tarjeta de crédito