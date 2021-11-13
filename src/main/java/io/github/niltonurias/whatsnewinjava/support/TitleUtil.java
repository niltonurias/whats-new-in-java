package io.github.niltonurias.whatsnewinjava.support;

public class TitleUtil {
    private static final Integer EQUAL_REPEAT_TIME = 20;
    public static void makeTitle(String title) {
        System.out.println("\n" + "=".repeat(EQUAL_REPEAT_TIME) + " " + title + " " + "=".repeat(EQUAL_REPEAT_TIME));
    }
}
