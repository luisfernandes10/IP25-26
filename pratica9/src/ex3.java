void main() {
    WordGuesser w = new WordGuesser("teste");
    char play;

    while (!w.checkWinner()) {
        w.printGuess();
        play = IO.readln("> ").charAt(0);
        w.fillPlay(play);
    }
    w.printGuess();
    IO.println("Winner");
}