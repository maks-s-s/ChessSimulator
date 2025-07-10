public class Pawn extends Piece implements Promotable{
    @Override
    public boolean isValidMove(Board board, Square to) {
        return behavior.isValidMove(board, this, to);
    }

    @Override
    public void promote() {

    }
}
