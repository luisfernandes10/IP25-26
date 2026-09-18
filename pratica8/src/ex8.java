void main() {
    double[] v = {3.2, 1.2, 4.3, 2.9};
    IO.println(Arrays.toString(DoubleStats.filter(v, new Interval(2.0, 4.0))));
}