int countLines(String s) {
    int count = s.isEmpty() ? 0 : 1;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == '\n')
            count++;
    }
    return count;
}

void main() {
    IO.println(countLines("um,\nedois\ne três"));
}