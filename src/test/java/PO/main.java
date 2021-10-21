package PO;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class main {

    String Login = "achirva";
    String Password = "123qaz!@#QAZ";
    String TaskName = "TestSelenium";
    String CreatingTaskName = "Ошибка АТ Чирва";
    String LabelText = "blitz_test";
    String MyComment = "Задача решена!";

    @BeforeAll  static void Test2() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
    }

    @Test
    public void Test1() {

        Selenide.open("https://edujira.ifellow.ru/login.jsp",PO_Authorization.class)
        .ClicButtonLogIn()
        .ClicButtonPassword()
        .ClicButtonIn();

        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa",PO_MainPage.class)
                .ClicButtonProjects()
                .ChooseTest();

        Selenide.open("https://edujira.ifellow.ru/projects/TEST/issues/TEST-301?filter=allopenissues",PO_AllTasks.class)
                .AmountOfProjects()
                .TaskFinder()
                .CurrentTaskChoiser();

        Selenide.open("https://edujira.ifellow.ru/browse/TEST-374", PO_TaskCreating.class)
                .ShowStatus()
                .ShowVersion()
                .NewTask()
                .CreatingTaskName()
                .Label()
                .Maker()
                .FinalTaskCreate()
                .QuicSearchh()
                .MyTask()
                .ChangeTaskStatus1()
                .CheckTaskStatus()
                .BusinessProcess()
                .CompleteTask()
                .OpenComments()
                .CommentWriter()
                .AddComment();
    }

    @AfterAll
    static void Test3() {
        closeWebDriver();
    }
}
