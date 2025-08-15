package TicTacToe.controllers;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.models.WinningStrategyType;

import java.util.List;

public class GameController {
    // Getting game ID
    public Game startGame(int size, List<Player> players, List<WinningStrategyType> winningStrategyTypes) {
        Game game = Game.getBuilder()
                .setSize(size)
                .setPlayers(players)
                .setWinningStrategyTypes(winningStrategyTypes)
                .build();
        return game;//game_id
    }

    public void displayBoard(Game game) {
        game.getBoard().display();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public GameState checkGameStatus(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }
}

// 1. Start a game with given inpuits/configs
// 2. initialize and display the board
// 3. Make Moves
// 4. Get Game status
// 5. Get Game winner
