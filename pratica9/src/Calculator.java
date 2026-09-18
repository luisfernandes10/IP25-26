class Calculator {
    private double value = 0;
    private double back = 0;

    double value() {
        return Math.round(value * 1000.0 / 1000.0);
    }

    void sum(double n) {
        back = value;
        value += n;
    }

    void minus(double n) {
        back = value;
        value -= n;
    }

    void multiply(double n) {
        back = value;
        value *= n;
    }

    void split(double n) {
        back = value;
        value /= n;
    }

    void reset() {
        value = 0.0;
    }

    void undo() {
        value = back;
    }
}
