public class Rook extends Piece {
    @Override
    public boolean isValidMove(Board board, Square to) {
        return behavior.isValidMove(board, this, to);
    }
}
