class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Fill the board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backTrack(0, board, result, n);
        return result;
    }

    private void backTrack(int col, char[][] board, List<List<String>> result, int n) {

        // Base case: all queens are placed
        if (col == n) {
            result.add(construct(board));
            return;
        }

        // Try placing queen in every row
        for (int row = 0; row < n; row++) {

            if (isValid(board, row, col, n)) {
                board[row][col] = 'Q';

                backTrack(col + 1, board, result, n);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    private boolean isValid(char[][] board, int row, int col, int n) {

        // Check left side of current row
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Check lower-left diagonal
        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> temp = new ArrayList<>();

        for (char[] row : board) {
            temp.add(new String(row));
        }

        return temp;
    }
}