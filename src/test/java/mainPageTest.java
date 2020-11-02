import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class mainPageTest {
    //mvn clean test - запуск тестов
    //mvn allure:serve - Report will be generated into temp folder. Web server with results will start.
    //mvn allure:report - Report will be generated tо directory: target/site/allure-maven/index.html
    @Before
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @Test
    public void SearchEmpty() throws InterruptedException {

        open("https://www.rbc.ru/companies/");
        $(".home__search-form .search-form__btn");
        getWebDriver().findElement(By.cssSelector(".home__search-form .search-form__btn")).click(); //использование selenium в selenide
        Thread.sleep(1000);
        $("h3").shouldHave(Condition.text("Все результаты")); //тест
        }
}
