package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModifyCustomer {
    private WebDriver driver;
    private By inputAccountNum = By.id("srcAccNo");
    private By newPercentage = By.name("newSaysPerc");
    public ModifyCustomer(WebDriver driver){
        this.driver = driver;
    }
    public void setInputAccountNum(String accNum){
        driver.findElement(inputAccountNum).sendKeys(accNum);
    }
    public ModifyCustomer inputNewPercentage(String percentageNum){
        driver.findElement(newPercentage).sendKeys(percentageNum);
        return new ModifyCustomer(driver);
    }
}
