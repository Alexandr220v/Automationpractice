import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.NavigationPage;

import javax.inject.Inject;
import java.io.File;

public class OtherDemo extends BaseTest  {

   @Autowired
    private NavigationPage navigationPage;
    @Autowired
    private ContactUsPage contactUsPage;

    @Test
    public void testAttach() throws InterruptedException {
        //navigationPage = new NavigationPage(driver);
        navigationPage.openContactUsPage();
        //contactUsPage = new ContactUsPage(driver);
        navigationPage.openContactUsPage();
        contactUsPage.attachFile();
    }

}
