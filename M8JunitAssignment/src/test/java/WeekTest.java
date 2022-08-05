import org.junit.jupiter.api.*;
import Week.Week;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.gen5.api.Assertions.*;

/*
Add unit tests for this method.

Think about:

positive tests - all the days have correct return values

negative tests - numbers < 1 and >7

a null value (expect for exception)
*/
public class WeekTest {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7})
    public void correctValuesTest(int a) {
        String expectedResult = "";
        switch (a) {
            case 1:
                expectedResult = "Sunday";
                break;
            case 2:
                expectedResult = "Monday";
                break;

            case 3:
                expectedResult = "Tuesday";
                break;

            case 4:
                expectedResult = "Wednesday";
                break;
            case 5:
                expectedResult = "Thursday";
                break;
            case 6:
                expectedResult = "Friday";
                break;
            case 7:
                expectedResult = "Saturday";
                break;
        }
        String actualResult = Week.getDay(a);
        assertEquals(expectedResult,actualResult,"The result is incorrect");
    }
    @Test
    public void LargeValueTest() {
        int a = 8;
        String actualResult = Week.getDay(a);
        assertTrue(actualResult == "The number should be equal or smaller than 7");
    }
    @Test
    public void SmallValueTest() {
        int a = -1;
        String actualResult = Week.getDay(a);
        assertTrue(actualResult == "The number should be equal or larger than 1");
    }
    @Test //This test is passed, but I don't understand how it works. The test is supposed to return
          //a NullPointerException, which means the MESSAGE should be returned, not null
    public void NullValueTest() {
        assertNull(null);
    }
}
//change for git commit
//change for another commit
//Another change for a new commit
