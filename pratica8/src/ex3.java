String cut(String s, Range r) {
    return s.substring(0, r.min()) + s.substring(r.max() + 1);
}

void main() {
    IO.println(cut("um dó li tá", new Range(2, 4)));
}