package TicTacToe.models;

import TicTacToe.strategies.WinningStrategies.WinningStrategy;
import TicTacToe.strategies.WinningStrategies.WinningStrategyFactory;
import TicTacToe.validations.gamevalidations.BotCountValidation;
import TicTacToe.validations.gamevalidations.PlayerCountValidation;
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
    private List<WinningStrategy> winningStrategies;

    public Game(Builder builder) {
        this.board = new Board(builder.size);
        this.players = builder.players;
        this.winningStrategyTypes = builder.winningStrategyTypes;
        this.winningStrategies = new ArrayList<>();
        winningStrategyTypes.forEach(type -> {
            winningStrategies.add(WinningStrategyFactory.getStrategy(type));
        });
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

    public void undo() {
        // We need to revert all the steps done to make a move.
        if (movesHistory.size() == 0) {
            throw new RuntimeException("No moves to undo");
        }
        // 1. Rollback the nextPlayerIndex
        //(A-B)%N -> (A-B+N)%N
        nextPlayerIndex = (nextPlayerIndex - 1 + players.size())%players.size();
        // 2. Get move from history
        Move move = movesHistory.removeLast();
        // 3. revert the move from the board - update the cells
        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setCellState(CellState.EMTPY);
        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setSymbol(null);
        // 4. Revert the strategy count map
        for (WinningStrategy strategy : winningStrategies) {
            strategy.handleUndo(move);
        }
        // 5. Set the winner to null
        setWinner(null);
        // 6. Set the gameState to IN_PROGRESS
        setGameState(GameState.IN_PROGRESS);
    }

    public boolean checkWinner(Move move) {
        for (WinningStrategy strategy : winningStrategies) {
            if (strategy.checkWinner(board, move)){
                return true;
            }
        }
        return false;
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
        movesHistory.add(move);
        // check winner and update game state
        if (checkWinner(move)) {
            setWinner(currentPlayer);
            setGameState(GameState.SUCCESS);
        } else if (movesHistory.size() == board.getSize() * board.getSize()) {
            setWinner(null);
            setGameState(GameState.DRAW);
        }
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
            PlayerCountValidation.validate(players);
            BotCountValidation.validate(players);
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
