package testcase.businessbranches;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dataobject.BusinessBranch;
import framework.UiTestDriver;
import pageobject.BusinessBranchPage;
import pageobject.LoginPage;

/**
 * TC001: user able to create a new business branch with all mandatory fields
 */
public class TC001 {
    LoginPage loginPage;
    BusinessBranchPage businessBranchPage;
    BusinessBranch businessBranch;
    @BeforeClass
    public void beforeClass(){
        UiTestDriver.startBrowser("Chrome");
        loginPage = new LoginPage(UiTestDriver.driver);
        businessBranchPage = new BusinessBranchPage((UiTestDriver.driver));
        businessBranch = new BusinessBranch();
    }

    @Test
    public void login(){
        loginPage.login("username", "password");
    }

    @Test(dependsOnMethods = {"login"})
    public void gotoBusinessBranchesPage(){
        businessBranchPage.gotoBusinessBranchesPage();
    }

    @Test(dependsOnMethods = "gotoBusinessBranchesPage")
    public void createNewBusinessBranch(){
        businessBranchPage.createNewBusinessBranch(businessBranch);
    }

    @Test(dependsOnMethods = "createNewBusinessBranch")
    public void verifyNewBranchCreated(){
        businessBranchPage.verifyNewCreatedBusinessBranch(businessBranch);
    }
}
