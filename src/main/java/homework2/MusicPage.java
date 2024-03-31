package homework2;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MusicPage {
    private final SelenideElement MUSIC_BUTTON = $x("//button[@aria-label='Музыка']");
    private final SelenideElement MUSIC_PLAY = $x("//wm-icon[@icon='play']");
    private final SelenideElement MUSIC_STOP = $x("//button[@data-tsid='pause_button']");
    private final SelenideElement MUSIC_DURATION = $x("//wm-player-duration[@aria-label='Прогресс']");

    //нажимаем на кнопку "Музыка" в верхнм тулбаре
    public void clickMusicButton() {
        MUSIC_BUTTON.shouldBe(visible).click();
    }

    //запускаем музыку
    public void playMusic() {
        MUSIC_PLAY.shouldBe(visible).click();
        MUSIC_STOP.shouldBe(visible).click();
    }

    //проверяем, проигрывается ли музыка
    public String timeOfMusic() {
        return MUSIC_DURATION.getAttribute("current-time");
    }

}
