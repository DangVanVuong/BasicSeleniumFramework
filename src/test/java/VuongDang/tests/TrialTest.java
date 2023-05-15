package VuongDang.tests;

import VuongDang.TestComponents.BaseTest;
import VuongDang.TestComponents.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TrialTest extends BaseTest {
    @Test(groups= {"ErrorHandling"},retryAnalyzer= Retry.class)
    public void LoginErrorValidation() throws IOException, InterruptedException {


        landingPage.loginApplication("anshika@gmail.com", "Iamki000");
        Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());

    }
}
