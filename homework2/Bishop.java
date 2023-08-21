package homework2;
public class Bishop extends ChessPiece{
    public Bishop(BoardPosition position, PieceColor pieceColor){
        super(position, pieceColor,3);
    }
    @Override
    public boolean canMove(BoardPosition target, ChessBoard board){
        if(Math.abs(position.getRow()- target.getRow())!=Math.abs(position.getColumn()-target.getColumn()))
            return false;
        if(board.get(position.getRow(),position.getColumn()).pieceColor==PieceColor.WHITE){
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
                for(int i=position.getRow()-1;i> target.getRow();i--){
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
        if(board.get(target.getRow(), target.getColumn())!=ChessBoard.EMPTY){
            if(board.get(target.getRow(),target.getColumn()).pieceColor==pieceColor)
                return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return "Bishop:"+
                "Position of Bishop=" + position +"\n"+
                "Color of Bishop=" + pieceColor +"\n"+
                "Value of Bishop=" + value;
    }
}
