package PO;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class PO_AllTasks extends PO_MainPage{

    @FindBy(how = How.XPATH, using = "//*[@id='quickSearchInput']")
    private SelenideElement FinderWindow;

    @FindBy(how = How.XPATH, using = "//*[@id='quicksearch']/div[1]/div[1]/ul/li[1]/a")
    private SelenideElement CurrentTaskName;

    @FindBy(how = How.XPATH, using = "//*[@id='content']/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div[1]/span")
    private SelenideElement amountOfProjects;
    //Не обнаруживает элемент при использовании коротого xPass

    public PO_AllTasks AmountOfProjects() {
        System.out.println("Количество проектов: " + amountOfProjects.getText().toString());
        return page(PO_AllTasks.class);
    }
    //*[@id="content"]
    public PO_AllTasks TaskFinder() {
        FinderWindow.click();
        FinderWindow.sendKeys(TaskName);
        return page(PO_AllTasks.class);
    }

    public PO_TaskCreating CurrentTaskChoiser() {
        CurrentTaskName.click();
        return page(PO_TaskCreating.class);
    }


}
