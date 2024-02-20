package verificationpoints;

import appObjects.SearchAppObjects;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchVerificationPoint {
    private final SearchAppObjects searchAppObjects;

    public SearchVerificationPoint(WebDriver driver){
        searchAppObjects = new SearchAppObjects(driver);
    }

    public void verificaBusca(){
        Assert.assertTrue(searchAppObjects.getMainContent().getText().contains("lucra"));
    }

    public void verificaHome(){
        Assert.assertTrue(searchAppObjects.getSiteContent().getText().contains("Últimas"));
    }
}
