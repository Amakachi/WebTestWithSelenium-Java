package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTransactionCodeMaker {
    private WebDriver driver;
    private By inputTransactionCode = By.xpath("/html/body/div/div[3]/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/div/div[1]/a");
    private By inputDescription = By.xpath("//*[@id=\"description\"]");
    private By submitLink = By.xpath("//*[@id=\"demo-form2\"]/div[2]/div/div/button");

    public AddTransactionCodeMaker(WebDriver driver){
        this.driver = driver;
    }
    public void setInputTransactionCode(String transCode){
        driver.findElement(inputTransactionCode).sendKeys(transCode);
    }
    public void setInputDescription(String descInput){
        driver.findElement(inputDescription).sendKeys(descInput);
    }
    public void setSubmitLink(){
        driver.findElement(submitLink).click();
    }
}
