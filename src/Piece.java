public abstract class Piece {
    private PieceType pieceType;
    private Square position;
    private Color color;
    protected PieceBehavior behavior;

    // Checks if the move from the current position to the destination is valid
    public abstract boolean isValidMove(Board board, Square to);

    // Returns the color of the piece
    public Color getColor() {return null;}

    // Returns the current position of the piece
    public Square getPosition() {return null;}

    // Sets the position of the piece (after moving)
    public void setPosition(Square position) {}

    // Returns the piece type
    public PieceType getPieceType() {return null;}
}
