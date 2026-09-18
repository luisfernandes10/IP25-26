class DoubleStats {
    static double min(double[] array) {
        int i = 1;
        double min = array[0];
        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }
        return min;
    }
    static double max(double[] array) {
        int i = 1;
        double max = array[0];
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }
        return max;
    }
    static double sum(double[] array) {
        int i = 0;
        double sum = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        return sum;
    }
    static double average(double[] array) {
        return (sum(array) / array.length);
    }
    static Interval valueRange(double[] v) {
        return new Interval(min(v), max(v));
    }
    static int count(double[] v, Interval in) {
        int count = 0;
        for (int i = 0; i < v.length; i++)
            if (in.contains(v[i]))
                count++;
        return count;
    }
    static double[] filter(double[] v, Interval in) {
        double[] array = new double[count(v, in)];
        int j = 0;
        for (int i = 0; i < v.length; i++)
            if (in.contains(v[i])) {
                array[j] = v[i];
                j++;
            }
        return array;
    }
}