package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theTrivagoHomePage() {
        return Task.where("{0} opens the Trivago home page",
                Open.browserOn().thePageNamed("home.page")
        );
    }
}
