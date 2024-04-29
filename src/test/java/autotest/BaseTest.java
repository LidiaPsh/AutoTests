package autotest;

import com.codeborne.selenide.Selenide;
import homework2.LoginPage;
import homework2.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
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

    @AfterEach
    public void logOut() {
        Selenide.open(URL);
        MainPage mainPage = new MainPage();
        mainPage.logOut();
    }
}
