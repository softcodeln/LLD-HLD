package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GameController gameController = new GameController();

        Player akash = new HumanPlayer("Akash", PlayerType.HUMAN,'X');
        Player botty = new BotPlayer("Ankit", PlayerType.BOT, 'O', BotDifficultyLevel.EASY);

        List<Player> players = new ArrayList<>();
        players.add(akash);
        players.add(botty);

        List<WinningStrategyType> winningStrategyTypes = new ArrayList<>();
        winningStrategyTypes.add(WinningStrategyType.ROW);
        winningStrategyTypes.add(WinningStrategyType.COL);

        Game game1 = gameController.startGame(3, players, winningStrategyTypes);
//        Game game2 = null;//gameController.startGame();

        while(gameController.checkGameStatus(game1).equals(GameState.IN_PROGRESS)) {
            gameController.displayBoard(game1);
            gameController.makeMove(game1);
            gameController.displayBoard(game1);

            System.out.println("Do you want to undo your move? [Y/N]");
            String input = scanner.nextLine();
            if (input.equals("Y")) {
                gameController.undo(game1);
            }
        }

        if (gameController.checkGameStatus(game1).equals(GameState.DRAW)) {
            System.out.println("The game is a draw!");
        } else {
            System.out.println("The winner is " + gameController.getWinner(game1).getName() + "!");
        }
    }
}

/*
Homework 1 :
Add all validations and exceptions classes required.
Convert the unique symbol validation code to one line using streams.
Add Bot's make move functon - For EASY and MEDIUM

Homework 2 :
Finish Winning Strategies

Larger Homework :
Convert this into REST API Once you learn How in PROJECT.
Build Tournament and LeaderBoard
*/