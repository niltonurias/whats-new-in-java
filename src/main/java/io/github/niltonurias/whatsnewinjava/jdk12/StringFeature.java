package io.github.niltonurias.whatsnewinjava.jdk12;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

public class StringFeature {

    /**
     * <i>indent</i> adjusts the indentation of each line based on the integer parameter. <br>
     * If the parameter is greater than zero, new spaces will be inserted at the beginning of each line.<br>
     * On the other hand, if the parameter is less than zero, it removes spaces from the begging of each line.<br>
     * If a given line does not contain sufficient white space, then all leading white space characters are removed.<br>
     * <br>
     * @since 12
     * @see java.lang.String
     */
    private static void indent() {
        makeTitle("indent feature");
        String text = "This is a new feature!\nWe can indent every line using only a function now.\nLet's try it!";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);
    }

    /**
     * It accepts a single argument function as a parameter that will be applied to the string.
     *
     * <br><br>
     * @since 12
     * @see java.lang.String
     */
    private static void transform() {
        makeTitle("transform feature");
        String text = "This is a example!";
        String transformed = text.transform(t -> new StringBuilder(t).reverse().toString());
        System.out.println(transformed);

        String transformed2 = text.transform(t -> {
            var x = t.split("");
            StringBuilder r = new StringBuilder();
            for(int i = 0; i < x.length; i++) {
                r.append((i % 2 == 0) ? x[i].toUpperCase() : x[i].toLowerCase());
            }

            return r.toString();
        });

        System.out.println(transformed2);
    }

    public static void main(String[] args) {
        indent();
        transform();
    }
}
