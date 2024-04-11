package autotest;

import homework2.MainPage;
import homework2.PhotoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhotoPageTest extends MainPageTest {
    @Test
    public void clickPhotoButton(){
        MainPage mainPage = new MainPage();
        mainPage.clickPhoto();
        PhotoPage photo = new PhotoPage();
        photo.clickMyPhotos();
        photo.clickPhotoOpen();
    }

}
