package io.github.niltonurias.whatsnewinjava.jdk11;

import java.util.Arrays;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

public class CollectionAPI {
    private static void toArray() {
        makeTitle("toArray feature");
        var list = Arrays.asList("Java", "Kotlin");
        var listToArray = list.toArray();
        System.out.println("Object[] from List<String> (List.toArray()): " + Arrays.toString(listToArray));
        System.out.println("List[] from List<String> (List.toArray(String[]::new): " + Arrays.toString(list.toArray(String[]::new)));
    }

    public static void main(String[] args) {
        toArray();
    }
}
