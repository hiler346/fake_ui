package Utils;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBase {
    @BeforeAll
    static void setup() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "105.0.5195.102");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
//        Configuration.remote = "";
        Configuration.browserSize = "1720x1080";
    }

    @AfterEach
    @Step("Attachments")
    public void afterEach(){
        AttachmentsHelper.attachScreenshot("Last screenshot");
        AttachmentsHelper.attachPageSource();
        AttachmentsHelper.attachAsText("Browser console logs", AttachmentsHelper.getConsoleLogs());
        AttachmentsHelper.attachVideo();

        closeWebDriver();
    }

}
