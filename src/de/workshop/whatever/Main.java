package de.workshop.whatever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Frame> frames = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Frame frame = new Frame();
        while (!done()) {
            System.out.print("Enter number of pins hit:");
            String input = in.readLine();
            Integer number = tryParse(input);
            if (number == null) {
                continue;
            }
            boolean frameFinished = frame.roll(number);
            if (frameFinished) {
                frame = new Frame();
            }
        }
    }

    static Integer tryParse(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    static boolean done() {
        return frames.size() > 9;
    }
}

class Frame {
    private int rolls = 0;
    private int[] rolled;

    public boolean roll(int number) {
        boolean finished = false;


        if ((rolled + number) == 10) {
            finished = true;
        } else {
            rolled += number;
        }

        return finished;

    }
    public boolean finished() {
        for(int i = 0; i < rolls;` i++) {

        }
    }
}
