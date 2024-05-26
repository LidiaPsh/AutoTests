package autotest;

import Pages.MusicPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayMusicTest extends BaseTest {
    @Test
    public void playMusicTest(){
        MusicPage musicPage = new MusicPage();
        musicPage.clickMusicButton();
        musicPage.playMusic();
        Assertions.assertFalse(musicPage.timeOfMusic().equals(0));
    }

}
