package chapter7;

public class KnightTour {
    private int[][] board = new int[8][8];
    private int currentRow;
    private int currentColumn;
    private int count = 2;

    public KnightTour(){
        board[0][0] =1;
    }

    public void displayBoard(){
        for(int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col]+ "  ");
            }
            System.out.println();
        }
    }

    public boolean moveKnight(int[] horizontal, int[] vertical){
 
        for(int moveNumber = 0; moveNumber<8; moveNumber++){

            currentColumn = currentColumn + horizontal[moveNumber];
            currentRow = currentRow + vertical[moveNumber];
            if(check() && checkForNull()){
                board[currentRow][currentColumn] = count;
                count++;
            }
            else{
                return false;
            }

        }
        return false;
    }

    public boolean check(){
        if((currentColumn >= 0 && currentColumn <= 7)&& (currentRow >= 0 && currentRow <= 7)){
            return true;
        }
        return false;
    }

    public boolean checkForNull(){
        if(board[currentRow][currentColumn] == 0){
            return true;
        }
        return false;
    }
}
