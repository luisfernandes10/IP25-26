void printGame(char[][] game) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            IO.print(game[i][j]);
            IO.print(" | ");
        }
        IO.println("\n-----------");
    }
}

char[] askCoords(char turn) {
    char[] play = new char[2];

    play[0] = (char) Integer.parseInt(IO.readln(turn + " linha: "));
    play[1] = (char) Integer.parseInt(IO.readln(turn + " coluna: "));

    return play;
}

void fillGame(char[][] game, char[] coords, char turn) {
    game[coords[0]][coords[1]] = turn;
}

boolean checkWinner(char[][] game, char turn) {
    for (int i = 0; i < 3; i++) {
        // verificação de linhas
        if (game[i][0] == turn && game[i][1] == turn && game[i][2] == turn)
            return true;
        // verificação de colunas
        if (game[0][i] == turn && game[1][i] == turn && game[2][i] == turn)
            return true;
    }
    // verificação da diagonal principal
    if (game[0][0] == turn && game[1][1] == turn && game[2][2] == turn)
        return true;
    // verificação da diagonal secundária
    if (game[0][2] == turn && game[1][1] == turn && game[2][0] == turn)
        return true;
    return false;
}

void main() {
    char[][] game = new char[3][3];

    // Primeira impressão da matriz
    printGame(game);
    // Loop para input dos usuários (nº máximo de jogadas possíveis = 9)
    for (int i = 0; i < 9; i++) {
        char turn;
        if (i % 2 == 0) {
            turn = 'X';
            fillGame(game, askCoords(turn), turn);
        }
        else {
            turn = 'O';
            fillGame(game, askCoords(turn), turn);
        }

        if (checkWinner(game, turn)) {
            IO.println();
            printGame(game);
            IO.println(turn + " ganhou");
            return ;
        }
        else {
            IO.println();
            printGame(game);
        }
    }
}