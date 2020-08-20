package starter.search;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

class SearchForm {
    static final Target LOCATION = Target.the("Hotel name or destination").located(By.id("querytext"));
    static final Target PROPOSED_LOCATION = Target.the("Proposed location").locatedBy(".ssg-title");
    static final Target FIRST_AVAILABLE_DATE = Target.the("First available date").locatedBy(".cal-day.cal-is-selectable");

    static final Target NUMBER_OF_ADULTS = Target.the("Number of adults").located(By.id("adults-input"));
    static final Target NUMBER_OF_CHILDREN = Target.the("Number of children").located(By.id("children-input"));
    static final Target NUMBER_OF_ROOMS = Target.the("Number of rooms").located(By.id("rooms-input"));
    static final Target APPLY_BUTTON = Target.the("Apply button").locatedBy(".btn--apply-config");

}
