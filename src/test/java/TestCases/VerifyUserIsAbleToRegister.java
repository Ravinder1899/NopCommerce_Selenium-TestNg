package TestCases;

import Pages.Config.BaseClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyUserIsAbleToRegister extends BaseClass {
    @Test
    public void userRegisters() throws IOException {
        navigateToNopcommerce();
        pageFactory.getHomePage().navigateToRegisterPage();
        pageFactory.getRegisterPage().userRegisters();
        closeBrowserWindow();
    }
}