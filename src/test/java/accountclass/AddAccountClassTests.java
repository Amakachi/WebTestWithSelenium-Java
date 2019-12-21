package accountclass;

import base.SaysTest;
import org.testng.annotations.Test;

public class AddAccountClassTests extends SaysTest {
@Test
    public void testAddAccountClass(){
        loginPage.setFormUsername("cokenwa");
        loginPage.setFormPassword("12345");
        loginPage.clickFormSubmit();
        dashBoard.clickAddTransactionClass();
        dashBoard.selectAccountClassMaker();
        addAccountClassMaker.setInputAccountClass("");
        addAccountClassMaker.setAccClassDesc("");
        addAccountClassMaker.setTier("");
        addAccountClassMaker.clickSubmitAccClass();
    }
}
