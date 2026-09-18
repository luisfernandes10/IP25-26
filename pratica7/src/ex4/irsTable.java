import ex3.IrsUtil;

void main() {
    IO.println("Tabela de escalões IRS");
    int min = Integer.parseInt(IO.readln("Primeiro escalão: "));
    int max = Integer.parseInt(IO.readln("Último escalão: "));
    IO.print("\n");
    for (int i = 1; i <= max; i++) {
        IO.println(i + " | " + (IrsUtil.irsTax(i) * 100) + "%");
        IO.println("----------");
    }
}