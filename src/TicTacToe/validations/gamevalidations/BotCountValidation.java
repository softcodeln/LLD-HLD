package TicTacToe.validations.gamevalidations;

import TicTacToe.exceptions.BotCountException;
import TicTacToe.models.Player;
import TicTacToe.models.PlayerType;

import java.util.List;

public class BotCountValidation {
    public static void validate(List<Player> players) {
        int cntBot = 0;
        for (Player player : players) {
            if (player.getPlayerType().equals(PlayerType.BOT)) {
                cntBot++;
            }
        }
        if (cntBot > 1) {
            throw new BotCountException("Only one bot is allowed in the game");
        }
    }
}
