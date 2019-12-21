package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTransactionCodeChecker {
    private WebDriver driver;
    private By clickAction = By.xpath("");
    private By approveTransCode = By.xpath("");
    private By rejectTransCode = By.xpath("");
    public AddTransactionCodeChecker(WebDriver driver){
        this.driver = driver;
    }
    public void setClickAction(){
        driver.findElement(clickAction);

    }
    public void setApproveTransCode(){
        driver.findElement(approveTransCode);
    }
    public void setRejectTransCode(){
        driver.findElement(rejectTransCode);
    }
}
