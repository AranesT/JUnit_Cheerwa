import Hooks.WebDriverInicialization;
import Steps.allureStepsDescriptionAuthorizition;
import Steps.allureStepsDescriptionCreator;
import Steps.allureStepsDescriptionMain;
import Steps.allureStepsDescriptionTest301;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RunnerTest extends WebDriverInicialization {

    @Epic("JiraTest")
    @Feature("Testing")
    @DisplayName("Авторизация")
    @Description("Авторизация на сайте в качестве пользователя")
    @Tag("Test1")
    @Test

    public void Test1() {

        allureStepsDescriptionAuthorizition.openAuthURL();
        allureStepsDescriptionAuthorizition.Login(utils.Configuration.getConfigurationValue("login"));
        allureStepsDescriptionAuthorizition.Pass(utils.Configuration.getConfigurationValue("pass"));
        allureStepsDescriptionAuthorizition.Enter();
    }

    @Epic("JiraTest")
    @Feature("Testing")
    @DisplayName("Выбор текущего проекта")
    @Description("Выбор проекта Test в качестве активного")
    @Tag("Test2")
    @Test

    public void Test2() {

        allureStepsDescriptionMain.openMainURL();
        allureStepsDescriptionMain.ClicProjBT();
        allureStepsDescriptionMain.ChoseTestProj();
    }

    @Epic("JiraTest")
    @Feature("Testing")
    @DisplayName("Вывод статуса задачи")
    @Description("Вывод статуса задачи TEST-301")
    @Tag("Test3")
    @Test

    public void Test3() {

        allureStepsDescriptionTest301.openProjURL();
        allureStepsDescriptionTest301.showProjStatus();
        allureStepsDescriptionTest301.showProjVersion();
    }

    @Epic("JiraTest")
    @Feature("Testing")
    @DisplayName("Создание своей задачи")
    @Description("Создание своей задачи, смена ее статуса и написание комментария")
    @Tag("Test4")
    @Test

    public void Test4() {

        allureStepsDescriptionCreator.openAuthURL();
        allureStepsDescriptionCreator.newTaskCreate();
        allureStepsDescriptionCreator.taskName(utils.Configuration.getConfigurationValue("nameOfTask"));
        allureStepsDescriptionCreator.enterLabel(utils.Configuration.getConfigurationValue("usedLabel"));
        allureStepsDescriptionCreator.makerChoise();
        allureStepsDescriptionCreator.finalCreate();
        allureStepsDescriptionCreator.SearchMyTask(utils.Configuration.getConfigurationValue("nameOfTask"));
        allureStepsDescriptionCreator.inWorkStatusChange();
        allureStepsDescriptionCreator.CheckStatus1();
        allureStepsDescriptionCreator.openBusinessProcessWindow();
        allureStepsDescriptionCreator.finishedStatusChange();
        allureStepsDescriptionCreator.openCommentsWindow();
        allureStepsDescriptionCreator.writeComment(utils.Configuration.getConfigurationValue("comm"));
        allureStepsDescriptionCreator.commentAddBT();
    }


}

