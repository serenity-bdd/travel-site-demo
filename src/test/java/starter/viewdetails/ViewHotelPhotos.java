package starter.viewdetails;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ViewHotelPhotos {
    public static Performable forHotelNumber(Integer hotelNumber) {
        return Task.where("{0} views the details for hotel number " + hotelNumber,
                Click.on(HotelDetails.HOTEL_TITLE.of(hotelNumber.toString())),
                WaitUntil.the(HotelDetails.PHOTOS_TAB, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(HotelDetails.PHOTOS_TAB)
        );
    }
}
