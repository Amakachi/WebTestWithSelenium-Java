package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DashBoard {

    private WebDriver driver;
    private By customerButton = By.xpath("/html/body/div/div[1]/div[2]/ul/li[2]/a");
    private By clickEnrollCustomer = By.xpath("/html/body/div/div[1]/div[2]/ul/li[2]/ul/li[1]/a");
    private By clickModifyCustomer = By.xpath("/html/body/div/div[1]/div[2]/ul/li[2]/ul/li[2]/a");
    private By addAccountClassButton = By.xpath("/html/body/div/div[1]/div[2]/ul/li[3]/a");
    private By clickAccountClassMaker = By.xpath("/html/body/div/div[1]/div[2]/ul/li[3]/ul/li[1]/a");
    private By clickAccountClassChecker = By.xpath("/html/body/div/div[1]/div[2]/ul/li[3]/ul/li[2]/a");

    public DashBoard(WebDriver driver){
        this.driver = driver;
    }


    //public String getAlertText(){
        //return driver.findElement(statusAlert).getText();
    //}

    public void clickCustomer(){
        driver.findElement(customerButton).click();
    }

    public EnrollCustomer selectFromDropdown()
    {
        driver.findElement(clickEnrollCustomer).click();
        return new EnrollCustomer(driver);
        //findDropDownElement().selectByVisibleText(option);
    }
    public ModifyCustomer selectModifyCustomer(){
        driver.findElement(clickModifyCustomer).click();
        return new ModifyCustomer(driver);
    }
    public void clickAddTransactionClass(){
        driver.findElement(addAccountClassButton).click();
    }
    public AddAccountClassMaker selectAccountClassMaker(){
        driver.findElement(clickAccountClassMaker).click();
        return new AddAccountClassMaker(driver);
    }
    public AddAccountClassChecker selectAccountClassChecker(){
        driver.findElement(clickAccountClassChecker).click();
        return new AddAccountClassChecker(driver);
    }
//    public List<String> getSelectedOptions() {
//        List<WebElement> selectedElements =
//                findDropDownElement().getAllSelectedOptions();
//        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
//    }

}
