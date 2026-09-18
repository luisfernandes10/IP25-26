void main() {
    TicTacToe game = new TicTacToe();

    game.printGrid();
    while (game.checkWinner() == false) {
        game.play(IO.readln("> "));
        game.printGrid();
    }
    IO.println("Winner");
}