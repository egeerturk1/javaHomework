package homework2;
public class Queen extends ChessPiece{
    public Queen(BoardPosition position, PieceColor pieceColor){
        super(position, pieceColor,9);
    }
    @Override
    public boolean canMove(BoardPosition target,ChessBoard board){
        if((position.getRow()!=target.getRow()&&position.getColumn()!=target.getColumn())
                &&(Math.abs(position.getRow()- target.getRow())!=Math.abs(position.getColumn()-target.getColumn())))
            return false;
        if((Math.abs(position.getRow()-target.getRow())==Math.abs(position.getColumn()-target.getColumn()))){
            if(board.get(position.getRow(), position.getColumn()).pieceColor==PieceColor.WHITE){
                if(target.getRow()>position.getRow()&&target.getColumn()>position.getColumn()){
                    int j= position.getColumn()+1;
                    for(int i=position.getRow()+1;i<target.getRow();i++){
                        if(board.get(i,j)!=ChessBoard.EMPTY)
                            return false;
                        if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                            if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.WHITE)
                                return false;
                        }
                        j++;
                    }
                }
                if(target.getRow()>position.getRow()&&target.getColumn()<position.getColumn()){
                    int j= position.getColumn()-1;
                    for(int i=position.getRow()+1;i<target.getRow();i++){
                        if(board.get(i,j)!=ChessBoard.EMPTY)
                            return false;
                        if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY) {
                            if (board.get(target.getRow(), target.getColumn()).pieceColor == PieceColor.WHITE)
                                return false;
                        }
                        j--;
                    }
                }
                if(target.getRow()<position.getRow()&&target.getColumn()<position.getColumn()){
                    int j=position.getColumn()-1;
                    for(int i=position.getRow()-1;i>target.getRow();i--){
                        if(board.get(i,j)!=ChessBoard.EMPTY)
                            return false;
                        if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                            if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.WHITE)
                                return false;
                        }
                        j--;
                    }
                }
                if(target.getRow()<position.getRow()&&target.getColumn()>position.getColumn()){
                    int j=position.getColumn()+1;
                    for(int i=position.getRow()-1;i>target.getRow();i--){
                        if(board.get(i,j)!=ChessBoard.EMPTY)
                            return false;
                        if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY)
                            if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.WHITE)
                                return false;
                        j++;
                    }
                }
            }
            if(board.get(position.getRow(),position.getColumn()).pieceColor==PieceColor.BLACK){
                if(target.getRow()>position.getRow()&&target.getColumn()>position.getColumn()){
                    int j= position.getColumn()+1;
                    for(int i=position.getRow()+1;i<target.getRow();i++){
                        if(board.get(i,j)!=ChessBoard.EMPTY)
                            return false;
                        if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                            if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.BLACK)
                                return false;
                        }
                        j++;
                    }
                }
                if(target.getRow()>position.getRow()&&target.getColumn()<position.getColumn()){
                    int j= position.getColumn()-1;
                    for(int i=position.getRow()+1;i<target.getRow();i++){
                        if(board.get(i,j)!=ChessBoard.EMPTY)
                            return false;
                        if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY) {
                            if (board.get(target.getRow(), target.getColumn()).pieceColor == PieceColor.BLACK)
                                return false;
                        }
                        j--;
                    }
                }
                if(target.getRow()<position.getRow()&&target.getColumn()<position.getColumn()){
                    int j=position.getColumn()-1;
                    for(int i=position.getRow()-1;i> target.getRow();i--){
                        if(board.get(i,j)!=ChessBoard.EMPTY)
                            return false;
                        if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY){
                            if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.BLACK)
                                return false;
                        }
                        j--;
                    }
                }
                if(target.getRow()<position.getRow()&&target.getColumn()>position.getColumn()){
                    int j=position.getColumn()+1;
                    for(int i=position.getRow()-1;i>target.getRow();i--){
                        if(board.get(i,j)!=ChessBoard.EMPTY)
                            return false;
                        if(board.get(target.getRow(),target.getColumn())!=ChessBoard.EMPTY)
                            if(board.get(target.getRow(),target.getColumn()).pieceColor==PieceColor.BLACK)
                                return false;
                        j++;
                    }
                }
            }
        }
        if(position.getRow()==target.getRow()||position.getColumn()==target.getColumn()){
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
        }
        if(board.get(target.getRow(), target.getColumn())!=ChessBoard.EMPTY){
            if(board.get(target.getRow(),target.getColumn()).pieceColor==pieceColor)
                return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Queen:"+
                "Position of Queen=" + position +"\n"+
                "Color of Queen=" + pieceColor +"\n"+
                "Value of Queen=" + value;
    }
}
