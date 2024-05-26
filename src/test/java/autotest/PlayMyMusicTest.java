package autotest;

import Pages.MyMusicPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayMyMusicTest extends BaseTest {
    @Test
    public void playMyMusicTest() {
        MyMusicPage music = new MyMusicPage();
        music.clickMusicButton();
        music.clickMyMusic();
        music.selectTrack();
        Assertions.assertFalse(music.timeOfMyMusic().equals(0));
    }
}
