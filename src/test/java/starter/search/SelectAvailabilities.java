package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static starter.search.SearchForm.FIRST_AVAILABLE_DATE;

public class SelectAvailabilities {
    public static Task forTheFirstAvailableDates() {
        return Task.where("{0} selects availabilities for the first available dates",
                WaitUntil.the(FIRST_AVAILABLE_DATE, isClickable()),
                Click.on(FIRST_AVAILABLE_DATE),
                WaitUntil.the(FIRST_AVAILABLE_DATE, isClickable()),
                Click.on(FIRST_AVAILABLE_DATE)
        );
    }
}
