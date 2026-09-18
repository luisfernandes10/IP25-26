void main() {
    String[] shuffle = {"cara!", "coroa!"};
    for (int i = 0; i < 10; i++)
        IO.println("Cara ou coroa? " + shuffle[(int) (Math.random() * 2)]);
}