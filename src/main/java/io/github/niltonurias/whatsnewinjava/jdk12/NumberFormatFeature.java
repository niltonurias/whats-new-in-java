package io.github.niltonurias.whatsnewinjava.jdk12;

import java.text.NumberFormat;
import java.util.Locale;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

public class NumberFormatFeature {

    /**
     * Yep, now we can get a compacted number, like 12k=12.000 or 12 thousand = 12.000<br><br>
     * It's designed to represent a number in a shorter form, based on the patterns provided by a given locale.<br>
     * The locale parameter is responsible for providing proper format patterns. <br>
     * The format style can be either SHORT or LONG. For a better understanding of the format styles, let's consider number 1000 in the US locale.<br>
     * The SHORT style would format it as “10K”, and the LONG one would do it as “10 thousand”.<br>
     * <br>
     * @see NumberFormat
     * @since 12
     */
    private static void compactNumber() {
        makeTitle("compactNumber feature");
        Long numberToFormat = 1200000L;

        NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

        shortFormat.setMinimumFractionDigits(2);
        longFormat.setMinimumFractionDigits(2);

        System.out.println("Short Format: " + shortFormat.format(numberToFormat));
        System.out.println("Long Format: " + longFormat.format(numberToFormat));
    }

    public static void main(String[] args) {
        compactNumber();
    }
}
