package TicTacToe.exceptions;

public class PlayerCountException extends RuntimeException{
    public PlayerCountException(String message) {
        super(message);
    }
}
