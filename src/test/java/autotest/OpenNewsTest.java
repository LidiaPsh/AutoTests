package autotest;

import homework2.MainPage;
import homework2.RecommendationsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OpenNewsTest extends BaseTest {
    @Test
    public void openNewsTest() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickRecommendations();
        RecommendationsPage recommendationsPage = new RecommendationsPage();
        recommendationsPage.clickNews();
        Thread.sleep(2000);
        Assertions.assertTrue(recommendationsPage.getNameNewsButton().contains("Новости"));
    }
}

