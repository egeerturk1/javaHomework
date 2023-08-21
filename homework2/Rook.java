package homework2;
public class Rook extends ChessPiece{
    public Rook(BoardPosition position,PieceColor pieceColor){
        super(position, pieceColor,5);
    }
    @Override
    public boolean canMove(BoardPosition target,ChessBoard board){
        if(position.getRow()!=target.getRow()&&position.getColumn()!=target.getColumn())
            return false;
        if(board.get(position.getRow(),position.getColumn()).pieceColor==PieceColor.WHITE){
            if(position.getRow()==target.getRow()&&position.getColumn()<target.getColumn()){
                for(int i=position.getColumn()+1;i<target.getColumn();i++){
                    if(board.get(position.getRow(),i)!=ChessBoard.EMPTY)
                        return false;
                    if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                        if (board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.WHITE)
                            return false;
                    }
                }
            }
            if(position.getRow()==target.getRow()&&position.getColumn()>target.getColumn()){
                for(int i=position.getColumn()-1;i>target.getColumn();i--){
                    if(board.get(position.getRow(),i)!=ChessBoard.EMPTY)
                        return false;
                    if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                        if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.WHITE)
                            return false;
                    }
                }
            }
            if(position.getColumn()==target.getColumn()&&position.getRow()<target.getRow()){
                for(int i=position.getRow()+1;i< target.getRow();i++){
                    if(board.get(i,position.getColumn())!=ChessBoard.EMPTY)
                        return false;
                    if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                        if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.WHITE)
                            return false;
                    }
                }
            }
            if(position.getColumn()==target.getColumn()&&position.getRow()>target.getRow()){
                for(int i=position.getRow()-1;i<target.getRow();i--){
                    if(board.get(i,position.getColumn())!=ChessBoard.EMPTY)
                        return false;
                    if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                        if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.WHITE)
                            return false;
                    }
                }
            }
        }
        if(board.get(position.getRow(),position.getColumn()).pieceColor==PieceColor.BLACK){
            if(position.getRow()==target.getRow()&&position.getColumn()<target.getColumn()){
                for(int i=position.getColumn()+1;i<target.getColumn();i++){
                    if(board.get(position.getRow(),i)!=ChessBoard.EMPTY)
                        return false;
                    if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                        if (board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.BLACK)
                            return false;
                    }
                }
            }
            if(position.getRow()==target.getRow()&&position.getColumn()>target.getColumn()){
                for(int i=position.getColumn()-1;i>target.getColumn();i--){
                    if(board.get(position.getRow(),i)!=ChessBoard.EMPTY)
                        return false;
                    if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                        if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.BLACK)
                            return false;
                    }
                }
            }
            if(position.getColumn()==target.getColumn()&&position.getRow()<target.getRow()){
                for(int i=position.getRow()+1;i< target.getRow();i++){
                    if(board.get(i,position.getColumn())!=ChessBoard.EMPTY)
                        return false;
                    if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                        if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.BLACK)
                            return false;
                    }
                }
            }
            if(position.getColumn()==target.getColumn()&&position.getRow()>target.getRow()){
                for(int i=position.getRow()-1;i<target.getRow();i--){
                    if(board.get(i,position.getColumn())!=ChessBoard.EMPTY)
                        return false;
                    if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                        if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.BLACK)
                            return false;
                    }
                }
            }
        }
        return true;
    }
    @Override
    public String toString() {
        return "Rook:"+
                "Position of Rook=" + position +"\n"+
                "Color of Rook=" + pieceColor +"\n"+
                "Value of Rook=" + value;
    }
}
