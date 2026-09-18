Range findFirst(String f, String s) {
    return new Range(s.indexOf(f), s.indexOf(f) + f.length() - 1);
}

void main() {
    Range f = findFirst("nada", "só sei que nada sei");
    IO.println(f);
}