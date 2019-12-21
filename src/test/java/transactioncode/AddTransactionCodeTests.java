package transactioncode;

import base.SaysTest;

public class AddTransactionCodeTests extends SaysTest {
    public void testAddTransactionCode(){
        loginPage.setFormUsername("cokenwa");
        loginPage.setFormPassword("12345");
        loginPage.clickFormSubmit();

        dashBoard.clickAddTransactionClass();
        dashBoard.selectAccountClassMaker();

        addAccountClassMaker.setInputAccountClass("");
        addAccountClassMaker.setAccClassDesc("");

    }
}
