package qa_guru.allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class StepsTest {

    @Test
    public void testLambda() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");

        $(".search-input").click();
        $("#query-builder-test").setValue("eroshenkoam/allure");
        $("#query-builder-test").submit();
        $(linkText("eroshenkoam/allure-qaguru")).click();
        $("#issues-tab").click();
        $(withText("Заменяем степы на Listenerrr")).should(Condition.exist);

    }

}
