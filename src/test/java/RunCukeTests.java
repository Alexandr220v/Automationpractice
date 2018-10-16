import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features ="C:\\Users\\Oleksandr_Pavliuk\\IdeaProjects\\Automationpractice\\src\\main\\resources\\features",
        monochrome = true,
        tags = "@test220v",
        glue={"steps"})
public class RunCukeTests extends AbstractTestNGCucumberTests {


}
