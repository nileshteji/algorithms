
public class SelfSolution {

    static boolean isSafe(int[][] board, int row, int col) {

        // checking the left column
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        // checking the upper value of the columns
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // in the left diagonal the value of the both row and column decreases
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static boolean solveNQ(int[][] board, int col) {

        if (col == board.length) {
            for (int[] array : board) {
                for (int a : array) {
                    System.out.print(a);
                }
                System.out.println();
            }

            return true;
        }

        // In this we will be putting the queen on different row so if see we cannot put
        // anywhe
        // In this i is the row of the board
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solveNQ(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        // this is the board which we will be using for the problem solving;
        int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        solveNQ(board, 0);

    }

}