int countWord(String[] words, String find) {
    int count = 0;
    for (int i = 0; i < words.length; i++)
        if (words[i].equals(find))
            count++;
    return count;
}

void main() {
    String[] ss = {"word", "word", "um", "dois"};
    IO.println(countWord(ss, "tres"));
}