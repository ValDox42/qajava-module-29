import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class PersonTest {
    @DataProvider(name = "personAge")
    Object [][] dataProvider() {
        return new Object[][]{
                {11},
                {13},
                {14},
                {15},
                {16},
                {18},
                {19},
                {20}
        };
    }

    @Test(dataProvider = "personAge")
    public void isTeenage(int arg1) {
        Boolean result = Person.isTeenager(arg1);
        System.out.println(result);
        assertTrue(result);
    }
}
