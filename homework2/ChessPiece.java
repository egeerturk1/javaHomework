package homework2;

public abstract class ChessPiece {
    protected BoardPosition position;
    protected PieceColor pieceColor;
    public int value;
    public ChessPiece(BoardPosition position,PieceColor pieceColor,int value){
        this.position = position;
        this.pieceColor = pieceColor;
        this.value = value;
    }
    public PieceColor getPieceColor(){return pieceColor;}
    public BoardPosition getPosition(){
        return position;
    }
    public abstract boolean canMove(BoardPosition target,ChessBoard board);
    public abstract String toString();
}
