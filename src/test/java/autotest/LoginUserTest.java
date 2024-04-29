package autotest;

import homework2.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginUserTest extends BaseTest {


    @Test
    public void loginUser(){
        MainPage main = new MainPage();
        Assertions.assertEquals(main.getFullName(), "technopol69 technopol69");
    }
}
