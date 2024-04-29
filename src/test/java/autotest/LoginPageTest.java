package autotest;

import homework2.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends MainPageTest {
    @Test
    public void loginUser(){
        MainPage main = new MainPage();
        Assertions.assertEquals(main.pushLogin(), "technopol69 technopol69");
    }
}
