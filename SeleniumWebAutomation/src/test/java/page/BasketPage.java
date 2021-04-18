package page;

import base.BasePage;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static constants.BasketPageConstants.*;

public class BasketPage extends BasePage {
    final static Logger logger = Logger.getLogger(String.valueOf(BasketPage.class));

    public BasketPage(WebDriver driver) {
        super(driver);
    }
    public BasketPage basketSelect(){
        Random random = new Random();
        int index =random.nextInt()+1;
        logger.info("Açılan Ürünlerden Rastgele Bir Ürün Seçiliyor.");
        List<WebElement> products = getDriver().findElements(product_list);
        products.get(index).click();
        logger.info("Açılan Ürünlerden Rastgele Bir Ürün Seçildi.");

        return this;
    }

    public BasketPage addBasket()  {
        productPrice = getDriver().findElement(product_price).getText();
        logger.info("Seçilen Ürünün Fiyatı :" +productPrice);
        logger.info("Sepete Ekle'ye Tıklandı.");

        WebElement element = getDriver().findElement(add_basket);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        logger.info("Sepete eklendi.");

        return this;
    }

    public BasketPage comparison() {
        productPrice = driver.findElement(product_price).getText();

        WebElement element = getDriver().findElement(GoToBasket);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

        basketPrice = getDriver().findElement(basket_price).getText();
        logger.info("Sepetteki Ürünün Fiyatı :" + basketPrice);
        Assert.assertEquals(productPrice,basketPrice);
        logger.info("Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırıldı.");

        return this;
    }

    public BasketPage increasingTheNumberOfProduct() {
        findElement(NumberOfProduct).click();
        findElement(NumberOfProductValue).click();
        Assert.assertEquals("Ürün Toplamı (2 Adet)",NumberOfProductValue);
        logger.info("ürün sayısı artırıldı ve 2 adet olduğu kontrol edildi.");

        return this;
    }

    public BasketPage deleteProduct() {
        findElement(delete_button).click();
        message=findElement(empty_basket).getText();
        Assert.assertEquals(emptyMessage,message);
        logger.info("Sepet boşaltıldı ve test tamamlandı.");
        driver.quit();

        return this;
    }



}
