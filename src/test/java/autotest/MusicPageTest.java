package autotest;

import homework2.MainPage;
import homework2.MusicPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MusicPageTest extends MainPageTest {
    @Test
    public void playMusic(){

        MusicPage musicPage = new MusicPage();
        musicPage.clickMusicButton();
        musicPage.playMusic();
        Assertions.assertFalse(musicPage.timeOfMusic().equals(0));
    }

}
