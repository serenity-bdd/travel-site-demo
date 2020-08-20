package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.SilentTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SelectALocation {
    public static Performable of(String location) {
        return SilentTask.where(
                Enter.theValue(location).into(SearchForm.LOCATION),
                Click.on(SearchForm.PROPOSED_LOCATION)
        );
    }
}
