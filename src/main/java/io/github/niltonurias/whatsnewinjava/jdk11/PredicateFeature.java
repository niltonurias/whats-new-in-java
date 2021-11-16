package io.github.niltonurias.whatsnewinjava.jdk11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

/**
 * A static not method has been added to the Predicate interface.<br>We can use it to negate an existing predicate, much like the negate method.
 * <br><br>
 * @since 11
 * @see java.util.function.Predicate
 */
public class PredicateFeature {
    public static void predicateNot() {
        makeTitle("predicateNot feature");
        List<String> array = Arrays.asList("Java", "\t \u2005", "Kotlin", " ");
        System.out.println("Only blanks: " + array.stream().filter(String::isBlank).collect(Collectors.toList()));
        System.out.println("Only not blanks (Predicate.not): " + array.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        predicateNot();
    }
}
