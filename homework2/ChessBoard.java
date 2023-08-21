
package homework2;

import java.util.ArrayList;

    public class ChessBoard {
        public static final ChessPiece EMPTY = null;
        private ArrayList<ChessPiece> pieces = new ArrayList<>();
        private ChessPiece chessBoard[][] = new ChessPiece[8][8];
        private static int chessBoardSize = 8;

        public ChessBoard(ArrayList<ChessPiece> pieces,ChessPiece chessBoard[][]){
            this.pieces = pieces;
            this.chessBoard=chessBoard;
        }

        public ChessBoard(ChessBoard other) {
            this.chessBoardSize = other.chessBoardSize;
            for(int i=0;i<chessBoardSize;i++){
                for(int j=0;j<chessBoardSize;j++){
                    this.chessBoard[i][j]=other.chessBoard[i][j];
                }
            }
        }
        ChessPiece get(int r, int c)
        {
            return chessBoard[r][c];
        }
        public double getChessBoardSize() {
            return chessBoardSize;
        }

        public String toString() {
            String st = "";
            for (int i = 0; i < chessBoardSize; i++) {
                for (int j = 0; j < chessBoardSize; j++) {
                    st += emptyBlocks(i,j);
                }
                st += "\n";
            }
            return st;
        }

        public String emptyBlocks(int row,int column){
            if (chessBoard[row][column]==EMPTY){
                return "# ";
            } else return (chessBoard[row][column].value+ " ");
        }
        public void puttingPieces(BoardPosition position, ChessPiece piece, ChessPiece chessBoard[][]){//Showing board that contains pieces
            chessBoard[position.getRow()][position.getColumn()] = piece;
        }
        public void addingPieces(ArrayList<ChessPiece> pieces){//I am filling ArrayList.
            for(int i=0;i<8;i++){
                pieces.add(new Pawn(new BoardPosition(6,i),PieceColor.WHITE));
            }
            for(int j=8;j<16;j++){
                pieces.add(new Pawn(new BoardPosition(1,j),PieceColor.BLACK));
            }
            pieces.add(new Bishop(new BoardPosition(7,2),PieceColor.WHITE));
            pieces.add(new Bishop(new BoardPosition(7,5),PieceColor.WHITE));
            pieces.add(new Bishop(new BoardPosition(0,2),PieceColor.BLACK));
            pieces.add(new Bishop(new BoardPosition(0,5),PieceColor.BLACK));
            pieces.add(new King(new BoardPosition(7,4),PieceColor.WHITE));
            pieces.add(new King(new BoardPosition(0,4),PieceColor.BLACK));
            pieces.add(new Knight(new BoardPosition(7,1),PieceColor.WHITE));
            pieces.add(new Knight(new BoardPosition(7,6),PieceColor.WHITE));
            pieces.add(new Knight(new BoardPosition(0,1),PieceColor.BLACK));
            pieces.add(new Knight(new BoardPosition(0,6),PieceColor.BLACK));
            pieces.add(new Queen(new BoardPosition(7,3),PieceColor.WHITE));
            pieces.add(new Queen(new BoardPosition(0,3),PieceColor.BLACK));
            pieces.add(new Rook(new BoardPosition(7,0),PieceColor.WHITE));
            pieces.add(new Rook(new BoardPosition(7,7),PieceColor.WHITE));
            pieces.add(new Rook(new BoardPosition(0,0),PieceColor.BLACK));
            pieces.add(new Rook(new BoardPosition(0,7),PieceColor.BLACK));
        }
        public void putThePieces(ChessBoard board,ArrayList<ChessPiece> pieces,ChessPiece[][] chessBoard){//Iam putting pieces on the board as a piece types.
            board.puttingPieces(new BoardPosition(6,0), pieces.get(0),chessBoard);
            board.puttingPieces(new BoardPosition(6,1), pieces.get(1),chessBoard);
            board.puttingPieces(new BoardPosition(6,2), pieces.get(2),chessBoard);
            board.puttingPieces(new BoardPosition(6,3), pieces.get(3),chessBoard);
            board.puttingPieces(new BoardPosition(6,4), pieces.get(4),chessBoard);
            board.puttingPieces(new BoardPosition(6,5), pieces.get(5),chessBoard);
            board.puttingPieces(new BoardPosition(6,6), pieces.get(6),chessBoard);
            board.puttingPieces(new BoardPosition(6,7), pieces.get(7),chessBoard);
            board.puttingPieces(new BoardPosition(1,0), pieces.get(8),chessBoard);
            board.puttingPieces(new BoardPosition(1,1), pieces.get(9),chessBoard);
            board.puttingPieces(new BoardPosition(1,2), pieces.get(10),chessBoard);
            board.puttingPieces(new BoardPosition(1,3), pieces.get(11),chessBoard);
            board.puttingPieces(new BoardPosition(1,4), pieces.get(12),chessBoard);
            board.puttingPieces(new BoardPosition(1,5), pieces.get(13),chessBoard);
            board.puttingPieces(new BoardPosition(1,6), pieces.get(14),chessBoard);
            board.puttingPieces(new BoardPosition(1,7), pieces.get(15),chessBoard);
            board.puttingPieces(new BoardPosition(7,2), pieces.get(16),chessBoard);
            board.puttingPieces(new BoardPosition(7,5), pieces.get(17),chessBoard);
            board.puttingPieces(new BoardPosition(0,2), pieces.get(18),chessBoard);
            board.puttingPieces(new BoardPosition(0,5), pieces.get(19),chessBoard);
            board.puttingPieces(new BoardPosition(7,4), pieces.get(20),chessBoard);
            board.puttingPieces(new BoardPosition(0,4), pieces.get(21),chessBoard);
            board.puttingPieces(new BoardPosition(7,1), pieces.get(22),chessBoard);
            board.puttingPieces(new BoardPosition(7,6), pieces.get(23),chessBoard);
            board.puttingPieces(new BoardPosition(0,1), pieces.get(24),chessBoard);
            board.puttingPieces(new BoardPosition(0,6), pieces.get(25),chessBoard);
            board.puttingPieces(new BoardPosition(7,3), pieces.get(26),chessBoard);
            board.puttingPieces(new BoardPosition(0,3), pieces.get(27),chessBoard);
            board.puttingPieces(new BoardPosition(7,0), pieces.get(28),chessBoard);
            board.puttingPieces(new BoardPosition(7,7), pieces.get(29),chessBoard);
            board.puttingPieces(new BoardPosition(0,0), pieces.get(30),chessBoard);
            board.puttingPieces(new BoardPosition(0,7), pieces.get(31),chessBoard);
        }
        public int materialAdvantage(PieceColor color){
            int totalW=0;
            int totalB=0;
            for(int i=0;i<pieces.size();i++){
                if(pieces.get(i).pieceColor==PieceColor.WHITE)
                    totalW+=pieces.get(i).value;
                if(pieces.get(i).pieceColor==PieceColor.BLACK)
                    totalB+=pieces.get(i).value;
            }
            if(color==PieceColor.WHITE)
                return totalW-totalB;
            return totalB-totalW;
        }
        public int attackedBy(BoardPosition p,PieceColor c,ChessBoard board){
            int count=0;
            for(int i=0;i<pieces.size();i++){
                if((pieces.get(i).pieceColor==c)&&(pieces.get(i).canMove(p,board))){
                    count++;
                }
            }
            return count;
        }
        public int safety(ChessPiece piece,ChessBoard board){
            int total=0;
            int total1=0;
            int difference=0;
            for(int i=0;i<pieces.size();i++){
                if(piece.pieceColor==PieceColor.WHITE&&pieces.get(i).canMove(piece.position,board)){
                    if(pieces.get(i).pieceColor==PieceColor.WHITE){
                        total+=pieces.get(i).value;
                    }
                    if(pieces.get(i).pieceColor==PieceColor.BLACK){
                        total1+=pieces.get(i).value;
                    }
                }
                if(piece.pieceColor==PieceColor.BLACK&&pieces.get(i).canMove(piece.position,board)){
                    if(pieces.get(i).pieceColor==PieceColor.WHITE){
                        total+=pieces.get(i).value;
                    }
                    if(pieces.get(i).pieceColor==PieceColor.BLACK){
                        total1+=pieces.get(i).value;
                    }
                }
            }
            return Math.abs(total-total1);
        }
        public int centralControl(PieceColor color,ChessBoard board){
            int count=0;
            for(int i=0;i<pieces.size();i++){
                if(pieces.get(i).pieceColor==color){
                    if(pieces.get(i).canMove(new BoardPosition(3,3),board)
                            ||pieces.get(i).canMove(new BoardPosition(3,4),board)||
                            pieces.get(i).canMove(new BoardPosition(4,3),board)||
                            pieces.get(i).canMove(new BoardPosition(4,4),board)){
                        count++;
                    }
                }
            }
            return count;
        }
    }
