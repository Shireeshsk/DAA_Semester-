import java.util.*;
public class Nqueen {
    public static boolean isSafe(char board[][],int row,int col){
        //vertically up 
        for(int i = row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonally up
        for(int i = row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //right diagonally up 
        for(int i = row-1,j=col+1;j<board.length && i>=0;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][], int row){
        if(row==board.length){
            printboard(board);
            System.out.println();
            return;
        }
        for(int j = 0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = '.';
            }
        } 
    }

    public static void printboard(char board[][]){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
        sc.close();
    }
}
