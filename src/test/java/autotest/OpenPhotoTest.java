package autotest;

import Pages.MainPage;
import Pages.PhotoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OpenPhotoTest extends BaseTest {
    @Test
    public void openPhotoTest(){
        MainPage mainPage = new MainPage();
        mainPage.clickPhoto();
        PhotoPage photo = new PhotoPage();

        Assertions.assertTrue(photo.getAllPhotosName().contains("Все фото"));
        photo.clickMyPhotos();
        photo.clickPhotoOpen();
    }

}