/**
 * Class: StringUtilities
 * @author: Dr. Wei Jin, ITEC, GGC
 * Created spring,2023
 *
 * This class contains string manipulation methods used for precessing program outputs before
 * matching tests.
 */

public class StringUtilities {
    public static String trimEachLine(String str) {
        String[] lines = str.split("\n");
        String res = "";
        for (int i=0; i < lines.length; i++) {
            //System.out.printf("[%s]\n", lines[i]);
            lines[i] = lines[i].trim();
            res += lines[i] + "\n";
        }
        res = res.replaceAll(": ", ":");
        res = res.trim();
        return res;
    }
}
