package Tan4ous.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qrcoder.ru/")
public class DictionaryPage extends PageObject {

    @FindBy(xpath="//*[@id=\"pageContent\"]/div/div[2]/form/div[1]/div[2]/textarea")
    private WebElement TextArea;

    @FindBy(xpath="//*[@id=\"pageContent\"]/div/div[2]/form/div[2]/input")
    private WebElement submitButton;

    @FindBy(xpath="//*[@id=\"pageContent\"]/div/div[1]/div[1]/img")
    private WebElement Image;

    public DictionaryPage(WebDriver driver) {
        super(driver);
    }

    public void openThis() {
        getDriver().get("http://qrcoder.ru/");
    }

    public void enter_keywords(String keyword) {
        TextArea.sendKeys(keyword);
    }

    public void lookup_terms() {
        submitButton.click();
    }

    public boolean getDefinitions() {
        return Image.isEnabled();
    }
}