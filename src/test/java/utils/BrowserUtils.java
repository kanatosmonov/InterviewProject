package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {

    public static void switchByTitle(WebDriver driver, String title){
        Set<String> allPagesId=driver.getWindowHandles();
        for(String id:allPagesId){
            driver.switchTo().window(id);
            if(driver.getTitle().contains(title)){
                break;
            }
        }
    }

}
