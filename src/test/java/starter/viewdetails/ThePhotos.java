package starter.viewdetails;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static starter.viewdetails.HotelDetails.PHOTOS;

public class ThePhotos {
    public static Question<List<String>> displayedForTheHotel() {
        return actor -> PHOTOS.resolveAllFor(actor)
                .stream()
                .map(element -> element.getAttribute("data-imageid"))
                .collect(Collectors.toList());
    }
}
