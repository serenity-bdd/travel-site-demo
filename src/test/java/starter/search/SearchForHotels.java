package starter.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchForHotels implements Task {
    private String location;
    private Integer numberOfRooms = 1;
    private Integer numberOfAdults = 1;
    private Integer numberOfChildren = 0;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectALocation.of(location),
                SelectAvailabilities.forTheFirstAvailableDates(),
                SetAccommodation.to(numberOfAdults,numberOfChildren, numberOfRooms),
                WaitUntil.the(HotelList.LIST_OF_HOTELS, isVisible())
        );
    }

    public SearchForHotels() {
    }

    public SearchForHotels(String location) {
        this.location = location;
    }

    public static SearchForHotels inLocation(String location) {
        return new SearchForHotels(location);
    }

    public SearchForHotels forANumberOfRoomsOf(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    public SearchForHotels forANumberOfAdultsOf(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
        return this;
    }

    public SearchForHotels forANumberOfChildrenOf(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
        return this;
    }
}
