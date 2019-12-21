package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddAccountClassMaker {
    private WebDriver driver;
    private By inputAccountClass = By.id("accClass");
    private By accClassDesc = By.id("description");
    private By selectTier = By.id("tier");
    private By submitAccClass = By.tagName("Submit");
    public AddAccountClassMaker(WebDriver driver){
        this.driver = driver;
    }
    public void setInputAccountClass(String accountClass){
        driver.findElement(inputAccountClass).sendKeys(accountClass);
    }
    public void setAccClassDesc(String accDesc){
        driver.findElement(accClassDesc).sendKeys(accDesc);
    }

    public void setTier(String tier_)
    {
        Select dropdown = new Select(driver.findElement(selectTier));
        dropdown.selectByVisibleText(tier_);
    }
    public void clickSubmitAccClass(){
        driver.findElement(submitAccClass).click();
    }
}
