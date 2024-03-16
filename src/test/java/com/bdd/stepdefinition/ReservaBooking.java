package com.bdd.stepdefinition;

import com.bdd.view.ReservaBookingView;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class ReservaBookingStepDefinition {

    private ReservaBookingView ReservaBookingView() {
        return new ReservaBookingView();
    }

    @Given("Ingreso a la aplicación Booking")
    public void ingreso_a_la_aplicacion_Booking() throws MalformedURLException {
        ReservaBookingView.setAndroidDriver();
    }

    @When("realizo una búsqueda de alojamiento en la ciudad de Cusco")
    public void realizo_una_busqueda_de_alojamiento_en_la_ciudad_de_cusco() {
        ReservaBookingView().clicBuscador();
    }

    @And("Selecciono las fechas de estadía)
    public void Selecciono_las_fechas_de_estadía() {
        ReservaBookingView().seleccionarFechas();
    }

    @And("Selecciono 1 habitación, 2 adultos y 1 niño de 5 años")
    public void Selecciono_1_habitación,_2 adultos_y_1_niño_de_5_año) {
        ReservaBookingView().seleccionarSolicitudes(sSolicitudes);
    }

    @And("Selecciono 1 alojamiento de los resultados")
    public void Selecciono_1_alojamiento_de_los_resultados() {
        ReservaBookingView().clicAlojamiento();
    }

    @And("ingreso los datos del huésped")
    public void ingreso_los_datos_del_huésped() {
        ReservaBookingView().escribirDatos();
    }

    @Then("verifico los datos de la reserva")
    public void verifico_los_datos_de_la_reserva() {
        ReservaBookingView().validarPantalla();
    }

    @Then("selecciono pagar con tarjeta de crédito")
    public void selecciono_pagar_con_tarjeta_de_crédito() {
        ReservaBookingView().SeleccionarMedioPago();
    }

}





