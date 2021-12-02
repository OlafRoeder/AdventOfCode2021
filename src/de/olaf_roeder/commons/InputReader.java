package de.olaf_roeder.commons;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class InputReader {

    public static <T> List<String> readInput(Class<T> clazz, String input) {

        try {

            Path path = Paths.get(clazz.getResource(input).toURI());
            return Files.readAllLines(path);

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }
}
