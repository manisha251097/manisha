class Game {
    Piece [][] board;
    // Constructor creates an empty board
    Game() {
        board = new Piece[8][8];
    }
}

class Position {
    int row;
    int column;
        // Constructor using row and column values
    Position(int r, int c) {
        this.row = r;
        this.column = c;
    }
public String tostring(){
    return "(" + this.row + "," + this.column + ")";
}
}

class Piece {
    Position position;

    boolean isValidMove(int row,int column) {
    
        if(row>=0 && column>=0 && row<8 && column<8) {
            return true;
        } else {
            return false;
        }
    }

}

      
final class UtilityClass {
    public static void main(String[] args) {

        Rock rock1= new Rock(0,0);
        // Rock rock2= new Rock(0, 7);
        System.out.println("current position"+ "(" + rock1.row + "," + rock1.column+ ")");

        Position newPosForR1= new Position(100,100);

        if(rock1.isValidMove(newPosForR1)){
            System.out.println("can be moved to"+ newPosForR1.toString());
            rock1.changeposition(newPosForR1);
        }else{
            System.out.println("cant be moved to "+ newPosForR1.toString());

        System.out.println("current position"+ "(" + rock1.row + "," + rock1.column+ ")");
    }
}

                
                                                

