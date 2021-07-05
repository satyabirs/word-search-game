package personal.game;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class WordSearchApp {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three");

        Grid wordGrid = new Grid(10);
        wordGrid.fillGrid(words);
        wordGrid.displayGrid();
    }
}

/*
1. fill the words horizontally consecutively
2. generate coordinates and shuffle them and pick them for each word
3. check if the any coordinate value is already taken or not
 */