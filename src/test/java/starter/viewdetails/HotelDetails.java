package starter.viewdetails;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HotelDetails {
    public static Target HOTEL_TITLE = Target.the("title for hotel {0}").locatedBy("(//span[@data-qa='item-name'])[{0}]");
    public static Target INFO_TAB = Target.the("Info tab").located(By.cssSelector("[data-qa-id='info']"));
    public static Target PHOTOS_TAB = Target.the("Photos tab").located(By.cssSelector("[data-qa-id='gallery']"));
    public static Target INFO_TITLE = Target.the("Info tab title").located(By.cssSelector(".sl-box__title"));
    public static Target SHIMMER = Target.the("Shimmer effect").located(By.cssSelector(".shimmer"));
    public static Target PHOTOS = Target.the("displayed photos").located(By.cssSelector("[data-imageid]"));
}
