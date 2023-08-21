package homework2;
public class Pawn extends ChessPiece{
    public Pawn(BoardPosition position, PieceColor pieceColor){
        super(position, pieceColor,1);
    }
    @Override
    public boolean canMove(BoardPosition target,ChessBoard board){
        if(board.get(position.getRow(),position.getColumn()).pieceColor==PieceColor.WHITE){
            if(board.get(target.getRow(),target.getColumn())==ChessBoard.EMPTY&&position.getColumn()==target.getColumn()
                    &&position.getRow()-target.getRow()==1)
                return true;
            if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY&&board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.BLACK
                    &&position.getRow()-target.getRow()==1&&(target.getColumn()==position.getColumn()-1||target.getColumn()==position.getColumn()+1))
                return true;

        }
        if(board.get(position.getRow(),position.getColumn()).pieceColor==PieceColor.BLACK){
            if(board.get(target.getRow(),target.getColumn())==ChessBoard.EMPTY&&position.getColumn()==target.getColumn()
                    &&position.getRow()-target.getRow()==-1)
                return true;
            if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY&&board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.WHITE
                    &&position.getRow()-target.getRow()==-1&&(target.getColumn()== position.getColumn()-1||target.getColumn()== position.getColumn()+1))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pawn:"+
                "Position of Pawn=" + position +"\n"+
                "Color of Pawn=" + pieceColor +"\n"+
                "Value of Pawn=" + value;
    }
}
