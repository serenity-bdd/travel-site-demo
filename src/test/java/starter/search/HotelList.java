package starter.search;

import net.serenitybdd.screenplay.targets.Target;

class HotelList {
    static final Target LIST_OF_HOTELS = Target.the("List of hotels").locatedBy(".hotellist");
    static final Target HOTEL_NAMES = Target.the("Matching hotel names").locatedBy(".hotellist .name__copytext");
    static final Target HOTEL_LOCATIONS = Target.the("Matching hotel locations").locatedBy(".hotellist .location-details");
    static final Target HOTEL_NAME = Target.the("Matching hotel name").locatedBy("(//span[@data-qa='item-name'])[{0}]");
}
