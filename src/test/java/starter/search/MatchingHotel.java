package starter.search;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Collection;

public class MatchingHotel {
    public static Question<Collection<String>> names() {
        return Text.of(HotelList.HOTEL_NAMES).asAList();
    }

    public static Question<Collection<String>> locations() {
        return Text.of(HotelList.HOTEL_LOCATIONS).asAList();
    }

    public static Question<String> titleNumber(Integer hotelNumber) {
        return Text.of(HotelList.HOTEL_NAME.of(hotelNumber.toString())).asAString();
    }
}