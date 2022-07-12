
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;

public class BaseWebTest {

    @BeforeMethod(alwaysRun = true)
    public void beforeEachTest(Method method, ITestResult context, Object[] testData) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("STARTING TEST --> " + context.getInstance().getClass().getSimpleName() + "." + method.getName());
        System.out.println("-----------------------------------------------------------------");
    }

    @AfterMethod(alwaysRun = true)
    public void afterEachTest(Method method, ITestResult context, Object[] testData) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("ENDING TEST --> " + context.getInstance().getClass().getSimpleName() + "." + method.getName());
        System.out.println("-----------------------------------------------------------------");

        throw new RuntimeException("For whatever reason.");
    }



}
