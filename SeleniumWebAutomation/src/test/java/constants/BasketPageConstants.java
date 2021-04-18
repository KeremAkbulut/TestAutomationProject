package constants;

import org.openqa.selenium.By;

public class BasketPageConstants {
    public static String productPrice,
            basketPrice,
            message,
            emptyMessage = "Sepetinizde ürün bulunmamaktadır." + "\n" +
                    "Alışverişe devam etmek için anasayfaya gidebilir veya Günün Fırsatı ürünlerine göz atabilirsiniz.";

    public static final By add_basket = By.id("add-to-basket");
    public static final By product_list = By.cssSelector("#best-match-right > div.blueWrapper.clearfix > div.clearfix > ul > li");
    public static final By product_price = By.id("sp-price-lowPrice");
    public static final By GoToBasket = By.cssSelector("div.basket-container>a");
    public static final By basket_price = By.cssSelector("div.total-price>strong");
    public static final By NumberOfProduct = By.cssSelector("select.amount");
    public static final By delete_button = By.cssSelector("div>div>a.btn-delete>i.gg-icon");
    public static final By empty_basket = By.cssSelector("div.empty-cart-info>div:nth-of-type(2)>h2");
    public static final By NumberOfProductValue = By.xpath("//*[@class='amount']//*[@value='2']");
}

