import Hooks.WebDriverInicialization;
import Steps.allureStepsDescriptionAuthorizition;
import Steps.allureStepsDescriptionCreator;
import Steps.allureStepsDescriptionMain;
import Steps.allureStepsDescriptionTest301;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class RunnerTest extends WebDriverInicialization {
    WebDriver driver;

    @Epic("JiraTest")
    @Feature("Testing")
    @DisplayName("Авторизация")
    @Description("Авторизация на сайте в качестве пользователя")
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
    @Test

    public void Test3() {

        allureStepsDescriptionTest301.openProjURL();
        allureStepsDescriptionTest301.showProjStatus();
    }

    @Epic("JiraTest")
    @Feature("Testing")
    @DisplayName("Создание своей задачи")
    @Description("Создание своей задачи, смена ее статуса и написание комментария")
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

    @Attachment(value = "Failed test screenshot")
    public byte[] attachScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}

