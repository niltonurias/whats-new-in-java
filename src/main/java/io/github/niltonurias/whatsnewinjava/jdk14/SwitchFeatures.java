package io.github.niltonurias.whatsnewinjava.jdk14;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

public class SwitchFeatures {

    /**
     *
     */
    private static void switchExpressions() {
        makeTitle("switch expressions inline");
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        var typeOfDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
            case SATURDAY, SUNDAY -> "Day Off";
        };

        System.out.println("Today is? " + typeOfDay);
    }

    private static void switchExpressionsWithMultiplesLines() {
        makeTitle("switch expression with multiples lines and return value");
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        var typeOfDay = switch(dayOfWeek) {
            case MONDAY -> {
                // do more stuff before return
                yield "It's monday";
            }
            case TUESDAY -> {
                // do more stuff before return
                yield "It's Tuesday";
            }
            case WEDNESDAY -> {
                // do more stuff before return
                yield "It's Wednesday";
            }
            case THURSDAY -> {
                // do more stuff before return
                yield "It's Thursday";
            }
            case FRIDAY -> {
                // do more stuff before return
                yield "It's Friday";
            }
            case SATURDAY -> {
                // do more stuff before return
                yield "It's Saturday";
            }
            case SUNDAY -> {
                // do more stuff before return
                yield "Who knows... I think i'm a little drunk... _:(´ཀ`」∠):_ ";
            }
        };

        System.out.println("Today is? " + typeOfDay);
    }

    public static void main(String[] args) {
        switchExpressions();
        switchExpressionsWithMultiplesLines();
    }
}
