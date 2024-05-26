package autotest;

import Pages.MainPage;
import Pages.PhotoPage;
import Pages.ReactPhotoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReactPhotoTest extends BaseTest {
    @Test
    public void reactPhotoTest(){
        MainPage mainPage = new MainPage();
        mainPage.clickPhoto();
        PhotoPage photo = new PhotoPage();

        Assertions.assertTrue(photo.getAllPhotosName().contains("Все фото"));
        photo.clickMyPhotos();
        photo.clickPhotoOpen();

        ReactPhotoPage reactPhotoPage = new ReactPhotoPage();
        reactPhotoPage.clickReactButton();
    }
}
