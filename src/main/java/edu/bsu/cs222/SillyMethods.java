package edu.bsu.cs222;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class SillyMethods {
    public boolean didGuess42(int i) {
        Random random = new Random();
        boolean guessedRight = false;
        int value = random.nextInt(100);
        if (i == value) {
            guessedRight = true;
        }
        return guessedRight;
    }

    public String countTo(int i) {
        int count = 0;
        String countOutput = "";
        while (count < i) {
            countOutput += count + " ";
            count++;
        }
        countOutput += count;
        return countOutput;
    }
}
