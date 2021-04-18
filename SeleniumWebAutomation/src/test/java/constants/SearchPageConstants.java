package constants;

import org.openqa.selenium.By;

public class SearchPageConstants {
    public static String text = "bilgisayar",
                         url = "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";

    public static final By search = By.cssSelector("form>div>div[class='sc-1yew439-3 dkiUfE']");
    public static final By search_text = By.name("k");
    public static final By search_btn = By.cssSelector("div>button[data-cy='search-find-button']");
    public static final By pagination = By.cssSelector("div.pager>ul>li:nth-of-type(2)>a");
}
