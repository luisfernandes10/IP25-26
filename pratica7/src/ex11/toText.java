String toText(int[] array, String separator) {
    String s = "";
    s = s + (char) (array[0] + '0');
    for (int i = 1; i < array.length; i++)
        s = s + separator + (char) (array[i] + '0');
    return s;
}

void main() {
    int[] p = {1, 2, 3};
    IO.println(toText(p, ", "));
}