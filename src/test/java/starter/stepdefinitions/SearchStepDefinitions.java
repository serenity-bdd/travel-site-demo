package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;
import starter.navigation.NavigateTo;
import starter.search.MatchingHotel;
import starter.search.SearchForHotels;
import starter.viewdetails.HotelDetails;
import starter.viewdetails.ThePhotos;
import starter.viewdetails.ViewHotelPhotos;

import java.util.Collection;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Given("{actor} is looking for a great hotel deal")
    public void openTheHomePage(Actor actor) {
        actor.attemptsTo(
                NavigateTo.theTrivagoHomePage()
        );
    }

    @When("{actor} searches/searched for a hotel in {}")
    public void searchesForAHotel(Actor actor, String location) {
        actor.attemptsTo(
                SearchForHotels.inLocation(location)
                                .forANumberOfRoomsOf(1)
                                .forANumberOfAdultsOf(1)
        );

    }

    @Then("{actor} should be presented with hotels in {}")
    public void shouldBePresentedWithMatchingHotels(Actor actor, String expectedLocation) {
        Collection<String> hotelLocations = MatchingHotel.locations().answeredBy(actor);
        assertThat(hotelLocations).allMatch(location -> location.contains(expectedLocation));
    }

    String selectedHotel;

    @When("{actor} views the deal for hotel number {int}")
    public void sheViewsTheDealForHotelNumber(Actor actor, int hotelNumber) {
        selectedHotel = MatchingHotel.titleNumber(hotelNumber).answeredBy(actor);

        actor.attemptsTo(
                ViewHotelPhotos.forHotelNumber(hotelNumber)
        );
    }

    @Then("the photos of this hotel should be displayed")
    public void theDetailsOfThisHotelShouldBeDisplayed() {

        List<String> hotelPhotos = ThePhotos.displayedForTheHotel().answeredBy(OnStage.theActorInTheSpotlight());
        assertThat(hotelPhotos).isNotEmpty();
    }
}
