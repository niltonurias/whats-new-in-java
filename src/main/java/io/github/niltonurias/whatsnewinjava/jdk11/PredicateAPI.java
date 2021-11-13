package io.github.niltonurias.whatsnewinjava.jdk11;

import java.util.Arrays;
import java.util.function.Predicate;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

public class PredicateAPI {
    public static void predicateNot() {
        makeTitle("predicateNot feature");
        var array = Arrays.asList("Java", "\t \u2005", "Kotlin", " ");
        System.out.println("Only blanks: " + array.stream().filter(String::isBlank).toList().toString());
        System.out.println("Only not blanks (Predicate.not): " + array.stream().filter(Predicate.not(String::isBlank)).toList().toString());
    }

    public static void main(String[] args) {
        predicateNot();
    }
}
