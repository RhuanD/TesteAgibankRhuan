package tasks;

import appObjects.SearchAppObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchTasks {
    private WebDriver driver;
    private SearchAppObjects searchAppObjects;

    public SearchTasks(WebDriver driver){
        this.driver = driver;
        searchAppObjects = new SearchAppObjects(driver);
    }

    public void clickSearchButton(){
        searchAppObjects.getSearchButton().click();
    }

    public void typeSearchTextField(String text){
        searchAppObjects.getSearchTextField().sendKeys(text);
        searchAppObjects.getSearchTextField().sendKeys(Keys.ENTER);
    }



}
