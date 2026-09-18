void main() {
    Counter c = new Counter(5);

    IO.println("Max - " + c.getMax());
    IO.println("Contador -> " + c.getCount());
    String s = IO.readln("> ");
    while (!s.equals("s")) {
        if (s.equals("+"))
            c.increment();
        else if (s.equals("-"))
            c.decrement();
        IO.println("Contador -> " + c.getCount());
        s = IO.readln("> ");
    }
}