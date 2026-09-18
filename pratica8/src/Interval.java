record Interval(double min, double max) {
    boolean contains(double n) {
        return n >= this.min && n <= this.max;
    }
}