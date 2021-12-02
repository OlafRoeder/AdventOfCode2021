package de.olaf_roeder.day01;

import de.olaf_roeder.commons.InputReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://adventofcode.com/2021/day/1
 */
public class DayOnePuzzleTwo {

    public static void main(String[] args) throws URISyntaxException, IOException {
        new DayOnePuzzleTwo().solve();
    }

    private void solve() throws URISyntaxException, IOException {

        List<String> strings = InputReader.readInput(this.getClass(), "input.txt");
        List<Integer> integers = strings.stream().map(Integer::parseInt).collect(Collectors.toUnmodifiableList());

        int incCounter = 0;

        for (int i = 1; i < integers.size() - 2; i++) {

            Integer previousSweep = threeMeasurementWindow(integers.get(i - 1), integers.get(i), integers.get(i + 1));
            Integer currentSweep = threeMeasurementWindow(integers.get(i), integers.get(i + 1), integers.get(i + 2));

            if (currentSweep > previousSweep)
                incCounter++;
        }

        System.out.println("How many measurements are larger than the previous measurement? " + incCounter);
    }

    private static Integer threeMeasurementWindow(Integer integer, Integer integer1, Integer integer2) {
        return integer + integer1 + integer2;
    }
}
