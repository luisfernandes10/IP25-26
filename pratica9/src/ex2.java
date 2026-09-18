void main() {
    Calculator c = new Calculator();

    IO.println("| " + c.value() + " |");
    String s = IO.readln("> ");
    while (!s.equals("s")) {
        if (s.charAt(0) == '+')
            c.sum(Double.parseDouble(s.substring(1)));
        else if (s.charAt(0) == '-')
            c.minus(Double.parseDouble(s.substring(1)));
        else if (s.charAt(0) == '*')
            c.multiply(Double.parseDouble(s.substring(1)));
        else if (s.charAt(0) == '/')
            c.split(Double.parseDouble(s.substring(1)));
        else if (s.charAt(0) == 'c')
            c.reset();
        else if (s.charAt(0) == 'u')
            c.undo();
        IO.println("| " + c.value() + " |");
        s = IO.readln("> ");
    }
}