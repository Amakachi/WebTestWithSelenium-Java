package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RejectedCustomer {
    private WebDriver driver;
    private By treatRejectedCustomer = By.xpath("/html/body/div/div[3]/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[7]/a");
    public void RejectedCustomer(WebDriver driver){
        this.driver = driver;
    }
    public void setTreatRejectedCustomer(){
        driver.findElement(treatRejectedCustomer);
    }
}
