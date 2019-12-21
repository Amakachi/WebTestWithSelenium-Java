package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnrollCustomer {
    private WebDriver driver;
    private By accountNo = By.id("accountNumber");
    private By searchButton = By.xpath("//*[@id=\"command\"]/div[1]/button");
    private By percentageCon = By.xpath("//*[@id=\"saysPercentage\"]");
    private By customerMandate = By.xpath("");
    private By submitCustomer = By.tagName("Submit");

    public EnrollCustomer(WebDriver driver) {
        this.driver = driver;
    }
    public void setAccountNumber(String accountNumber){
        driver.findElement(accountNo).sendKeys(accountNumber);
    }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }
    public void setPercentageCon(String percentCon){
        driver.findElement(percentageCon).sendKeys(percentCon);
    }
    public void clickSubmitCustomer(){
        driver.findElement(submitCustomer).click();
    }
}
