package io.github.niltonurias.whatsnewinjava.jdk16;

/**
 * Sealed classes, first introduced in Java 15,
 * provide a mechanism to determine which sub-classes are allowed to extend or implement a parent class or interface.
 */
public class SealedClass {
    public sealed interface JungleAnimal permits Monkey, Snake {}

    public static final class Monkey implements JungleAnimal {
    }

    public static non-sealed class Snake implements JungleAnimal {}

    /**
     * public static final class Dog implements JungleAnimal {}
     *
     * We cannot do this, because only monkey and snake are allowed to implement JungleAnimal.
     */

    public static void main(String[] args) {
    }
}
