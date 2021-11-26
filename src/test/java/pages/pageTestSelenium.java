package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class pageTestSelenium {

    @FindBy(how = How.XPATH, using = "//*[@id='status-val']/span")
    private SelenideElement taskStatus;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div[2]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div/div[1]/div[1]/div[2]/ul/li[5]/div/span")
    private SelenideElement currentVersion;

    public pageTestSelenium ShowStatus() {
        taskStatus.getText();
        return page(pageTestSelenium.class);
    }

    public pageTestSelenium ShowVersion() {
        currentVersion.getText();
        return page(pageTestSelenium.class);

    }
}
