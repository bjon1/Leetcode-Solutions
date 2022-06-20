/* #36 Valid Sudoku

        Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

        Each row must contain the digits 1-9 without repetition.
        Each column must contain the digits 1-9 without repetition.
        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
        Note:

        A Sudoku board (partially filled) could be valid but is not necessarily solvable.
        Only the filled cells need to be validated according to the mentioned rules.
*/
import java.util.HashSet;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    //add() is a method that returns true if a value was successfully added
                    if(!seen.add(board[i][j] + "in row" + i) || 
                       !seen.add(board[i][j] + "in column" + j) || 
                       !seen.add(board[i][j] + "in sub-square" + i/3 + " row and " + j/3 + " col")){
                        return false;
                    }
                }
            }
        }
        return true;       
    }
}