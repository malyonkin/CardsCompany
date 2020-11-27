import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class mainPageTests {
    //mvn clean test - запуск тестов
    //mvn test -Dtest=mainPageTests
    //mvn allure:serve - Report will be generated into temp folder. Web server with results will start.
    //mvn allure:report - Report will be generated tо directory: target/site/allure-maven/index.html

    @BeforeAll
    static void setup() {
        //настройки браузера и тд
        //работа с БД - подготовка тестовых данных, наполнение или очистка данных
    }
    //@Before
    @BeforeEach
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    //@Test
    @Test
    @DisplayName("Проверка полного поиска - значение НУЛЕВОЕ/Не задано")
    public void SearchEmpty() throws InterruptedException {

        open("https://www.rbc.ru/companies/");
        $(".home__search-form .search-form__btn");
        getWebDriver().findElement(By.cssSelector(".home__search-form .search-form__btn")).click(); //использование selenium в selenide
        Thread.sleep(1000);
        $("h3").shouldHave(Condition.text("Все результаты"))
                            .shouldBe(exist)
                            .shouldBe(visible);
        }
}
