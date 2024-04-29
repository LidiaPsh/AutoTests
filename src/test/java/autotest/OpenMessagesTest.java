package autotest;

import homework2.MainPage;
import homework2.MessagesPage;
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
