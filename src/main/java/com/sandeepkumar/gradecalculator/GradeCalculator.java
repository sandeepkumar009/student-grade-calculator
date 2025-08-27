package com.sandeepkumar.gradecalculator;

import java.util.List;

/**
 * Calculates the average of a list of numeric grades.
 *
 * <p>This class adheres to the Single Responsibility Principle by focusing
 * exclusively on the calculation logic. It does not handle data input,
 * validation of user input, or data display.
 */
public class GradeCalculator {

    /**
     * Computes the average of a list of grades.
     *
     * @param grades A non-null, non-empty list of grades.
     * @return The average of the grades.
     * @throws IllegalArgumentException if the list is null or empty.
     */
    public double calculateAverage(final List<Double> grades) {
        if (grades == null || grades.isEmpty()) {
            throw new IllegalArgumentException("Grade list cannot be null or empty.");
        }

        double sum = 0.0;
        for (final Double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }
}