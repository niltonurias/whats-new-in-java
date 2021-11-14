package io.github.niltonurias.whatsnewinjava.jdk11;

import java.util.List;
import java.util.stream.Collectors;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

/**
 * A few new methods are introduced in String api.<br>
 * Some like <i>lines, repeat, strip and isBlank</i>
 *
 * <br><br>
 * @since 11
 * @see java.lang.String
 */
public class StringAPI {
    /**
     * The method <i>lines()</i> break the lines (separated by line terminators) from a string and return a stream.
     * <br><br>
     * @see java.util.stream.Stream
     */
    public static void lines() {
        makeTitle("lines feature");
        String multiplesLines = "This is a new feature!\nWe can extract every line inside a string.\nLet's try it!";
        List<String> lines = multiplesLines.lines().collect(Collectors.toList());
        lines.forEach(System.out::println);
    }

    /**
     * Like the name, repeat() method repeat a string in N times returning a new string.
     */
    public static void repeat() {
        makeTitle("repeat feature");
        String output = "La ".repeat(2) + "Land";
        System.out.println(output);
    }

    /**
     * Strip method, remove all whitespaces from a string
     */
    public static void strip() {
        makeTitle("strip feature");
        String value = "\n\t  hello   \u2005";
        System.out.println("Original string: " + value);
        System.out.println("Stripped value: " + value.strip());
    }

    /**
     * The <i>isBlank()</i> instance method returns true if the string is empty or contains only whitespace. Otherwise, it returns false:
     */
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
