class TicTacToe {
    private char[][] grid = new char[3][3];
    private boolean xTurn = true;

    void printGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == 0)
                    IO.print("_ ");
                else
                    IO.print(grid[i][j]);
            }
            IO.println();
            IO.println();
        }
    }

    boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            // verificação de linhas
            if (grid[i][0] == p && grid[i][1] == p && grid[i][2] == p) {
                IO.println("1");
                return true;
            }
            // verificação de colunas
            if (grid[0][i] == p && grid[1][i] == p && grid[2][i] == p) {
                IO.println("2");
                return true;
            }
        }
        // verificação da diagonal principal
        if (grid[0][0] == p && grid[1][1] == p && grid[2][2] == p) {
            IO.println("3");
            return true;
        }
        // verificação da diagonal secundária
        if (grid[0][2] == p && grid[1][1] == p && grid[2][0] == p) {
            IO.println("4");
            return true;
        }
        return false;
    }

    void play(String s) {
        int x = s.charAt(0) - '0';
        int y = s.charAt(2) - '0';

        if (xTurn)
            grid[x][y] = 1;
        else
            grid[x][y] = 2;
        xTurn = !xTurn;
    }
}
