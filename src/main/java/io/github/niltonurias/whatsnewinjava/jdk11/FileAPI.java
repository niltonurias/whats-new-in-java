package io.github.niltonurias.whatsnewinjava.jdk11;

import java.io.IOException;
import java.nio.file.Files;
import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;
import static io.github.niltonurias.whatsnewinjava.support.FileUtil.*;

/**
 * This new feature in Java 11 make easy to write and read in files,
 * removing all repetitive code or 3° libs.
 *
 * @since 11
 * @see java.nio.file.Files
 */
public class FileAPI {
    public static void writeString() throws IOException {
        makeTitle("writeString feature");
        deleteAndCreateEmptyFile();
        System.out.println("File content: " + Files.readString(PATH_FILE));

        String value = "Writing a sample content to the file";
        System.out.println("Content to write: " + value);
        Files.writeString(PATH_FILE, value);

        System.out.println("File content: " + Files.readString(PATH_FILE));
    }

    public static void readString() throws IOException {
        makeTitle("readString feature");
        deleteAndCreateEmptyFile();

        String value = "Reading a sample content to the file";
        System.out.println("Content to write: " + value);
        Files.writeString(PATH_FILE, value);

        System.out.println("File content: " + Files.readString(PATH_FILE));
    }

    public static void main(String[] args) throws IOException {
        readString();
        writeString();
        deleteFile();
    }
}
