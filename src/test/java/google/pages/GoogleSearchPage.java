package google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public GoogleSearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//textarea[@name='q']")
    WebElement searchBox;

    @FindBy(xpath = "(//h3)[1]")
    WebElement firstResult;

    public void searchItem(String word){
        searchBox.sendKeys(word, Keys.ENTER);
    }

    public String firstResult () {
        return firstResult.getText();
    }






}
