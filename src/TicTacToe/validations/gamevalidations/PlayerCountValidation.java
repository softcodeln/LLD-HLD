package TicTacToe.validations.gamevalidations;

import TicTacToe.exceptions.PlayerCountException;
import TicTacToe.models.Player;
import TicTacToe.models.PlayerType;

import java.util.List;

public class PlayerCountValidation {
    public static void validate(List<Player> players) {
        if (players.size() < 2 ) {
            throw new PlayerCountException("Minimum number of players must be 2");
        }
    }
}
