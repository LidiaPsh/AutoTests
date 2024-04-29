package autotest;

import homework2.MainPage;
import homework2.MessagesPage;
import org.junit.jupiter.api.Test;

public class MessagesPageTest extends MainPageTest{

    @Test
    public void clickMessagesButton(){
        MainPage mainPage = new MainPage();
        mainPage.clickMessagesButton();
        MessagesPage messagesPage = new MessagesPage();
        messagesPage.clickCHat();
        messagesPage.clickHomeButton();
    }
}
