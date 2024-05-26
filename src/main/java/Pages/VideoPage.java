package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class VideoPage implements LoadablePage{
    private final SelenideElement MOVIES_BUTTON = $x("//div[contains(text(),'Фильмы')]");
    private final SelenideElement HOME_BUTTON = $x("//a[@data-l='t,userMain']");
    private final SelenideElement MOVIES_NAME = $x("//a[@href='/video/kino']");

    public VideoPage() {
        check();
    }

    @Override
    public void check(){
        MOVIES_BUTTON.shouldBe(visible);
    }

    //нажимаем на кнопку "Фильмы"
    public void clickMoviesButton() {
        MOVIES_BUTTON.shouldBe(visible).click();
    }

    public String getMoviesName(){
        return MOVIES_NAME.shouldBe(visible).getText();
    }

    //нажимаем на кнопку "Дом"
    public void clickHomeButton() {
        HOME_BUTTON.shouldBe(visible).click();
    }
}
