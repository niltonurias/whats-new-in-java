package io.github.niltonurias.whatsnewinjava.jdk12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

public class CollectorsFeature {

    /**
     * It is a composite of two downstream collectors. <br>
     * Every element is processed by both downstream collectors.<br>
     * Then their results are passed to the merge function and transformed into the final result.<br>
     * <br>
     * @see java.util.stream.Collectors
     * @since 12
     *
     */
    private static void teeing() {
        makeTitle("teeing feature");
        double answer = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(
                        Collectors.teeing(
                                Collectors.summingDouble(i -> i),
                                Collectors.counting(),
                                (sum, count) -> sum / count));

        System.out.println("Answer: " + answer);

        double answer2 = Stream.of(5, 10, 15, 20)
                .collect(
                        Collectors.teeing(
                                Collectors.averagingDouble(i -> i),
                                Collectors.counting(),
                                (average, count) -> average / count));

        System.out.println("Answer2: " + answer2);
    }

    public static void main(String[] args) {
        teeing();
    }
}
