package homework2;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement NICKNAME = $x("//a[@data-l='t,userPage']");
    private final SelenideElement MESSAGES_BUTTON = $x("//button[@aria-label='Messages']");
    private final SelenideElement VIDEO_BUTTON = $x("//a[@aria-label='Видео']");


    public String pushLogin() {
        return NICKNAME.shouldBe(visible).getText();
    }

    //нажимаем на кнопку "Мессенджер" в верхнем тулбаре
    public void clickMessagesButton() {
        MESSAGES_BUTTON.shouldBe(visible).click();
    }

    //нажимаем на кнопку "Видео" в верхнем тулбаре
    public void clickVideoButton() {
        VIDEO_BUTTON.shouldBe(visible).click();
    }
}
