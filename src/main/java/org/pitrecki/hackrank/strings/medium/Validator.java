package org.pitrecki.hackrank.strings.medium;

import java.util.regex.Pattern;

/**
 * Links to the tasks
 *<a href="https://www.hackerrank.com/challenges/valid-username-checker"> Java Regex 3 - Username Checker </a>
 *<a href="https://www.hackerrank.com/challenges/java-regex"> Java Regex </a>
 *
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-01-28.
 */
public class Validator
{
    private final String IPV4_REGEX = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    private final String USERNAME_REGEX = "^[a-zA-Z_]$";

    private enum Option{IPV4, USERNAME}

    private Pattern pattern;

    public Validator(Option option) {
        setPattern(option);
    }

    /**
     * Validate intered text by user
     * @param input entered text
     * @return true if text matches with pattern
     *         false if text not matches with pattern
     */

    public boolean validate(String input) {
        return input.matches(pattern.pattern());
    }

    /**
     *
     * @param option IPV4 set pattern to ipv4 regex
     *               USERNAME set pattern to username regex
     */

    private void setPattern(Option option) {
        switch (option) {
            case IPV4:
                pattern = Pattern.compile(IPV4_REGEX);
                break;
            case USERNAME:
                pattern = Pattern.compile(USERNAME_REGEX);
                break;
        }
    }
}
