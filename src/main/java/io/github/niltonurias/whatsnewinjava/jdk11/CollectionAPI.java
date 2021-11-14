package io.github.niltonurias.whatsnewinjava.jdk11;

import java.util.Arrays;
import java.util.Collection;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

/**
 * Since Java 11, a new feature has been implemented to java.lang.Collection.<br>
 * <br>
 * The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.<br>
 * This makes it easier to create an array of the right type from a collection<br>
 * <br>
 * @see java.util.Collection
 * @since 11
 */
public class CollectionAPI {
    private static void toArray() {
        makeTitle("toArray feature");
        Collection<String> list = Arrays.asList("Java", "Kotlin");
        System.out.println("List[] from List<String> (List.toArray(String[]::new): " + Arrays.toString(list.toArray(String[]::new)));
    }

    public static void main(String[] args) {
        toArray();
    }
}
