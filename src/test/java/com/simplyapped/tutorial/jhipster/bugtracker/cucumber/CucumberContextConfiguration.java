package com.simplyapped.tutorial.jhipster.bugtracker.cucumber;

import com.simplyapped.tutorial.jhipster.bugtracker.TutorialJhipsterBugtrackerApp;
import io.cucumber.java.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@WebAppConfiguration
@ContextConfiguration(classes = TutorialJhipsterBugtrackerApp.class)
public class CucumberContextConfiguration {

    @Before
    public void setup_cucumber_spring_context() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }

}
