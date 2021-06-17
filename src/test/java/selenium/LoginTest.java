package selenium;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.Login;

public class LoginTest {

    WebDriver driver = new ChromeDriver();

    @Given("navigate to web")
    public void navigateToWeb(){
        System.out.println("PRUEBA");
        System.setProperty("webdriver.chrome.driver","/drivers/chromedriver.exe");
        driver.get("https://serviciodecorreo.es/");
    }

    @When("user makes login")
    public void user_makes_login(){
        Login oLogin = new Login();
        oLogin.enterUserAndPass();
    }

    @Then("login is succesfull")
    public void login_is_succesfull(){
        Login oLogin = new Login();

        Assert.assertTrue(oLogin.webPageCheck());
    }

    @After
    public void closeDriver() {
        driver.close();
    }
}