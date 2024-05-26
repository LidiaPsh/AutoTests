package autotest;

import Pages.MainPage;
import Pages.VideoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OpenVideoTest extends BaseTest {
    @Test
    public void openVideoTest() {
        MainPage mainPage = new MainPage();
        mainPage.clickVideoButton();
        VideoPage videoPage = new VideoPage();
        Assertions.assertTrue(videoPage.getMoviesName().contains("Фильмы"));
        videoPage.clickMoviesButton();
        videoPage.clickHomeButton();
    }
}
