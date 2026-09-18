class m5 {

    static void incrementation() {
        int i = 1;
        i++;
        i++;
        i++;
    }

    static void cumulativeAssign() {
        int n = 1;
        n += 2;
        n += 3;
        n += 4;
    }

    static void whileToFor() {
        int s = 0;
        for (int i = 1; i <= 5; i++) s += i;
    }

    static void doubleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    static int[] createDoubleArray(int[] array) {
        int[] vetor = new int[array.length];
        for (int i = 0; i < array.length; i++) vetor[i] = array[i] * 2;
        return vetor;
    }

    static void invertValues(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = !array[i];
        }
    }

    static void scaleArray(double[] array, double fator) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= fator;
        }
    }

    static void replace(char[] letters, char find, char replace) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == find)
                letters[i] = replace;
        }
    }

    static void replaceFirst(char[] letters, char find, char replace) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == find) {
                letters[i] = replace;
                return;
            }
        }
    }

    static void replaceLast(char[] letters, char find, char replace) {
        for (int i = letters.length - 1; i >= 0; i--) {
            if (letters[i] == find) {
                letters[i] = replace;
                return;
            }
        }
    }

    static void constrain(double[] array, double min, double max) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min)
                array[i] = min;
            else if (array[i] >= max)
                array[i] = max;
        }
    }
}

class ArrayOrder {

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) swap(array, i, array.length - i - 1);
    }
}

class Shuffleop {

    static void randomSwap(int[] array) {
        int random1 = RandomInts.randomUntil(array.length);
        int random2 = RandomInts.randomUntil(array.length);
        if (random1 == random2)
            random2 = RandomInts.randomUntil(array.length);
        ArrayOrder.swap(array, random1, random2);
    }

    static void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int raffle = RandomInts.randomUntil(i);
            if (raffle != i)
                ArrayOrder.swap(array, 0, raffle);
        }
    }
}

class Shift {

    static void shiftLeft(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
    }

    static void shiftRight(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }
}

class bubbleSort {

    static void sort(int[] array) {
        for (int wall = array.length - 1; wall > 0; wall--) {
            for (int j = 0; j < wall; j++) {
                if (array[j] > array[j + 1])
                    ArrayOrder.swap(array, j, j + 1);
            }
        }
    }
}
