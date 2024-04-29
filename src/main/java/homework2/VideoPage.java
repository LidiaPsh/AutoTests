package homework2;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class VideoPage {
    private final SelenideElement MOVIES_BUTTON = $x("//div[contains(text(),'Фильмы')]");
    private final SelenideElement HOME_BUTTON = $x("//a[@data-l='t,userMain']");

    //нажимаем на кнопку "Фильмы"
    public void clickMoviesButton() {
        MOVIES_BUTTON.shouldBe(visible).click();
    }

    //нажимаем на кнопку "Дом"
    public void clickHomeButton() {
        HOME_BUTTON.shouldBe(visible).click();

    }
}
