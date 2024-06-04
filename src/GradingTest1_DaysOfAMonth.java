/**
 * Class: MyTestClass1
 * @author: Dr. Wei Jin, ITEC, GGC
 * Created spring,2023
 * Output matching tests for coding exercise DaysOfAMonth
 */

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

// Import anything else you need to run the tests, such as the students' classes

public class GradingTest1_DaysOfAMonth {
    private String[] inputStrings = {"", "2000 1", "1978 8", "1955 12", "1920 6", "1911 11",
                                        "1997 2", "2016 2", "1900 2", "2000 2", "1800 2"};
    private String[] outputStrings = {"",
            "Enter the year: " +
                    "Enter the month: 1/2000 has 31 days.\n",
            "Enter the year: " +
                    "Enter the month: 8/1978 has 31 days.\n",
            "Enter the year: " +
                    "Enter the month: 12/1955 has 31 days.\n",
            "Enter the year: " +
                    "Enter the month: 6/1920 has 30 days.\n",
            "Enter the year: " +
                    "Enter the month: 11/1911 has 30 days.\n",
            "Enter the year: " +
                    "Enter the month: 2/1997 has 28 days.\n",
            "Enter the year: " +
                    "Enter the month: 2/2016 has 29 days.\n",
            "Enter the year: " +
                    "Enter the month: 2/1900 has 28 days.\n",
            "Enter the year: " +
                    "Enter the month: 2/2000 has 29 days.\n",
            "Enter the year: " +
                    "Enter the month: 2/1800 has 28 days.\n"
    };

    private void outputMatchingTest(String inputString, String outputString) {
        String teacherOutput = StringUtilities.trimEachLine(outputString);

        PrintStream stdOut = System.out;
        InputStream stdIn = System.in;

        ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos2));
        System.setIn(new ByteArrayInputStream(inputString.getBytes(StandardCharsets.UTF_8)));
        DaysOfAMonth.main(null); //students are expected to submit the file
        String studentOutput = StringUtilities.trimEachLine(bos2.toString());

        assertEquals(teacherOutput, studentOutput);

        System.setOut(stdOut);
        System.setIn(stdIn);
//        System.out.println(teacherOutput);
//        System.out.println(studentOutput);
    }

    @Test
    public void testDaysOfAMonth1() { outputMatchingTest(inputStrings[1], outputStrings[1]); }
    @Test
    public void testDaysOfAMonth2() { outputMatchingTest(inputStrings[2], outputStrings[2]); }
    @Test
    public void testDaysOfAMonth3() { outputMatchingTest(inputStrings[3], outputStrings[3]); }
    @Test
    public void testDaysOfAMonth4() { outputMatchingTest(inputStrings[4], outputStrings[4]); }
    @Test
    public void testDaysOfAMonth5() { outputMatchingTest(inputStrings[5], outputStrings[5]); }
    @Test
    public void testDaysOfAMonth6() { outputMatchingTest(inputStrings[6], outputStrings[6]); }
    @Test
    public void testDaysOfAMonth7() { outputMatchingTest(inputStrings[7], outputStrings[7]); }
    @Test
    public void testDaysOfAMonth8() { outputMatchingTest(inputStrings[8], outputStrings[8]); }
    @Test
    public void testDaysOfAMonth9() { outputMatchingTest(inputStrings[9], outputStrings[9]); }
    @Test
    public void testDaysOfAMonth10() { outputMatchingTest(inputStrings[10], outputStrings[10]); }
}
