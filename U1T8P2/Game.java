package U1T8P2;

import java.math.BigDecimal;
import java.math.RoundingMode;

class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Dodge Ball", 5);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Is game over? " + game.isGameOver());

        System.out.println("----- UPDATING STATE OF GAME -----");
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        game.increaseScore(8);
        game.increaseScore(3);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());
        System.out.println("Is game over? " + game.isGameOver());
    }
}



public class Game {
    private String gameName;
    private int players;
    public int score;

    public Game(String name, int playerCount) {
        gameName = name;
        players=playerCount;

    }

    public String getGameName() {
        return gameName;
    }

    public int getPlayers() {
        return players;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore(int increase) {
        score += increase;
    }

    public void addPlayer() {
        players ++;
    }

    public double averageScorePerPlayer() {
        return (double) score / players;
    }

    public boolean isGameOver() {
        if (score > 9) {
            return true;
        } else {
            return false;
        }
    }

}
