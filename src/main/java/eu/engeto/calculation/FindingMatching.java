package eu.engeto.calculation;

import java.util.List;

public class FindingMatching {

    public static Double findMatching(List<Double> numbers, double lowerLimit, double upperLimit) {
        for (Double number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                return number;
            }
        }
        return null; // nebo vyhoďte výjimku, pokud žádné číslo nesplňuje podmínky
    }
}
