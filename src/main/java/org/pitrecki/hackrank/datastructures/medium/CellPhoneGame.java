package org.pitrecki.hackrank.datastructures.medium;

/**
 * Link to the task
 * <a href="https://www.hackerrank.com/challenges/java-1d-array"> 1-D Array (part 2) </a>
 *
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-01-28.
 */
public class CellPhoneGame
{
    public CellPhoneGame() {
    }

    public boolean isSolvable(int nextJumpPostion, int[] array, int index) {
        index -= 1;
        if (index < 0 || array[index] == 1)
            return false;
        if ((index == array.length - 1) || index + nextJumpPostion > array.length - 1)
            return true;

        array[index] = 1;
        return isSolvable(nextJumpPostion, array, index + 1) || isSolvable(nextJumpPostion, array, index - 1) || isSolvable(nextJumpPostion, array, index + nextJumpPostion);
    }
}
