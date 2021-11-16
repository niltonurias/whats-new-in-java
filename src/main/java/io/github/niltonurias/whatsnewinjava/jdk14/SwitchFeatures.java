package io.github.niltonurias.whatsnewinjava.jdk14;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchFeatures {

    private static void switchExpressions() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        var typeOfDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
            case SATURDAY, SUNDAY -> "Day Off";
        };

        System.out.println("We will work today? " + typeOfDay);
    }

    public static void main(String[] args) {
        switchExpressions();
    }
}
