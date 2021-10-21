package PO;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;

public class PO_MainPage extends PO_Authorization {

    @FindBy(how = How.XPATH, using = "//*[@id='browse_link']")
    private SelenideElement Projacts;

    @FindBy(how = How.XPATH, using = "//*[@id='admin_main_proj_link_lnk']")
    private SelenideElement ProjectTest;

    public PO_MainPage ClicButtonProjects() {
        Projacts.click();
        return page(PO_MainPage.class);
    }

    public PO_MainPage ChooseTest() {
        ProjectTest.click();
        return page(PO_AllTasks.class);

    }
}

