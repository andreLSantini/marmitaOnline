package santini.tecnologia.application.cucumber.stepdefs;

import santini.tecnologia.application.MarmitaOnlineApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MarmitaOnlineApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
