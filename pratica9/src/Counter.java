class Counter {
    private int value = 0;
    private int max;

    Counter(int max) {
        this.max = max;
    }

    void increment() {
        if (value < max)
            value++;
    }

    void decrement() {
        if (value > 0)
            value--;
    }

    int getMax() {
        return max;
    }

    int getCount() {
        return value;
    }
}
