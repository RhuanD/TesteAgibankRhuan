package verificationpoints;

import appObjects.SearchAppObjects;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchVerificationPoint {
    private WebDriver driver;
    private SearchAppObjects searchAppObjects;

    public SearchVerificationPoint(WebDriver driver){
        this.driver = driver;
        searchAppObjects = new SearchAppObjects(driver);
    }

    public void verificaBusca(){
        Assert.assertTrue(searchAppObjects.getMainContent().getText().contains("lucra"));
    }
}
