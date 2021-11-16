package io.github.niltonurias.whatsnewinjava.support;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {
    private static final String FILE_NAME = "temp-file";
    private static final String EXTENSION = ".txt";
    public static final Path PATH_FILE = Paths.get(".", FILE_NAME + EXTENSION);
    public static void deleteAndCreateEmptyFile() throws IOException {
        Files.deleteIfExists(PATH_FILE);
        Files.createTempFile(FILE_NAME, EXTENSION);
    }

    public static void deleteFile() throws IOException {
        Files.deleteIfExists(PATH_FILE);
    }
}
