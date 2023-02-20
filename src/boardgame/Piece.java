package boardgame;

public class Piece {
    
    protected Position position;
    private Board board;

    public Piece() {
    }

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    public Position getPosition() {
        return position;
    }

    protected Board getBoard() {
        return board;
    }

}
