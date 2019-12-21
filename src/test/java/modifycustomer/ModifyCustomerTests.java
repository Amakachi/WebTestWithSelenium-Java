package modifycustomer;

import base.SaysTest;
import org.testng.annotations.Test;
import pages.DashBoard;
import pages.EnrollCustomer;
import pages.ModifyCustomer;

@Test
public class ModifyCustomerTests extends SaysTest {
    public void testSuccessfulModifyCus(){
        loginPage.setFormUsername("cokenwa");
        loginPage.setFormPassword("12345");
        loginPage.clickFormSubmit();

        dashBoard.clickCustomer();
        dashBoard.selectModifyCustomer();

        modifyCustomer.setInputAccountNum("");
        modifyCustomer.inputNewPercentage("");
    }

}
