package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private By formSubmit = By.id("loginbt");
    private By formUsername = By.id("username");
    private By formPassword = By.id("password");

    public void setFormUsername(String username)
    {
        driver.findElement(formUsername).sendKeys(username);

    }
    public void setFormPassword(String password){
        driver.findElement(formPassword).sendKeys(password);
    }

    public DashBoard clickFormSubmit(){
        driver.findElement(formSubmit).click();
        return new DashBoard(driver);
    }



//  public DashBoard clickCustomer() {
//     clickLink("Customers");
//     return new DashBoard(driver);
//    }
   private void clickLink(String linkText){
       driver.findElement(By.linkText(linkText)).click();
   }
}
