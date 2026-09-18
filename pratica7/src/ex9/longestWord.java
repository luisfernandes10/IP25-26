String longestWord(String[] words) {
    int indexLongest = 0;
    for (int i = 1; i < words.length; i++)
        if (words[i].length() > words[indexLongest].length())
            indexLongest = i;
    return words[indexLongest];
}

void main() {
    String[] ss = {"quatro", "zero", "um"};
    IO.println(longestWord(ss));
}