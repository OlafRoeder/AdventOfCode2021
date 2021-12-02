package de.olaf_roeder.day02;

import de.olaf_roeder.commons.InputReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * https://adventofcode.com/2021/day/2
 */
public class DayTwoPuzzleOne {

    int depth;
    int horizontalPosition;

    public static void main(String[] args) throws URISyntaxException, IOException {
        new DayTwoPuzzleOne().solve();
    }

    private void solve() throws URISyntaxException, IOException {

        List<String> input = InputReader.readInput(this.getClass(), "input.txt");

        input.stream()
                .filter(s -> s.startsWith("forward"))
                .forEach(s -> horizontalPosition += getNumber(s));

        input.stream()
                .filter(s -> s.startsWith("down"))
                .forEach(s -> depth += getNumber(s));

        input.stream()
                .filter(s -> s.startsWith("up"))
                .forEach(s -> depth -= getNumber(s));

        System.out.println("What do you get if you multiply your final horizontal position by your final depth? " + (depth * horizontalPosition));
    }

    static int getNumber(String s) {

        int length = s.length();
        String integer = s.substring(length - 1);

        return Integer.parseInt(integer);
    }
}
