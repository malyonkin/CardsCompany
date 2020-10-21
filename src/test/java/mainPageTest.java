import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class mainPageTest {
    //mvn clean test - запуск тестов
    //mvn allure:serve - Report will be generated into temp folder. Web server with results will start.
    //mvn allure:report - Report will be generated tо directory: target/site/allure-maven/index.html
    @Before
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @Test
    public void SearchEmpty() {
        open("https://www.rbc.ru/companies/");
        $(".home__search-form .search-form__btn").click();
        $("h3").shouldHave(Condition.text("Все результаты")); //тест
    }
}
