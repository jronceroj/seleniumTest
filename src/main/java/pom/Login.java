package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver = new ChromeDriver();

    public void enterUserAndPass(){
        WebElement eUser = driver.findElement(By.xpath("//input[@id='rcmloginuser']"));
        WebElement ePass = driver.findElement(By.xpath("//input[@id='rcmloginpwd']"));
        WebElement eSendButton = driver.findElement(By.xpath("//button[@id='rcmloginsubmit']"));

        eUser.sendKeys("jesus.roncero@keapps.es");
        ePass.sendKeys("ERROR");
        eSendButton.click();
    }

    public void enterWrongUserAndPass(){
        WebElement eUser = driver.findElement(By.xpath("//input[@id='rcmloginuser']"));
        WebElement ePass = driver.findElement(By.xpath("//input[@id='rcmloginpwd']"));
        WebElement eSendButton = driver.findElement(By.xpath("//button[@id='rcmloginsubmit']"));

        eUser.sendKeys("jesus.roncero@keapps.es");
        ePass.sendKeys("ERROR");
        eSendButton.click();
    }

    public boolean alertWrongLogin(){
        WebElement eAlert = driver.findElement(By.xpath("//div[@id='messagestack']"));

        return eAlert.isDisplayed();
    }
    public boolean webPageCheck(){
        WebElement eInbox = driver.findElement(By.xpath("//span[contains(text(),'Entrada')]"));

        return eInbox.isDisplayed();
    }

}
