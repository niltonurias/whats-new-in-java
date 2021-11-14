package io.github.niltonurias.whatsnewinjava.jdk11;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

/**
 * Java 11 introduces the notion of nestmates and the associated access rules within the JVM.<br>
 * A nest of classes in Java implies both the outer/main class and all its nested classes:
 *
 * <br><br>
 * @since 11
 */
public class NestBasedClass {
    private static void isNestmateOf() {
        makeTitle("isNestmateOf feature");
        System.out.println("IsNestmateOf (true): " + NestBasedClass.class.isNestmateOf(NestBasedClass.NestedClass.class));
        System.out.println("IsNestmateOf (false): " + NestBasedClass.class.isNestmateOf(String.class));
    }

    public static void main(String[] args) {
        isNestmateOf();
    }

    static class NestedClass {}
}
