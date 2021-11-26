package Hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class WebDriverInicialization {

    @BeforeAll
    static void setDriverProps() {
        String webDriverLocation = utils.Configuration.getConfigurationValue("webdriverlocationLOCAL");
        if (webDriverLocation != null) {
            System.setProperty("webdrriver.chrome.driver", webDriverLocation);
            System.setProperty("selenide.browser", "Chrome");
            Configuration.startMaximized = true;
        }
    }

    @BeforeAll
    static void allureSubThreadParallel() {
        String listenerName = "AllureSelenide";

        if (!(SelenideLogger.hasListener(listenerName)))
            SelenideLogger.addListener(listenerName,
                    new AllureSelenide().
                            screenshots(true).
                            savePageSource(false));
    }

    @AfterAll
    static void end() {
        WebDriverRunner.closeWebDriver();
    }

    @AfterAll
    static void tearDown() {
        SelenideLogger.removeListener("AllureSelenide");
    }
}

