package Tan4ous.jbehave;

import net.thucydides.jbehave.ThucydidesJUnitStories;
import net.thucydides.jbehave.ThucydidesStepFactory;
import org.jbehave.core.steps.InjectableStepsFactory;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {

    @Override
    public InjectableStepsFactory stepsFactory() {
        return ThucydidesStepFactory.withStepsFromPackage("Tan4ous.jbehave.steps",configuration());
    }
}
