package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.util.concurrent.TimeUnit;

public class SaysTest {
    private WebDriver driver;

    protected LoginPage loginPage;
    protected DashBoard dashBoard;
    protected EnrollCustomer enrollCustomer;
    protected ModifyCustomer modifyCustomer;
    protected AddAccountClassMaker addAccountClassMaker;
    protected AddAccountClassChecker addAccountClassChecker;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://10.4.139.50:7003/SAYSFrontEnd/login");
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        dashBoard = new DashBoard(driver);
        enrollCustomer = new EnrollCustomer(driver);
        modifyCustomer = new ModifyCustomer(driver);
        addAccountClassMaker = new AddAccountClassMaker(driver);
        addAccountClassChecker = new AddAccountClassChecker(driver);


        //driver.manage().window().setSize(new Dimension());

        System.out.println(driver.getTitle());


    }
    @AfterClass
    public void tearDown(){
       //driver.quit();
  }
}
