package com.bdd.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(plugin = {"json:targe/build/cucumber.json"},
        features = {"src/test/resources/"},
        glue = "com.bdd.stepdefinition",
        tags = "@ReservaBooking"
)
public class RunnerTest {
}
