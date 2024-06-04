/**
 * Class: MyTestClass1
 * @author: Dr. Wei Jin, ITEC, GGC
 * Created spring,2023
 * Output matching tests for coding exercise SequencePractice
 */

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

// Import anything else you need to run the tests, such as the students' classes

public class GradingTest2_SequencePractice {
    private String[] inputStrings = {"", "-5 0 5 6", "-10 9 0 8"};
    private String[] outputStrings = {"",
            "Enter a positive even integer: " +
                    "The number you entered is not positive or not even. Please reenter: The number you entered is not positive or not even. Please reenter: The number you entered is not positive or not even. Please reenter: Sequence 1 to n: \n" +
                    "1 2 3 4 5 6 \n" +
                    "Even sequence 2 to n: \n" +
                    "2 4 6 \n" +
                    "Sequence n down to 1: \n" +
                    "6 5 4 3 2 1 \n" +
                    "Even sequence n down to 2: \n" +
                    "6 4 2 \n" +
                    "Sequence -n to -1: \n" +
                    "-6 -5 -4 -3 -2 -1 \n" +
                    "Even sequence -n to -2: \n" +
                    "-6 -4 -2 \n" +
                    "Sequence -1 down to -n: \n" +
                    "-1 -2 -3 -4 -5 -6 \n" +
                    "Even sequence -2 down to -n: \n" +
                    "-2 -4 -6 \n",
            "Enter a positive even integer: " +
                    "The number you entered is not positive or not even. Please reenter: The number you entered is not positive or not even. Please reenter: The number you entered is not positive or not even. Please reenter: Sequence 1 to n: \n" +
                    "1 2 3 4 5 6 7 8 \n" +
                    "Even sequence 2 to n: \n" +
                    "2 4 6 8 \n" +
                    "Sequence n down to 1: \n" +
                    "8 7 6 5 4 3 2 1 \n" +
                    "Even sequence n down to 2: \n" +
                    "8 6 4 2 \n" +
                    "Sequence -n to -1: \n" +
                    "-8 -7 -6 -5 -4 -3 -2 -1 \n" +
                    "Even sequence -n to -2: \n" +
                    "-8 -6 -4 -2 \n" +
                    "Sequence -1 down to -n: \n" +
                    "-1 -2 -3 -4 -5 -6 -7 -8 \n" +
                    "Even sequence -2 down to -n: \n" +
                    "-2 -4 -6 -8 \n"
    };

    private void outputMatchingTest(String inputString, String outputString) {
        String teacherOutput = StringUtilities.trimEachLine(outputString);

        PrintStream stdOut = System.out;
        InputStream stdIn = System.in;

        ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos2));
        System.setIn(new ByteArrayInputStream(inputString.getBytes(StandardCharsets.UTF_8)));
        SequencePractice.main(null); //students are expected to submit the file
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
}
