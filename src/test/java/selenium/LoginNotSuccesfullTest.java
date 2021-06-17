package selenium;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.Login;

public class LoginNotSuccesfullTest {

    WebDriver driver = new ChromeDriver();

    @Given("navigate to web")
    public void navigateToWeb(){
        driver.get("https://serviciodecorreo.es/");
    }

    @When("user makes login")
    public void user_makes_login(){
        Login oLogin = new Login();
        oLogin.enterWrongUserAndPass();
    }

    @Then("login is not succesfull")
    public void login_is_not_succesfull(){
        Login oLogin = new Login();

        Assert.assertTrue(oLogin.alertWrongLogin());
    }

    @After
    public void closeDriver() {
        driver.close();
    }
}