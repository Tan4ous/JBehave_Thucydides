package Tan4ous.steps;

import Tan4ous.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static com.thoughtworks.selenium.SeleneseTestCase.assertEquals;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;

    public EndUserSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.openThis();
    }

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition() {
        assertEquals(dictionaryPage.getDefinitions(), true);
    }


    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
}
