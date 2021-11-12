package Hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
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

    @AfterAll
    static void end() {
        WebDriverRunner.closeWebDriver();
    }

}

