void main() {
    int countElements = 0;
    double gather;
    double sum = 0;

    gather = Double.parseDouble(IO.readln());
    while (gather != 0.0) {
        countElements++;
        sum += gather;
        gather = Double.parseDouble(IO.readln());
    }
    IO.println("total: " + (countElements));

    IO.println("média: " + (sum / countElements));
}