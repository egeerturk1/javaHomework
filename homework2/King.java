package homework2;
public class King extends ChessPiece{
    public King(BoardPosition position, PieceColor pieceColor){
        super(position, pieceColor,100);
    }
    @Override
    public boolean canMove(BoardPosition target,ChessBoard board){
        if(board.get(position.getRow(),position.getColumn()).pieceColor==PieceColor.WHITE){
            if(board.get(target.getRow(),target.getColumn())==ChessBoard.EMPTY&&((position.getColumn()==target.getColumn()
                    &&Math.abs(position.getRow()-target.getRow())==1)||(target.getRow()==position.getRow()+1&&(target.getColumn()== position.getColumn()+1||target.getColumn()==position.getColumn()-1))
                    ||target.getRow()== position.getRow()-1&&(target.getColumn()== position.getColumn()+1||target.getColumn()==position.getColumn()-1)||(position.getRow()==target.getRow()&&Math.abs(position.getColumn()-target.getColumn())==1))){
                return true;
            }
            if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY&&board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.BLACK){
                if(((position.getColumn()==target.getColumn()
                        &&Math.abs(position.getRow()-target.getRow())==1)||(target.getRow()==position.getRow()+1&&(target.getColumn()== position.getColumn()+1||target.getColumn()==position.getColumn()-1))
                        ||target.getRow()== position.getRow()-1&&(target.getColumn()== position.getColumn()+1||target.getColumn()==position.getColumn()-1)||(position.getRow()==target.getRow()&&Math.abs(position.getColumn()-target.getColumn())==1))){
                    return true;
                }
            }
        }
        if(board.get(position.getRow(), position.getColumn()).pieceColor==PieceColor.BLACK) {
            if (board.get(target.getRow(), target.getColumn()) == ChessBoard.EMPTY && ((position.getColumn() == target.getColumn()
                    && Math.abs(position.getRow() - target.getRow()) == 1) || (target.getRow() == position.getRow() + 1 && (target.getColumn() == position.getColumn() + 1 || target.getColumn() == position.getColumn() - 1))
                    || target.getRow() == position.getRow() - 1 && (target.getColumn() == position.getColumn() + 1 || target.getColumn() == position.getColumn() - 1)||(position.getRow()==target.getRow()&&Math.abs(position.getColumn()-target.getColumn())==1))) {
                return true;
            }
            if (board.get(target.getRow(), target.getColumn()) != ChessBoard.EMPTY && board.get(target.getRow(), target.getColumn()).pieceColor == PieceColor.WHITE) {
                if (((position.getColumn() == target.getColumn()
                        && Math.abs(position.getRow() - target.getRow()) == 1) || (target.getRow() == position.getRow() + 1 && (target.getColumn() == position.getColumn() + 1 || target.getColumn() == position.getColumn() - 1))
                        || target.getRow() == position.getRow() - 1 && (target.getColumn() == position.getColumn() + 1 || target.getColumn() == position.getColumn() - 1)||(position.getRow()==target.getRow()&&Math.abs(position.getColumn()-target.getColumn())==1))) {
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return "King:"+
                "Position of King=" + position +"\n"+
                "Color of King=" + pieceColor +"\n"+
                "Value of King=" + value;
    }
}
