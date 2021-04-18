package constants;

import org.openqa.selenium.By;

public class LoginPageConstants {

    public static String homeTitle="GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",
                         loginTitle="Üye Girişi - GittiGidiyor",
                         userName="Kerem Akbulut",
                         password="11111";

    public static final By user_name=By.id("L-UserNameField");
    public static final By Password=By.id("L-PasswordField");
    public static final By login_button=By.id("gg-login-enter");
    public static final By Login =By.cssSelector("div[data-cy='header-user-menu']");
    public static final By Logg =By.cssSelector("div>a[data-cy='header-login-button']");
}
