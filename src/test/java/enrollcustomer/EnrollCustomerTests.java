package enrollcustomer;

import base.SaysTest;
import org.testng.annotations.Test;
import pages.DashBoard;
import pages.EnrollCustomer;
@Test
public class EnrollCustomerTests extends SaysTest {
    public void testSuccessfulEnrollment(){
        loginPage.setFormUsername("cokenwa");
        loginPage.setFormPassword("12345");
        loginPage.clickFormSubmit();
        //(dashboardPage.getAlertText().contains("Dashboard"), "Alert text in incorrect");

        dashBoard.clickCustomer();
        dashBoard.selectFromDropdown();

        enrollCustomer.setAccountNumber("1221004090");
        enrollCustomer.clickSearchButton();

        enrollCustomer.setPercentageCon("7");
        enrollCustomer.clickSubmitCustomer();

    }
}
