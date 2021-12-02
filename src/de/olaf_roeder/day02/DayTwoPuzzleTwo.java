package de.olaf_roeder.day02;

import de.olaf_roeder.commons.InputReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * https://adventofcode.com/2021/day/2
 */
public class DayTwoPuzzleTwo {

    int depth;
    int horizontalPosition;
    int aim;

    public static void main(String[] args) throws URISyntaxException, IOException {
        new DayTwoPuzzleTwo().solve();
    }

    private void solve() throws URISyntaxException, IOException {

        List<String> input = InputReader.readInput(this.getClass(), "input.txt");

        input.forEach(s -> {

            if (s.startsWith("forward")) {

                int number = DayTwoPuzzleOne.getNumber(s);
                horizontalPosition += number;
                depth += aim * number;

            } else if (s.startsWith("up")) {
                aim -= DayTwoPuzzleOne.getNumber(s);
            } else {
                aim += DayTwoPuzzleOne.getNumber(s);
            }
        });

        System.out.println("What do you get if you multiply your final horizontal position by your final depth? " + (horizontalPosition * depth));
    }
}
