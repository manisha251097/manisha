import javax.swing.text.Position;

class Rock extends Piece {
    int row;
    int column;

    Rock(int r, int c){
        this.row=r;
        this.column=c;
   
    }
    String getPosition(){
        return "(" + this.row + "," + this.column + ")";
    }
    boolean isValidMove(Position newPosition) {

       if (super.isValidMove(newPosition.row , newPosition.column)){
            if(newPosition.column == this.column || newPosition.row == this.row) {
                return true;
            } else {
                System.out.println("Warning: rock can only move straight(left, right, forward, back");
                return false;
            }
            }else{
                System.out.println("you are running out of board");
                return false;
            }
    }
    void changeposition(Position p){
        this.row =p.row;
        this.column=p.column;

    }
    class Queen extends Piece{
        int row;
        int column;
        Queen (int r, int c){
            this.row=r;
            this.column=c;
        }
        boolean isValidMove(Position p){
            if(super.isValidMove(p.row,p.column)){
                if(p.column==this.column || p.row==this.row){
                    return true;
                }
                if(Math.abs(p.row-this.row==p.column-this.column)){//diagonal +ve +ve || -ve
                    return true;
                }
                System.out.println("Warning! queen cant't be moved to this position");
                return false;
                

            }else{
                System.out.println("is running out of the board");
                return false;
            }
        }
    }
        this.column=p.column;
    

}
}
final class chess{



}
