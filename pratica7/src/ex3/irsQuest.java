import ex3.IrsUtil;

void main() {
    int salary = Integer.parseInt(IO.readln("Salário anual? "));
    int group = IrsUtil.irsGroup(salary);
    IO.println("Escalão: " + group);
    IO.println("Taxa: " + ((IrsUtil.irsTax(group) * 100)) + "%");
}