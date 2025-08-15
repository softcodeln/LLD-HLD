package TicTacToe.models;

import TicTacToe.validations.gamevalidations.UniqueSymbolValidation;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Player winner;
    private GameState gameState;
    private int nextPlayerIndex;
    private List<Move> movesHistory;
    private List<WinningStrategyType> winningStrategyTypes;

    public Game(Builder builder) {
        this.board = new Board(builder.size);
        this.players = builder.players;
        this.winningStrategyTypes = builder.winningStrategyTypes;
        nextPlayerIndex = 0;
        gameState = GameState.IN_PROGRESS;
        movesHistory = new ArrayList<>();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMovesHistory() {
        return movesHistory;
    }

    public void setMovesHistory(List<Move> movesHistory) {
        this.movesHistory = movesHistory;
    }

    public List<WinningStrategyType> getWinningStrategies() {
        return winningStrategyTypes;
    }

    public void setWinningStrategies(List<WinningStrategyType> winningStrategies) {
        this.winningStrategyTypes = winningStrategies;
    }

    public void makeMove() {
        // Fetch player to make the move
        Player currentPlayer = players.get(nextPlayerIndex);
        nextPlayerIndex = (nextPlayerIndex + 1) % players.size(); // Turning the player. // change next player
        // Get the move by calling player.makeMove
        Move move = currentPlayer.makeMove(board);
        // Update the board with the move
        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setCellState(CellState.FILLED);
        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setSymbol(currentPlayer.getSymbol());
        // Store the move in movesHistory
        // check winner and update game state
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        public int size;
        private List<Player> players;
        private List<WinningStrategyType> winningStrategyTypes;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategyTypes(List<WinningStrategyType> winningStrategyTypes) {
            this.winningStrategyTypes = winningStrategyTypes;
            return this;
        }

        void validations() {
            UniqueSymbolValidation.validate(players);
        }

        public Game build() {
            // Validations
            // If player symbols are unique
            // 2 players min and only one Bot player allowed
            // Homework : create all validation class.
            return new Game(this);
        }
    }
}
