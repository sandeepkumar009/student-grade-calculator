package com.sandeepkumar.gradecalculator;

import java.util.Arrays;
import java.util.List;

/**
 * A simple demonstration of the GradeCalculator functionality.
 */
public final class Main {

    /**
     * Private constructor to prevent instantiation.
     */
    private Main() {
    }

    /**
     * The main entry point for the demonstration.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {
        final GradeCalculator calculator = new GradeCalculator();
        final List<Double> studentGrades = Arrays.asList(88.5, 92.0, 76.5, 95.0);

        System.out.println("Demonstrating GradeCalculator...");
        System.out.println("Grades: " + studentGrades);

        // This demonstrates the successful calculation path.
        // Calling calculateAverage with an empty or null list would throw
        // an IllegalArgumentException, which is verified in the unit tests.
        final double average = calculator.calculateAverage(studentGrades);

        System.out.printf("Calculated Average: %.2f%n", average);
    }
}