package org.pitrecki.hackrank.bignumber.medium;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

/**
 * Link to the task
 * <a href="https://www.hackerrank.com/challenges/java-bigdecimal"> Java BigDecimal </a>
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-01-27.
 */
public class SortBigDecimalDescending
{
    public SortBigDecimalDescending() {
    }

    /**
     * Sort entered array with descending order
     * @param array of strings
     * @return new sorted array
     */

    public String[] sortBigDecimalArray(String[] array) {
        return Arrays.stream(array)
                .sorted((s1, s2) -> Collections.reverseOrder().compare(new BigDecimal(s1), new BigDecimal(s2)))
                .toArray(String[]::new);
    }

}
