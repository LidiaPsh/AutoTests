package homework2;

import static com.codeborne.selenide.Condition.visible;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;


public class MessagesPage {
    private final SelenideElement CHAT_BUTTON = $x("//a[@href='/messages/c95304230131230']");
    private final SelenideElement HOME_BUTTON = $x("//msg-icon[@icon='home']");

    //нажимаем на чат и переходим в месенджер
    public void clickCHat() {
        CHAT_BUTTON.shouldBe(visible).click();
    }

    //нажимаем на "Дом", чтобы вернуться к списку чатов
    public void clickHomeButton() {
        HOME_BUTTON.shouldBe(visible).click();
    }

}
