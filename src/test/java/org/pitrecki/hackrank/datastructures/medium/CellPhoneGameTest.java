package org.pitrecki.hackrank.datastructures.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-01-28.
 */
class CellPhoneGameTest
{
    @Test
    @DisplayName("Test unsolveable array")
    void testUnsolveableArrayShouldRetunFalse() {
        int index = 86;
        int nextJump = 52;
        int[] array = {0,1,1,1,1,0,1,0,0,1,1,0,0,1,0,1,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,1,0,1,1,1,0,0,0,0,1,1,0,0,1,1,1,0,1,0,0,0,0,1,1,1,1,0,1,1,0,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,1,0,1,1,0,0,1,0,1};
        CellPhoneGame cellPhoneGame = new CellPhoneGame();
        boolean acutal = cellPhoneGame.isSolvable(nextJump, array, index);
        
        assertThat(acutal).isEqualTo(false);
    }

    @Test
    @DisplayName("Test solveable array")
    void testSolveableArrayShouldRetunTrue() {
        int index = 5;
        int nextJump = 3;
        int[] array = {0, 0, 0, 0, 0};
        CellPhoneGame cellPhoneGame = new CellPhoneGame();
        boolean actual = cellPhoneGame.isSolvable(nextJump, array, index);

        assertThat(actual).isEqualTo(true);
    }
}