package Tests;

import base.BaseTest;
import org.junit.Test;
import page.LoginPage;

public class LoginTests extends BaseTest {
    LoginPage loginPage;

    @Test
    public void LoginTest() {

        loginPage.Login();
    }
}
