package TestsFake.TEST.FakeUI;

import TestsFake.TEST.HelpModels.FakeXPath;
import Utils.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("TEST")
public class FakeUI extends TestBase {

    @Test
    @DisplayName("Проверка UI")
    public void FakeUI() {

        FakeXPath fake = new FakeXPath();

        step("Открыть Faceit", () -> {
            open("https://www.faceit.com/ru/login");
        });

        step("Заполнение данных для ввода", () -> {
            // Ввод login
            fake.Login
                    .shouldBe(visible, Duration.ofSeconds(20))
                    .sendKeys("логин");
            // Ввод пароля
            fake.Password
                    .shouldBe(visible, Duration.ofSeconds(20))
                    .sendKeys("пароль");
            // Enter
            fake.ButtonEnter
                    .click();
            fake.ButtonEnter
                    .shouldBe(visible, Duration.ofSeconds(20));

        });

        step("Открытие страницы Играть", () -> {
            // Открытие страницы Играть
            fake.ClickGame
                    .click();
            fake.ClickGame
                    .shouldBe(visible, Duration.ofSeconds(20));
            // Открытие страницы матча
            fake.ClickMatch
                    .click();
            fake.ClickMatch
                    .shouldBe(visible, Duration.ofSeconds(20));
            // Открытие страницы Hub
            fake.ClickHub
                    .click();
            fake.ClickHub
                    .shouldBe(visible, Duration.ofSeconds(20));
            // Открытие страницы команды
            fake.ClickTeams
                    .click();
            fake.ClickTeams
                    .shouldBe(visible, Duration.ofSeconds(20));

        });



    }
}
