import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that splits a string on character change boundaries.
 * <p>
 * The provided code is incomplete. Modify it so that it works properly and passes the tests in
 * <code>StringSplitterTest.java</code>.
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/2/">MP2 Documentation</a>
 */
public class StringSplitter {
    /**
     * splits the input string at the given char.
     * @param input the string that the user wants to split it into two string
     * @return string that is returned after splitting
     */
    public static String[] stringSplitter(final String input) {
        if (input == null) {
            return null;
        }
        String[] empty = new String[0];

        if (input.isEmpty()) {
            return empty;
        }
        ArrayList<String> output = new ArrayList<>();
        String str = "";
        char[] inputArr = input.toCharArray();
        char end = input.toCharArray()[0];

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == end) {
                str += inputArr[i];
            } else {
                output.add(str);
                str = "";
                str += inputArr[i];
            }
            end = inputArr[i];
        }

        output.add(str);
        String[] split = output.toArray(new String[(output.size())]);
        return split;
    }

    /* ********************************************************************************************
     * You do not need to modify code below this comment.
     * ********************************************************************************************/

    /**
     * Solicit a string and split it whenever the character changes.
     * <p>
     * You are free to review this function, but should not modify it. Note that this function is
     * not tested by the test suite, as it is purely to aid your own interactive testing.
     *
     * @param unused unused input arguments
     */
    public static void main(final String[] unused) {
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Enter a string to split: ");
        String input = lineScanner.nextLine();
        System.out.println("This splits into: ");
        System.out.println(Arrays.toString(stringSplitter(input)));
    }
}
