package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveAccountClassMaker {
    private WebDriver driver;
    private By clickDelRejectedCust = By.xpath("/html/body/div/div[3]/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/div/div/a");
    public RemoveAccountClassMaker(WebDriver driver){
        this.driver = driver;
    }
    public void setClickDelRejectedCust(){
        driver.findElement(clickDelRejectedCust);
    }
}
