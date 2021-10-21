package PO;

import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;

public class PO_Authorization extends main{

    @FindBy(how = How.XPATH, using = "/html/body/div/section/div/div/section/form/div[1]/div[1]/div/div[1]/input")
    private SelenideElement LoginLane;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-password']")
    private SelenideElement PasswordLane;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-submit']")
    private SelenideElement ButtonLogIn;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-cancel']")
    private SelenideElement ButtonCantIn;

    public  PO_Authorization ClicButtonLogIn() {
        LoginLane.click();
        LoginLane.sendKeys(Login);
        return page(PO_Authorization.class);
    }

    public PO_Authorization ClicButtonPassword() {
        PasswordLane.click();
        PasswordLane.sendKeys(Password);
        return page(PO_Authorization.class);
    }

    public PO_MainPage ClicButtonIn() {
        ButtonLogIn.click();
        return page(PO_MainPage.class);
    }

}
