package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ReactPhotoPage implements LoadablePage {
    final SelenideElement REACT_PHOTO_BUTTON = $x("//span[@data-module='ReactComponent']");

    public ReactPhotoPage(){
        check();
    }

    @Override
    public void check(){
        REACT_PHOTO_BUTTON.shouldBe(visible);
    }

    //Ставим реакцию к фотографии в нашем альбоме
    public void clickReactButton() {
        REACT_PHOTO_BUTTON.shouldBe(visible).click();
    }

}
