package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.visible;


public class RecommendationsPage implements LoadablePage{
    private final SelenideElement NEWS_BUTTON = $x("//a[@class='filter_i']");
    private final SelenideElement ACTIVE_BUTTON = $x("//a[@class='filter_i __active']");

    public RecommendationsPage() {
        check();
    }

    @Override
    public void check(){
        NEWS_BUTTON.shouldBe(visible);
    }

    //открываем раздел "Новости"
    public void clickNews(){
        NEWS_BUTTON.shouldBe(visible).click();
    }
    public String getNameNewsButton(){
        return ACTIVE_BUTTON.shouldBe(visible).getText();
    }
}


