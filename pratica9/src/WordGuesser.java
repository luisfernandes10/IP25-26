class WordGuesser {
    private String word;
    private char[] guess;

    WordGuesser(String word) {
        this.word = word;
        guess = new char[word.length()];
    }

    void printGuess() {
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == 0)
                IO.print("_");
            else
                IO.print(guess[i]);
        }
        IO.println();
    }

    boolean checkWinner() {
        for (int i = 0; i < guess.length; i++)
            if (guess[i] == 0)
                return false;
        return true;
    }

    void fillPlay(char play) {
        for (int i = 0; i < guess.length; i++)
            if (play == word.charAt(i))
                guess[i] = play;
    }
}
