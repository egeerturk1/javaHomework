package homework2;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ArrayList<ChessPiece> pieces=new ArrayList<>();
        ChessPiece[][] chessBoard=new ChessPiece[8][8];
        ChessBoard board=new ChessBoard(pieces,chessBoard);
        board.addingPieces(pieces);
        board.putThePieces(board,pieces,chessBoard);
        System.out.println("CHESS BOARD INITIAL:");
        System.out.println(board);//Values of pieces show places of pieces on the board.
        System.out.println(pieces.get(5));
        System.out.println("---------------");
        ArrayList<ChessPiece> pieces1=new ArrayList<>();
        ChessPiece[][] chessBoard1=new ChessPiece[8][8];
        ChessBoard board1=new ChessBoard(pieces1,chessBoard1);
        pieces1.add(new Bishop(new BoardPosition(6,1),PieceColor.WHITE));
        pieces1.add(new Bishop(new BoardPosition(7,0),PieceColor.WHITE));
        pieces1.add(new Bishop(new BoardPosition(2,5),PieceColor.BLACK));
        pieces1.add(new Bishop(new BoardPosition(3,0),PieceColor.BLACK));
        pieces1.add(new King(new BoardPosition(7,4),PieceColor.WHITE));
        pieces1.add(new Pawn(new BoardPosition(6,2),PieceColor.WHITE));
        pieces1.add(new Knight(new BoardPosition(6,4),PieceColor.WHITE));
        pieces1.add(new Pawn(new BoardPosition(3,2),PieceColor.BLACK));
        pieces1.add(new King(new BoardPosition(1,4),PieceColor.BLACK));
        pieces1.add(new Knight(new BoardPosition(4,5),PieceColor.BLACK));
        pieces1.add(new Rook(new BoardPosition(5,0),PieceColor.WHITE));
        pieces1.add(new Queen(new BoardPosition(6,6),PieceColor.WHITE));
        pieces1.add(new Rook(new BoardPosition(1,2),PieceColor.BLACK));
        board1.puttingPieces(new BoardPosition(6,1),pieces1.get(0),chessBoard1);
        board1.puttingPieces(new BoardPosition(7,0),pieces1.get(1),chessBoard1);
        board1.puttingPieces(new BoardPosition(2,5),pieces1.get(2),chessBoard1);
        board1.puttingPieces(new BoardPosition(3,0),pieces1.get(3),chessBoard1);
        board1.puttingPieces(new BoardPosition(7,4),pieces1.get(4),chessBoard1);
        board1.puttingPieces(new BoardPosition(6,2),pieces1.get(5),chessBoard1);
        board1.puttingPieces(new BoardPosition(6,4),pieces1.get(6),chessBoard1);
        board1.puttingPieces(new BoardPosition(3,2),pieces1.get(7),chessBoard1);
        board1.puttingPieces(new BoardPosition(1,4),pieces1.get(8),chessBoard1);
        board1.puttingPieces(new BoardPosition(4,5),pieces1.get(9),chessBoard1);
        board1.puttingPieces(new BoardPosition(5,0),pieces1.get(10),chessBoard1);
        board1.puttingPieces(new BoardPosition(6,6),pieces1.get(11),chessBoard1);
        board1.puttingPieces(new BoardPosition(1,2),pieces1.get(12),chessBoard1);
        System.out.println("NEW CHESS BOARD:");
        System.out.println(board1);
        System.out.println("Material Advantage of Black Pieces:");
        System.out.println(" "+board1.materialAdvantage(PieceColor.BLACK));
        System.out.println("Can pieces1.get(0) move to the (5,2)?");
        if(pieces1.get(0).canMove(new BoardPosition(5,2),board1))
            System.out.println("YES");
        else System.out.println("NO");
        System.out.println("Number of Pieces of The Given Color That Can Move To The (5,2) in One Move:");
        System.out.println(board1.attackedBy(new BoardPosition(5,2),PieceColor.WHITE,board1));
        ChessPiece piece=new Pawn(new BoardPosition(5,2),PieceColor.WHITE);
        System.out.println("Calculation of safety of White piece(5,2):");
        System.out.println(board1.safety(piece,board1));
        System.out.println("The Number of Pieces of The Given Color That Can Move One of The Central Squares On The Board:");
        System.out.println(board1.centralControl(PieceColor.WHITE,board1));
    }
}
