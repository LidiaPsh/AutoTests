package homework2;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

//проигрывание музыки из раздела "Моя музыка"
public class MyMusicPage {
    private final SelenideElement MUSIC_BUTTON = $x("//button[@aria-label='Музыка']");

    private final SelenideElement MY_MUSIC = $x("//div[@data-tsid='library']");
    private final SelenideElement SELECT_TRACK = $x("//wm-track[@data-tsid='track']");
    private final SelenideElement PLAY_TRACK = $x("//wm-icon[@aria-label='Слушать']");
    private final SelenideElement STOP_TRACK = $x("//wm-icon[@aria-label='Пауза']");
    private final SelenideElement MY_MUSiC_DURATION = $x("//wm-player-duration[@aria-label='Прогресс']");


    //нажимаем на кнопку "Музыка" в верхнм тулбаре
    public void clickMusicButton() {
        MUSIC_BUTTON.shouldBe(visible).click();
    }

    //заходим в раздел "Моя музыка"
    public void clickMyMusic() {
        MY_MUSIC.shouldBe(visible).click();
    }

    //выбираем трек
    public void selectTrack() {
        SELECT_TRACK.shouldBe(visible).click();
    }

    //запускаем трек
    public void playTrack() {
        PLAY_TRACK.click();
        STOP_TRACK.click();
    }

    //проверяем, проигрывается ли музыка
    public String timeOfMyMusic() {
        return MY_MUSiC_DURATION.getAttribute("current-time");
    }
}
