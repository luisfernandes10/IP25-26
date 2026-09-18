void printGame(char[][] game) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            IO.print(game[i][j]);
            IO.print(" | ");
        }
        IO.println("\n-----------");
    }
}

Position askCoords(char turn, char[][] game) {
    int[] play = new int[2];

    IO.println("4. Anular jogada");
    play[0] = Integer.parseInt(IO.readln(turn + " linha: "));
    if (play[0] == 4)
        return new Position(-1, -1);
    play[1] = Integer.parseInt(IO.readln(turn + " coluna: "));

    while (game[play[0]][play[1]] != 0) {
        IO.println("Jogada em casa preenchida!");
        play[0] = Integer.parseInt(IO.readln(turn + " linha: "));
        play[1] = Integer.parseInt(IO.readln(turn + " coluna: "));
    }
    return new Position(play[0], play[1]);
}

void fillGame(char[][] game, Position c, char turn) {
    game[c.x()][c.y()] = turn;
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
    Position[] plays = new Position[9];

    // Primeira impressão da matriz
    printGame(game);
    // Loop para input dos usuários (nº máximo de jogadas possíveis = 9)
    for (int i = 0; i < 9; i++) {
        char turn;
        if (i % 2 == 0)
            turn = 'X';
        else
            turn = 'O';

        IO.println("Jogada " + i + " - Turno " + turn);

        plays[i] = askCoords(turn, game);
        while (plays[i].x() == -1) {
            if (i == 0) {
                IO.println("Não é possível voltar a jogada.");
                i--;
            }
            else {
                game[plays[i - 1].x()][plays[i - 1].y()] = 0;
                IO.println("Jogada desfeita!");
                i -= 2;
            }
            continue;
        }
        fillGame(game, plays[i], turn);

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
    IO.println("Empate!!!");
}