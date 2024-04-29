package autotest;

import com.codeborne.selenide.Selenide;
import homework2.LoginPage;
import org.junit.jupiter.api.BeforeEach;

public class MainPageTest {
    protected static final String LOGIN = "technopol69";
    protected static final String PASSWORD = "technopolisPassword";
    protected static final String URL = "https://ok.ru/";

    @BeforeEach
     public void authorization() {
        Selenide.open(URL);
        LoginPage loginPage = new LoginPage();
        loginPage.enteringLogin(LOGIN);
        loginPage.enteringPassword(PASSWORD);
        loginPage.clickAuthorizationButton();
    }
}
