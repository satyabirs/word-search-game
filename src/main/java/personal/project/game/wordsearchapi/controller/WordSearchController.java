package personal.project.game.wordsearchapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import personal.project.game.wordsearchapi.service.WordGridService;

import java.util.List;

@RestController("/")
public class WordSearchController {

    @Autowired
    private WordGridService wordGridService;

    @GetMapping("/wordgrid")
    public String createWordGrid(@RequestParam int gridSize, @RequestParam List<String> words){
        char[][] grid = wordGridService.generateGrid(gridSize, words);
        String gridToString = "";
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                gridToString += grid[i][j] + " ";
            }
            gridToString += "\r\n";
        }
        return gridToString;
    }
}
