package com.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        glue = {"com.example"},
        tags = "@pr_test",
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Reporting options
        monochrome = true // Output in a readable format
)
public class TestRunner {
}
