package io.github.niltonurias.whatsnewinjava.jdk16;

public class RecordFeature {

    private record Person(String name) {}
    private record Animal(String name, Double age) {}

    private static void recordTheNewDTO() {
        Person person = new Person("James");
        System.out.println("Person name: " + person.name());

        Animal animal = new Animal("Yuki", 0.7);
        System.out.printf("My dog's name is %s and has %s years old", animal.name(), animal.age());

    }

    public static void main(String[] args) {
        recordTheNewDTO();
    }
}
