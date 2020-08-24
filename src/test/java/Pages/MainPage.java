package Pages;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    @Test
    public void SearchEmpty() {
        open("https://www.rbc.ru/companies/");
        $(".home__search-form .search-form__btn").click();
        $("h3").shouldHave(Condition.text("Все результаты")); //тест
    }
}
