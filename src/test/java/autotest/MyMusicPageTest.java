package autotest;

import homework2.MainPage;
import homework2.MyMusicPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyMusicPageTest extends MainPageTest {
    @Test
    public void playMyMusic(){
        MyMusicPage music = new MyMusicPage();
        music.clickMusicButton();
        music.clickMyMusic();
        music.selectTrack();
        Assertions.assertFalse(music.timeOfMyMusic().equals(0));
    }
}
