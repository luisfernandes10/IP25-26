int[] naturals(Range r) {
    int[] nats = new int[r.length()];

    for (int i = 0; i < nats.length; i++)
        nats[i] = r.min() + i;
    return nats;
}

void main() {
    int[] nats = naturals(new Range(2, 8));
    IO.println(Arrays.toString(nats));
}