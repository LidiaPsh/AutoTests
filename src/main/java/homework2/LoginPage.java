package homework2;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;


public class LoginPage {
    private final SelenideElement LOGIN = $x("//input[@name='st.email']");
    private final SelenideElement PASSWORD = $x("//input[@name='st.password']");
    private final SelenideElement ENTER_BUTTON = $x("//input[@type = 'submit']");

    //вводим валидный логин
    public void enteringLogin(String login) {
        LOGIN.shouldBe(visible).setValue(login);
    }

    //вводим валидный пароль
    public void enteringPassword(String password) {
        PASSWORD.shouldBe(visible).setValue(password);
    }

    //нажимаем на кнопку авторизации
    public void clickAuthorizationButton() {
        ENTER_BUTTON.shouldBe(visible).click();
    }

}
