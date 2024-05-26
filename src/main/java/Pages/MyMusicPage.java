package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

//проигрывание музыки из раздела "Моя музыка"
public class MyMusicPage implements LoadablePage {
    private final SelenideElement MUSIC_BUTTON = $x("//li[@data-l='t,music']");

    private final SelenideElement MY_MUSIC = $x("//div[@data-l='t,library']");
    private final SelenideElement SELECT_TRACK = $x("//wm-track[@data-tsid='track']");
    private final SelenideElement PLAY_TRACK = $x("//wm-icon[@data-l='t,play']");
    private final SelenideElement STOP_TRACK = $x("//wm-icon[@data-l='t,pause']");
    private final SelenideElement MY_MUSiC_DURATION = $x("//wm-player-duration[@data-l='t,player']");


    public MyMusicPage() {
        check();
    }

    @Override
    public void check() {
        MUSIC_BUTTON.shouldBe(visible);
    }

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
