package TicTacToe.validations.movevalidations;

import TicTacToe.models.Board;
import TicTacToe.models.CellState;
import TicTacToe.models.Move;

public class MoveValidation {
    public static boolean validate(Move move, Board board) {
        int r = move.getCell().getRow();
        int c = move.getCell().getCol();

        if (r < 0 || r >= board.getSize() || c < 0 || c >= board.getSize()) {
//            throw new RuntimeException("Invalid move : Out of the board.");
            System.out.println("Invalid move : Out of the board.");
            return false;
        }
        CellState cellState = board.getGrid().get(r).get(c).getCellState();
        if (cellState.equals(CellState.FILLED) || cellState.equals(CellState.BLOCKED)) {
//            throw new RuntimeException("Invalid move : Cell is already occupied or blocked.");
            System.out.println("Invalid move : Cell is already occupied or blocked.");
            return false;
        }
        return true;
        // Create separate exceptions for the above
    }
}
