package autotest;

import homework2.MainPage;
import homework2.PhotoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OpenPhotoTest extends BaseTest {
    @Test
    public void openPhotoTest(){
        MainPage mainPage = new MainPage();
        mainPage.clickPhoto();
        PhotoPage photo = new PhotoPage();
        photo.clickMyPhotos();
        Assertions.assertTrue(photo.getAllPhotosName().contains("Все фото"));
        photo.clickPhotoOpen();


    }

}
