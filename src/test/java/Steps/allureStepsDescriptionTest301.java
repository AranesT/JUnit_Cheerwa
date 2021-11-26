package Steps;

import io.qameta.allure.Step;
import pages.pageTestSelenium;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class allureStepsDescriptionTest301 {

    @Step ("Открытие страницы проекта")
    public static void openProjURL(){
        open(utils.Configuration.getConfigurationValue("testProjUrl"));
    }

    @Step("Проверка статуса проекта")
    public static void showProjStatus() {
        page(pageTestSelenium.class).ShowStatus();
    }

    @Step("Проверка версии проекта")
    public static void showProjVersion(){
        page(pageTestSelenium.class).ShowVersion();
    }
}
