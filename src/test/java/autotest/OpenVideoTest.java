package autotest;

import homework2.MainPage;
import homework2.VideoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OpenVideoTest extends BaseTest {
    @Test
    public void openVideoTest() {
        MainPage mainPage = new MainPage();
        mainPage.clickVideoButton();
        VideoPage videoPage = new VideoPage();
        videoPage.clickMoviesButton();
        Assertions.assertTrue(videoPage.getMoviesName().contains("Фильмы"));
        videoPage.clickHomeButton();
    }
}
