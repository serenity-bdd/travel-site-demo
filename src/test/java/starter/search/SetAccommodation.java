package starter.search;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

public class SetAccommodation {
    public static Task to(Integer adults, Integer children, Integer rooms) {
        return Task.where("Set accommodation to " + adults + " adults, " + children + ", children and " + rooms + " rooms",
                Enter.theValue(Keys.BACK_SPACE, adults.toString()).into(SearchForm.NUMBER_OF_ADULTS),

                Enter.theValue(Keys.BACK_SPACE, children.toString()).into(SearchForm.NUMBER_OF_CHILDREN),

                Enter.theValue(Keys.BACK_SPACE, rooms.toString()).into(SearchForm.NUMBER_OF_ROOMS),

                Click.on(SearchForm.APPLY_BUTTON)
        );
    }
}
