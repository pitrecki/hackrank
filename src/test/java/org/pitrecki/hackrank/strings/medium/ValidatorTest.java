package org.pitrecki.hackrank.strings.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.pitrecki.hackrank.strings.medium.Validator.Option;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-01-28.
 */
class ValidatorTest
{
    @Test
    @DisplayName("Test IPV4 pattern with different input")
    void testShouldPassWithDiferentIpv4LikeInput() {
        Validator validator = new Validator(Option.IPV4);
        String[] ipv4LikeText = {"000.12.12.034", "121.234.12.12", "23.45.12.56", "00.12.123.123123.123", "122.23", "Hello.IP"};

        List<Boolean> actual = Arrays.stream(ipv4LikeText)
                .map(validator::validate)
                .collect(Collectors.toList());

        assertThat(actual).contains(true, true, true, false, false, false);
    }

    @Test
    @DisplayName("Test wrong ipv4 addresses")
    void testWithWrongIPV4AddressesShouldReturnFalse() {
        Validator validator = new Validator(Option.IPV4);
        String[] wrongIpv4Addresses = {"00.12.123.123123.123", "122.23", "Hello.IP"};

        List<Boolean> actual = Arrays.stream(wrongIpv4Addresses)
                .map(validator::validate)
                .collect(Collectors.toList());

        assertThat(actual).contains(false, false, false);
    }

    @Test
    @DisplayName("Test correct ipv4 addresses")
    void testWithCorrectIPV4AddressesShouldRetrunTrue() {
        Validator validator = new Validator(Option.IPV4);
        String[] correctIpv4Addresses = {"000.12.12.034", "121.234.12.12", "23.45.12.56"};

        List<Boolean> actual = Arrays.stream(correctIpv4Addresses)
                .map(validator::validate)
                .collect(Collectors.toList());

        assertThat(actual).contains(true, true, true);
    }

    @Test
    @DisplayName("Test multiple usernames with diferent type")
    void testShouldPassWithMultipleUsername() {
        Validator validator = new Validator(Option.USERNAME);
        String[] multipleUsernames = {"alpha_naheed", "xahidbuffon", "nagib@007", "123Swakkhar"};

        List<Boolean> acutal = Arrays.stream(multipleUsernames)
                .map(validator::validate)
                .collect(Collectors.toList());

        assertThat(acutal).contains(true, true, false, false);
    }

    @Test
    @DisplayName("Test correct usernames")
    void testWithCorrectUsernameShouldReturnTrue() {
        Validator validator = new Validator(Option.USERNAME);
        String[] multipleUsernames = {"alpha_naheed", "xahidbuffon"};

        List<Boolean> acutal = Arrays.stream(multipleUsernames)
                .map(validator::validate)
                .collect(Collectors.toList());

        assertThat(acutal).contains(true, true);
    }

    @Test
    @DisplayName("Test wrong usernames")
    void testWithWrongUseranmeShouldReturnFalse() {
        Validator validator = new Validator(Option.USERNAME);
        String[] multipleUsernames = {"nagib@007", "123Swakkhar"};

        List<Boolean> acutal = Arrays.stream(multipleUsernames)
                .map(validator::validate)
                .collect(Collectors.toList());

        assertThat(acutal).contains(false, false);
    }
}