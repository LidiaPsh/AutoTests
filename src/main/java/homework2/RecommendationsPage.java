package homework2;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.visible;


public class RecommendationsPage {
    private final SelenideElement NEWS_BUTTON = $x("//a[@class='filter_i']");

    //открываем раздел "Новости"
    public void clickNews(){
        NEWS_BUTTON.shouldBe(visible).click();
    }

}
