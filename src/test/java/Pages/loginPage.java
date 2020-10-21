package Pages;

import com.codeborne.selenide.Driver;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class loginPage extends basePage {
    public SelenideElement loginField = $("#login__username");
    public SelenideElement passwordField = $("#login__password");
    public SelenideElement signInButton = $("#login_enter");
    public SelenideElement termsOfUseLabel = $("label[for=\"login_agree\"]");

    public loginPage(String pageUrl) {
        super(pageUrl);
    }


    public void login(String email, String password) {
        loginField.setValue(email);
        passwordField.setValue(password);
        termsOfUseLabel.click();
        signInButton.click();
        //Driver.waitForUrlContains("account/accounts");
    }
}
