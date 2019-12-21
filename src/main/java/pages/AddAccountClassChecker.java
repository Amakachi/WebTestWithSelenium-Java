package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAccountClassChecker {
    private WebDriver driver;
    private By approveCustomer = By.xpath("/html/body/div/div[3]/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/div/div[1]/a");
    private By rejectCustomer = By.xpath("/html/body/div/div[3]/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/div/div[2]/a");
    public AddAccountClassChecker(WebDriver driver){
        this.driver  = driver;
    }
    private void setApproveCustomer(){
        driver.findElement(approveCustomer).click();
    }
    private void setRejectCustomer(){
        driver.findElement(rejectCustomer).click();
    }

}
