package login;

import base.SaysTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoard;
import pages.EnrollCustomer;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class LoginTests extends SaysTest {
    private WebDriver driver;
    @Test
    public void testSuccessfullLogin(){
        loginPage.setFormUsername("cokenwa1");
        loginPage.setFormPassword("12345");
        loginPage.clickFormSubmit();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        String alert = driver.findElement(By.cssSelector(".alert")).getText();
        System.out.println(alert);

//        driver.switchTo().defaultContent();
//        String alert = driver.findElement(By.className("alert alert-danger")).getText();
//        System.out.println(alert);

      //  assertTrue(alert.contains("Username not profiled for this application"), "Alert not displayed");
        //Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div/div/form/div[1]")).getText(),"Username not profiled for this application","Alert not displayed" );
        //(dashboardPage.getAlertText().contains("Dashboard"), "Alert text in incorrect");

//        dashBoard.clickCustomer();
//
//        enrollCustomer.setAccountNumber("1234567");
//        enrollCustomer.clickSearchButton();


    }
}
