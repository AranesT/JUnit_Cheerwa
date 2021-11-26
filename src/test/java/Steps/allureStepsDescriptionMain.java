package Steps;

import io.qameta.allure.Step;
import pages.pageMain;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class allureStepsDescriptionMain {

    @Step("Открытие главной страницы")
    public static void openMainURL() {
        open(utils.Configuration.getConfigurationValue("mainPageUrl"));
    }

    @Step("Нажатие кнопки Проекты")
    public static void ClicProjBT() {
        page(pageMain.class).ClicButtonProjects();
    }

    @Step("Выбор проекта Test")
    public static void ChoseTestProj() {
        page(pageMain.class).ChooseTest();
    }
}
