package PageClass.Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Youtube_findLinkClass {
    private WebDriver ldriver;
    public Youtube_findLinkClass(WebDriver gdriver){ ldriver=gdriver;}

    By txtLinkSearch = By.xpath("//a[@title='Zeki Müren Ne Olursun, Gel Gönlümü Yerden Yere Vurma Güzel, Türk Sanat Müziği']");


    private WebElement getTxtLinkId(){
        return ldriver.findElement(txtLinkSearch);
    }

    public void ClickLink(){
        getTxtLinkId().click();
    }
}
