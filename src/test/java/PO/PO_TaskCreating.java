package PO;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;

public class PO_TaskCreating extends PO_AllTasks{

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div[2]/ul/li[2]/div/span[1]/span")
    private SelenideElement taskStatus;

    @FindBy(how = How.XPATH, using = "//*[@id='versions-field']/span")
    private SelenideElement currentVersion;

    @FindBy(how = How.XPATH, using = "//*[@id='create_link']")
    private SelenideElement createNewTask;

    @FindBy(how = How.XPATH, using = "//*[@id='summary']")
    private SelenideElement creatingTaskName;

    @FindBy(how = How.XPATH, using = "//*[@id='labels-textarea']")
    private SelenideElement label;

    @FindBy(how = How.XPATH, using = "//*[@id='assignee-field']")
    private SelenideElement Maker;

    @FindBy(how = How.XPATH, using = "//*[@id='assign-to-me-trigger']")
    private SelenideElement itisme;

    @FindBy(how = How.XPATH, using = "//*[@id='create-issue-submit']")
    private SelenideElement buttonCreateTask;

    @FindBy(how = How.XPATH, using = "//*[@id='quickSearchInput']")
    private SelenideElement quicSearch;

    @FindBy(how = How.XPATH, using = "//*[text()='Ошибка АТ Чирва']")
    private SelenideElement choiseMyTask;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div/header/div/div/div/div[1]/div/div[1]/div[4]/a[2]/span")
    private SelenideElement changeTaskStatus1;
    //Не обнаруживает элемент при использовании коротого xPass

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div[2]/ul/li[2]/div/span[1]/span")
    private SelenideElement checkTaskStatus;
    //Не обнаруживает элемент при использовании коротого xPass

    @FindBy(how = How.XPATH, using = "//*[@id='opsbar-transitions_more']/span" )
    private SelenideElement businessProcess;

    @FindBy(how = How.XPATH, using = "//*[@id='action_id_31']/span" )
    private SelenideElement completeTask;

    @FindBy(how = How.XPATH, using = "//*[@id='footer-comment-button']/span[2]" )
    private SelenideElement openComments;

    @FindBy(how = How.XPATH, using = "//*[@id='tinymce']/p" )
    private SelenideElement commentWriter;

    @FindBy(how = How.XPATH, using = "//*[@id='issue-comment-add-submit']")
    private SelenideElement addComment;

    public PO_TaskCreating ShowStatus() {
        System.out.println("Статус задачи " + TaskName + ": "+ taskStatus.getText().toString());
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating ShowVersion() {
        System.out.println("Текущая версия: " + currentVersion.getText().toString());
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating NewTask() {
        createNewTask.click();
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating CreatingTaskName() {
        creatingTaskName.click();
        creatingTaskName.sendKeys(CreatingTaskName);
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating Label() {
        label.click();
        label.sendKeys(LabelText);
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating Maker() {
        itisme.click();
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating FinalTaskCreate() {
        buttonCreateTask.click();
        return page(PO_TaskCreating.class);
    }
    public PO_TaskCreating QuicSearchh() {
        quicSearch.click();
        quicSearch.sendKeys(CreatingTaskName);
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating MyTask() {
        choiseMyTask.click();
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating ChangeTaskStatus1() {
        changeTaskStatus1.click();
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating CheckTaskStatus() {
        System.out.println("Текущий статус задачи моей задачи: " + checkTaskStatus.getText().toString());
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating BusinessProcess() {
        businessProcess.click();
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating CompleteTask() {
        completeTask.click();
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating OpenComments() {
        openComments.click();
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating CommentWriter() {
        Selenide.switchTo().frame("mce_0_ifr");
        commentWriter.sendKeys(MyComment);
        Selenide.switchTo().defaultContent();
        return page(PO_TaskCreating.class);
    }

    public PO_TaskCreating AddComment() {
        addComment.click();
        return page(PO_TaskCreating.class);
    }

}
