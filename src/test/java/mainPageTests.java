import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class mainPageTests {
    //mvn clean test - запуск тестов
    //mvn test -Dtest=mainPageTests
    //mvn allure:serve - Report will be generated into temp folder. Web server with results will start.
    //mvn allure:report - Report will be generated tо directory: target/site/allure-maven/index.html

    @BeforeAll
    static void setup() { //ВАЖНО: Для Allure необходимо настроить сравнение результатов с историей - Trend - https://github.com/fescobar/allure-docker-service#keep-history-and-trends
        //настройки браузера и тд
        //работа с БД - подготовка тестовых данных, наполнение или очистка данных
    }
    //@Before
    @BeforeEach
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @Severity(value = SeverityLevel.TRIVIAL)
    @Issue(value = "RBCNEW-123") //указывается ID дефекта в баг-треккинговой системе
    @TmsLinks({@TmsLink(value = "X-ray-135"), @TmsLink(value = "X-ray-136")}) //Позволяет линковать автотесты с тестовыми кейсами, шаги которых описаны в системах управления тестированием
    @Step("СТЕП Алюр - Добавить ссылку на система Карточки компаний") //пока непонятно, как работает
    @Description(value = "ОПИСАНИЕ Алюр - описание в сьюте")
    @Epic(value = "ЭПИК Алюр - Функционала Тест. Позволяет группировать тесты по эпикам") //https://habr.com/ru/company/sberbank/blog/359302/  и https://docs.qameta.io/allure/
    @Feature(value = "ФИЧА Алюр - для тестирования структуры Тестовой модели")
    @Test
    @Flaky //нотификация для нестабильных тестов
    @DisplayName("Для тестирования")
    public void addLinkSber() {
        String link = "https://www.rbc.ru/companies/";
        Allure.addAttachment("Результат", "text/plain", link);
    }

    //@Test
    @Owner(value = "Малёныч Сашкин")
    @Severity(value = SeverityLevel.BLOCKER) //SeverityLevel: BLOCKER, CRITICAL, NORMAL, MINOR или TRIVIAL
    @Epic(value = "ЭПИК Алюр - Функционала поиска. Позволяет группировать тесты по эпикам") //https://habr.com/ru/company/sberbank/blog/359302/  и https://docs.qameta.io/allure/
    @Feature(value = "ФИЧА Алюр - пустой поиск. Часть функционала ПОИСКа")
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
