package io.github.niltonurias.whatsnewinjava.jdk11;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaAPI {
    public static void lambda() {
        BiFunction<Integer, Integer, Integer> summed = (Integer x, Integer y) -> x + y;
        System.out.println("Using lambda and function to sum two integer: " + summed.apply(1, 2));

        var array = Arrays.asList("Kotlin", "Java", "Jaspian", "Cake", "Jumper");
        System.out.println("Using lambda in Stream.filter: " + array.stream().filter(x -> x.startsWith("J")).toList());
    }

    public static void main(String[] args) {
        lambda();
    }
}
