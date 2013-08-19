package Tan4ous.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import Tan4ous.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the http://qrcoder.ru/")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user enter the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("image not null")
    public void thenTheyShouldSeeADefinitionContainingTheWords() {
        endUser.should_see_definition();
    }

}
