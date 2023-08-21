package homework2;
public class Knight extends ChessPiece{
    public Knight(BoardPosition position, PieceColor pieceColor){
        super(position, pieceColor,3);
    }
    @Override
    public boolean canMove(BoardPosition target,ChessBoard board){
        if(board.get(position.getRow(),position.getColumn()).pieceColor==PieceColor.WHITE){
            if(board.get(target.getRow(),target.getColumn())==ChessBoard.EMPTY
                    &&((Math.abs(position.getRow()-target.getRow())==2)&&(Math.abs(target.getColumn()-position.getColumn())==1))
                    ||((Math.abs(position.getColumn()-target.getColumn())==2)&&(Math.abs(target.getRow()-position.getRow())==1)))
                return true;
            if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY
                    &&board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.BLACK
                    &&((Math.abs(position.getRow()-target.getRow())==2)&&(Math.abs(target.getColumn()-position.getColumn())==1))
                    ||((Math.abs(position.getColumn()-target.getColumn())==2)&&(Math.abs(target.getRow()-position.getRow())==1)))
                return true;
        }
        if(board.get(position.getRow(),position.getColumn()).pieceColor==PieceColor.BLACK) {
            if (board.get(target.getRow(),target.getColumn()) == ChessBoard.EMPTY
                    &&((Math.abs(position.getRow()-target.getRow())==2)&&(Math.abs(target.getColumn()-position.getColumn())==1))
                    ||((Math.abs(position.getColumn()-target.getColumn())==2)&&(Math.abs(target.getRow()-position.getRow())==1)))
                return true;
            if (board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY
                    &&board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.WHITE
                    &&((Math.abs(position.getRow()-target.getRow())==2)&&(Math.abs(target.getColumn()-position.getColumn())==1))
                    ||((Math.abs(position.getColumn()-target.getColumn())==2)&&(Math.abs(target.getRow()-position.getRow())==1)))
                return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Knight:"+
                "Position of Knight=" + position +"\n"+
                "Color of Knight=" + pieceColor +"\n"+
                "Value of Knight=" + value;
    }
}
