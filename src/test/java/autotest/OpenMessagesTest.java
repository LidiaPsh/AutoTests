package autotest;

import Pages.MainPage;
import Pages.MessagesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class OpenMessagesTest extends BaseTest {
    @Test
    public void openMessagesTest(){
        MainPage mainPage = new MainPage();
        mainPage.clickMessagesButton();
        MessagesPage messagesPage = new MessagesPage();
        messagesPage.clickCHat();
        Assertions.assertEquals(messagesPage.getNameResentChat(),"Сервисные уведомления");
      //  messagesPage.clickHomeButton();

    }
}
