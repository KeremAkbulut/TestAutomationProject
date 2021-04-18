package Tests;

import base.BaseTest;
import org.junit.Test;
import page.SearchPage;

public class SearchTests extends BaseTest {
        SearchPage searchPage;

    @Test
    public void SearchTest() {
        searchPage.search().secondPage();
    }
}
