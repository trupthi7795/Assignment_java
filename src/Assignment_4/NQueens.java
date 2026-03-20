package Assignment_4;
// LeetCode 51 - N Queens
import java.util.*;

class NQueens {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for(char[] row : board)
            Arrays.fill(row,'.');

        solve(0,board,result);
        return result;
    }

    private void solve(int col,char[][] board,List<List<String>> result){

        if(col == board.length){
            result.add(construct(board));
            return;
        }

        for(int row=0;row<board.length;row++){

            if(isSafe(board,row,col)){
                board[row][col]='Q';
                solve(col+1,board,result);
                board[row][col]='.';
            }
        }
    }

    private boolean isSafe(char[][] board,int r,int c){

        for(int i=0;i<c;i++)
            if(board[r][i]=='Q') return false;

        for(int i=r,j=c;i>=0 && j>=0;i--,j--)
            if(board[i][j]=='Q') return false;

        for(int i=r,j=c;i<board.length && j>=0;i++,j--)
            if(board[i][j]=='Q') return false;

        return true;
    }

    private List<String> construct(char[][] board){
        List<String> list = new ArrayList<>();
        for(char[] row : board)
            list.add(new String(row));
        return list;
    }
}
