package io.github.niltonurias.whatsnewinjava.jdk11;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

public class StringAPI {
    public static void lines() {
        makeTitle("lines feature");
        String multiplesLines = "This is a new feature!\nWe can extract every line inside a string.\nLet's try it!";
        var lines = multiplesLines.lines().toList();
        lines.forEach(System.out::println);
    }

    public static void repeat() {
        makeTitle("repeat feature");
        String output = "La ".repeat(2) + "Land";
        System.out.println(output);
    }

    public static void strip() {
        makeTitle("strip feature");
        String value = "\n\t  hello   \u2005";
        System.out.println("Original string: " + value);
        System.out.println("Stripped value: " + value.strip());
    }

    public static void isBlank() {
        makeTitle("isBlank feature");
        String value = "\n\t \u2005";
        System.out.println("Text: \"\\n\\t \\u2005\"");
        System.out.println("This text is blank?: " + value.isBlank());
        System.out.println("This text is empty?: " + value.isEmpty());
    }

    public static void main(String[] args) {
        lines();
        repeat();
        strip();
        isBlank();
    }
}
