package io.github.niltonurias.whatsnewinjava.jdk11;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Support for using the local variable syntax (var keyword) in lambda parameters was added in Java 11.<br>
 * We can make use of this feature to apply modifiers to our local variables, like defining a type annotation.<br><br>
 * Before this version, we cannot use <i>var</i> in lambda.
 * <br><br>
 * @since 11
 */
public class LambdaFeature {
    public static void lambda() {
        BiFunction<Integer, Integer, Integer> summed = (var x, var y) -> x + y;
        System.out.println("Using lambda and function to sum two integer: " + summed.apply(1, 2));

        List<String> array = Arrays.asList("Kotlin", "Java", "Jaspian", "Cake", "Jumper");
        System.out.println("Using lambda in Stream.filter: " + array.stream().filter((var x) -> x.startsWith("J")).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        lambda();
    }
}
