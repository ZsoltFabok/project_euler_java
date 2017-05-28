package project_euler.problems;

import project_euler.util.DataFile;

/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below,
 * the maximum total from top to bottom is 23.
 *
 *    3
 *   7 4
 *  2 4 6
 * 8 5 9 3
 *
 * That is, 3 + 7 + 4 + 9 = 23.
 *
 * Find the maximum total from top to bottom of the triangle in the data set.
 */
public class Problem067 {
    public long execute() {
        return new Problem018().calculate(new DataFile().loadNumbers("problem067"));
    }
}
