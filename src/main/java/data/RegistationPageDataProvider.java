package data;

import org.testng.annotations.DataProvider;

public class RegistationPageDataProvider {

    @DataProvider
    public Object[][] registerNewUser() {
        return new Object[][]{
                {"qastart220@gmail.com" ,  "" , " fdas"},
                {"" , "" , "fdas "},
                {"" , "1" , " fdasfd"}};
    }

}
