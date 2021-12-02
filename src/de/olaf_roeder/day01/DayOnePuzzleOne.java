package de.olaf_roeder.day01;

import de.olaf_roeder.commons.InputReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://adventofcode.com/2021/day/1
 */
public class DayOnePuzzleOne {

    public static void main(String[] args) throws URISyntaxException, IOException {
        new DayOnePuzzleOne().solve();
    }

    private void solve() throws URISyntaxException, IOException {

        List<String> strings = InputReader.readInput(this.getClass(), "input.txt");
        List<Integer> integers = strings.stream().map(Integer::parseInt).collect(Collectors.toUnmodifiableList());

        int incCounter = 0;

        for (int i = 1; i < integers.size(); i++) {

            Integer previousSweep = integers.get(i - 1);
            Integer currentSweep = integers.get(i);

            if (currentSweep > previousSweep)
                incCounter++;
        }

        System.out.println("How many measurements are larger than the previous measurement? " + incCounter);
    }
}
