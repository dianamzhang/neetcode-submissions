class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            Set<Character> rows = new HashSet<>();
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;
                if (rows.contains(board[r][c])) {
                    return false;
                }
                rows.add(board[r][c]);
            }
        }

        for (int c = 0; c < 9; c++) {
            Set<Character> cols = new HashSet<>();
            for (int r = 0; r < 9; r++) {
                if (board[r][c] == '.') continue;
                if (cols.contains(board[r][c])) {
                    return false;
                }
                cols.add(board[r][c]);
            }
        }

        for (int square = 0; square < 9; square++) {
            Set<Character> squares = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') {
                        continue;
                    }
                    if (squares.contains(board[row][col])) {
                        return false;
                    }
                    squares.add(board[row][col]);
                }
            }
        }
        return true;
    }
}