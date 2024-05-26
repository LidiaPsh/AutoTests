package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MusicPage implements LoadablePage {
    private final SelenideElement MUSIC_BUTTON = $x("//li[@data-l='t,music']");
    private final SelenideElement MUSIC_PLAY = $x("//button[@data-l='t,play']");
    private final SelenideElement MUSIC_STOP = $x("//button[@data-l='t,pause']");
    private final SelenideElement MUSIC_DURATION = $x("//wm-player-duration[@data-l='t,player']");

    public MusicPage() {
        check();
    }

    @Override
    public void check(){
        MUSIC_BUTTON.shouldBe(visible);
    }

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
