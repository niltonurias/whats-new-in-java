package io.github.niltonurias.whatsnewinjava.jdk12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

public class FileFeature {

    /**
     * The method is used to compare two files and find the position of the first mismatched byte in their contents.<br>
     * The return value will be in the inclusive range of 0L up to the byte size of the smaller file or -1L if the files are identical.<br>
     * <br>
     * @see java.nio.file.Files
     * @since 12
     */
    private static void mismatch() throws IOException {
        makeTitle("mismatch feature");
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Path filePath3 = Files.createTempFile("file3", ".txt");

        Files.writeString(filePath1, "Just a simple text!");
        Files.writeString(filePath2, "Just a simple text!");
        Files.writeString(filePath3, "Just an another simple text!");

        System.out.println("\nIs different?");
        System.out.println("file1 x file2: " + (Files.mismatch(filePath1, filePath2) >= 0));
        System.out.println("file1 x file3: " + (Files.mismatch(filePath1, filePath3) >= 0));
    }

    public static void main(String[] args) throws IOException {
        mismatch();
    }
}
