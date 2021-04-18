package page;

import base.BasePage;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static constants.LoginPageConstants.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    final static Logger logger = Logger.getLogger(String.valueOf(LoginPage.class));


    public void Login() {
        logger.info("Test Edilecek Site Açıldı.");
        Assert.assertEquals(homeTitle, getDriver().getTitle());
        logger.info("Ana Sayfanın Açıldığı Kontrol Edildi. ");
        hoverElement(Login);
        clickElement(Logg);
        logger.info("Login Sayfası Açıldı.");
        Assert.assertEquals(loginTitle, getDriver().getTitle());
        logger.info("Açılan Sayfanın Login Sayfası Olduğu Kontrol Edildi.");
        findElement(user_name).clear();
        sendKeys(user_name, userName);
        findElement(Password).clear();
        sendKeys(Password, password);
        clickElement(login_button);
        logger.info("Login İşlemi Gerçekleşti.");
        Assert.assertEquals(homeTitle, getDriver().getTitle());
        logger.info("Ana Sayfaya Yönlendirilme Kontrol Edildi.");
    }
}
