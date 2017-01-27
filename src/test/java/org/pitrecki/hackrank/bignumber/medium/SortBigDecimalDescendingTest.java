package org.pitrecki.hackrank.bignumber.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-01-27.
 */
class SortBigDecimalDescendingTest
{
    private SortBigDecimalDescending sortBigDecimalDescending;

    @BeforeEach
    void setUp() {
        this.sortBigDecimalDescending = new SortBigDecimalDescending();
    }

    @Test
    @DisplayName("Check correct descend order of entered array")
    void teestShouldReturnNewArrayWithRevereseOrderedNumbers() {
        String[] arrayOfNumbers = {"9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
        String[] expected = {"90", "56.6", "50", "9", "02.34", "0.12", ".12", "0", "000.000", "-100"};

        String[] actual = sortBigDecimalDescending.sortBigDecimalArray(arrayOfNumbers);
        assertThat(actual).isEqualTo(expected);
    }
}