package PageClass.PageClass_WithBaseCase;

import Base.BaseClassTestORnek02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


    private WebDriver ldriver;

    public HomePage(WebDriver gdriver) {
        ldriver = gdriver;

    }

        By loginButton = By.xpath("//*[text()='Log in']");



    private WebElement getFindSearchBut() {
        return ldriver.findElement(loginButton);
    }


    public void ClickLoginButton() {
        getFindSearchBut().click();
    }




}
