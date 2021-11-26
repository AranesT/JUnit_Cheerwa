package Steps;

import io.qameta.allure.Step;
import pages.pageTestProject;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class allureStepsDescriptionCreator {

    @Step("Открытие страницы задачи")
    public static void openAuthURL() {
        open(utils.Configuration.getConfigurationValue("testSeleniumUrl"));
    }

    @Step("Нажатие кнопки Создать новую задачу")
    public static void newTaskCreate() {
        page(pageTestProject.class).NewTask();
    }

    @Step("Ввод имени задачи, как {0}")
    public static void taskName(String taskName) {
        page(pageTestProject.class).CreatingTaskName(taskName);
    }

    @Step("Ввод метки задачи, как {0}")
    public static void enterLabel(String Labell) {
        page(pageTestProject.class).Label(Labell);
    }

    @Step("Назначение исполнителя")
    public static void makerChoise() {
        page(pageTestProject.class).Maker();
    }

    @Step("Нажатие кнопки Создать задачу")
    public static void finalCreate() {
        page(pageTestProject.class).FinalTaskCreate();
    }

    @Step("Открытие страницы задачи")
    public static void SearchMyTask(String myTaskNamee) {
        page(pageTestProject.class).QuicSearchh(myTaskNamee);
    }

    @Step("Смена статуса задачи на В работе")
    public static void inWorkStatusChange() {
        page(pageTestProject.class).ChangeTaskStatus1();
    }

    @Step("Проверка статуса задачи")
    public static void CheckStatus1() {
        page(pageTestProject.class).CheckTaskStatus();
    }

    @Step("Открытие окна Бизнес-процессы")
    public static void openBusinessProcessWindow() {
        page(pageTestProject.class).BusinessProcess();
    }

    @Step("Смена статуса задачи на Выполнено")
    public static void finishedStatusChange() {
        page(pageTestProject.class).CompleteTask();
    }

    @Step("Открытие окна комментариев")
    public static void openCommentsWindow() {
        page(pageTestProject.class).OpenComments();
    }

    @Step("Написание комментария: {0}")
    public static void writeComment(String comment) {
        page(pageTestProject.class).CommentWriter(comment);
    }

    @Step("Нажатие кнопки Добавить комментарий")
    public static void commentAddBT() {
        page(pageTestProject.class).AddComment();
    }
}
