package homework2;

import static com.codeborne.selenide.Condition.visible;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class PhotoPage {
    private final SelenideElement MY_PHOTO_BUTTON = $x("//a[@data-l='t,title']");
    private final SelenideElement PHOTO_OPEN_BUTTON = $x("//img[@id='img_960759367751']");
    private final SelenideElement ALL_PHOTOS = $x("//a[@data-l='t,albums']");

    public PhotoPage() {
        check();
    }

    public void check(){
        MY_PHOTO_BUTTON.shouldBe(visible);
    }

    //нажимаем на "Личные фотографии"
    public void clickMyPhotos(){
        MY_PHOTO_BUTTON.shouldBe(visible).click();
    }

    public String getAllPhotosName(){
        return ALL_PHOTOS.shouldBe(visible).getText();
    }

    //открываем фотографию
    public void clickPhotoOpen(){
        PHOTO_OPEN_BUTTON.shouldBe(visible).click();
    }

}
