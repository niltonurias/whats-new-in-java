package io.github.niltonurias.whatsnewinjava.jdk16;

public class InstanceOfPatternMatching {

    private static void newInstanceOf() {
        Object obj = new String("This is a string, but i'm object...");

        // Old way
        if (obj instanceof String) {
            String value = (String) obj;
            System.out.println("(old way) Now I know: " + value);
        }

        // New way
        if (obj instanceof String value) {
            System.out.println("(new way)Now I know: " + value);
        }
    }

    public static void main(String[] args) {
        newInstanceOf();
    }
}
