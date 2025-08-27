package com.sandeepkumar.gradecalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Unit tests for the GradeCalculator class.
 */
class GradeCalculatorTest {

    private GradeCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new GradeCalculator();
    }

    @Test
    @DisplayName("Calculates average for a typical list of grades")
    void testCalculateAverageWithMultipleGrades() {
        final List<Double> grades = Arrays.asList(80.0, 90.0, 100.0, 70.0);
        final double expected = 85.0;
        assertEquals(expected, calculator.calculateAverage(grades), 0.001);
    }

    @Test
    @DisplayName("Calculates average for a single grade")
    void testCalculateAverageWithSingleGrade() {
        final List<Double> grades = Collections.singletonList(95.5);
        assertEquals(95.5, calculator.calculateAverage(grades), 0.001);
    }

    @Test
    @DisplayName("Throws exception for an empty list")
    void testCalculateAverageWithEmptyList() {
        final List<Double> grades = Collections.emptyList();
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateAverage(grades));
    }

    @Test
    @DisplayName("Throws exception for a null list")
    void testCalculateAverageWithNullList() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateAverage(null));
    }
}