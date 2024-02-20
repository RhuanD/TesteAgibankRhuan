package testcases;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tasks.SearchTasks;
import verificationpoints.SearchVerificationPoint;

public class SearchTestCase {
    public WebDriver driver;
    private SearchTasks searchTasks;

    private SearchVerificationPoint searchVerificationPoint;


    @Dado("que acesso a URL do blog do agibank")
    public void setup() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blogdoagi.com.br/");
        searchTasks = new SearchTasks(driver);
        searchVerificationPoint = new SearchVerificationPoint(driver);
    }


    @Quando("clico no botão de busca")
    public void clickBotaoBusca() throws Throwable{
        searchTasks.clickSearchButton();
    }

    @E("procuro algo no blog")
    public void buscoAlgo() throws Throwable {
        searchTasks.typeSearchTextField("lucra");
    }


    @Entao("verifico se os resultados da busca batem com a minha pesquisa")
    public void verificaBusca() {
        searchVerificationPoint.verificaBusca();
        driver.close();
    }
}
