/**
 * Given two positive numbers first and second, produce a multiplication table for numbers first through second,
 * inclusive.
 *
 * For example, if create(4, 6) produces the following 2D array: [[0, 4, 5, 6] [4, 16, 20, 24] [5, 20, 25, 30]
 * [6, 24, 30, 36]]
 */
public class TimesTable {
    /**
     * method that generates times table.
     * @param first the number to start the multiplication table at
     * @param second the number to end the multiplication table at
     * @return the two-dimensional multiplication table, or null if the arguments are invalid
     */
    public static int[][] generateTimesTable(final int first, final int second) {
        if (first <= 0 || second <= 0) {
            return null;
        }
        if (first >= second) {
            return null;
        }
        if (first == 0 && second == 1) {
            return null;
        }
        int range = second - first + 2;
        int[][] timesTable = new int[range][range];
        int counter = first;

        timesTable[0][0] = 0;
        for (int i = 1; i < timesTable.length; i++) {
            timesTable[i][0] = counter;
            timesTable[0][i] = counter;
            counter++;
        }
        for (int i = 1; i < timesTable.length; i++) {
            for (int j = 1; j < timesTable.length; j++) {
                timesTable[i][j] = timesTable[0][i] * timesTable[j][0];
            }
        }

        return timesTable;
    }
}
