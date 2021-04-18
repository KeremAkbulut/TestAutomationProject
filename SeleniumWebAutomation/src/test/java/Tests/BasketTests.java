package Tests;


import base.BaseTest;
import constants.BasketPageConstants;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import page.BasketPage;

public class BasketTests extends BaseTest {
    BasketPage basketPage;

    @Test
    public void BasketTest() {
        basketPage.basketSelect().addBasket().comparison().
                increasingTheNumberOfProduct().deleteProduct();
    }
}
