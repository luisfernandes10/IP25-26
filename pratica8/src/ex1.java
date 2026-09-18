void print(Range r) {
    for (int i = r.min(); i <= r.max(); i++)
        IO.print(i + " ");
    IO.println();
}

void printReverse(Range r) {
    for (int i = r.max(); i >= r.min(); i--)
        IO.print(i + " ");
    IO.println();
}

void main() {
    Range r = new Range(5, 10);
    print(r);
    printReverse(r);
}