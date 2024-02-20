package testcases;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTestCase {
    public WebDriver driver;


    @Dado("que acesso a URL do blog do agibank")
    public void setup() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blogdoagi.com.br/");
        
    }


    @Quando("clico no botão de busca")
    public void clicoNoBotaoDeBusca() {

    }

}
