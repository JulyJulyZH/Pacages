package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class TimeOfRestTest {
    @ParameterizedTest
    @CsvFileSource(files = "src\\test\\resources\\rest.csv")
    public void testCountMonthsOfRest(int expected, int income, int expenses, int threshold) {
        TimeOfRest rest = new TimeOfRest();
        int actual = rest.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}