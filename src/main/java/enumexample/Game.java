package enumexample;

import com.sun.jdi.PrimitiveValue;

public class Game {

    public void startGame(LevelEnum level) {
        generateGameBoard(level.getLength(), level.getWidth());
        generateCpuPlayer(level.getCpuDifiiculty());
        setMaxScore(level.getMaxScore());
        play();
    }

    private void generateGameBoard(int length, int width) {
        System.out.println("Generating game board..." + length + " " + width);
    }

    private void generateCpuPlayer(int cpuDifficulty) {
        System.out.println("Generating cpu with difficulty " + cpuDifficulty);
    }

    private void setMaxScore(int maxScore) {
        System.out.println("Setting max score ..." + maxScore);
    }

    private void play() {
        System.out.println("Starting game ...");
    }
}
