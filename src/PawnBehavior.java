public class PawnBehavior extends PieceBehavior{
    @Override
    public boolean isValidMove(Board board, Piece piece, Square to) {
        return false;
    }
}
