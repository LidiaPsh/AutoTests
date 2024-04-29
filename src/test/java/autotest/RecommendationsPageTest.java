package autotest;

import homework2.MainPage;
import homework2.RecommendationsPage;
import org.junit.jupiter.api.Test;

public class RecommendationsPageTest extends MainPageTest{

    @Test
    public void clickRecButton(){
        MainPage mainPage = new MainPage();
        mainPage.clickRecommendations();
        RecommendationsPage recommendationsPage = new RecommendationsPage();
        recommendationsPage.clickNews();
    }
}
