void main() {
    int[][] m = {{1, 2, 3}, {4, 5, 3}, {3, 8, 9}};
    IO.println(FuncInt.findFirst(m, 3));
    IO.println(FuncInt.findLast(m, 3));
    IO.println("O 3 aparece " + FuncInt.count(m, 3) + " vezes");
    IO.println(Arrays.toString(FuncInt.findAll(m, 3)));
}