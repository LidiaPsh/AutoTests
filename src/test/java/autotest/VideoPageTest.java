package autotest;

import homework2.MainPage;
import homework2.VideoPage;
import org.junit.jupiter.api.Test;

public class VideoPageTest extends MainPageTest {
    @Test
    public void clickVideoButton() {
        MainPage mainPage = new MainPage();
        mainPage.clickVideoButton();
        VideoPage videoPage = new VideoPage();
        videoPage.clickMoviesButton();
        videoPage.clickHomeButton();
    }
}
