package Steps;

import io.qameta.allure.Step;
import pages.pageAuthorizition;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class allureStepsDescriptionAuthorizition {

    @Step("Открытие страницы авторизации")
    public static void openAuthURL() {
        open(utils.Configuration.getConfigurationValue("pageOfauthorize"));
    }

    @Step("Ввод логина {0}")
    public static void Login(String login) {
        page(pageAuthorizition.class).ClicButtonLogIn(login);
    }

    @Step("Ввод пароля {0}")
    public static void Pass(String password) {
        page(pageAuthorizition.class).ClicButtonPassword(password);
    }

    @Step("Вход")
    public static void Enter() {
        page(pageAuthorizition.class).ClicButtonIn();
    }
}
