package personal.game;

import java.util.Arrays;
import java.util.List;

public class WordSearchApp {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three");

        Grid wordGrid = new Grid(10);
        wordGrid.fillGrid(words);
        wordGrid.displayGrid();
    }
}
