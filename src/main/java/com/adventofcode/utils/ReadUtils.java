package com.adventofcode.utils;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadUtils {

    private ReadUtils() {}

    public static String asString(final String path) {
        try {
            final URL resource = ReadUtils.class.getResource(path);
            return Files.readString(Path.of(resource.getFile()));
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to read file from: " + path, e);
        }
    }

    public static List<String> asList(final String path) {
        try {
            final URL resource = ReadUtils.class.getResource(path);
            return Files.readAllLines(Path.of(resource.getFile()));
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to read file from: " + path, e);
        }
    }

}
