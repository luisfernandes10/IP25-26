class m4 {

    static void arrayRead() {
        int[] numbers = { 4, 3, 2, 1 };
        int sum = numbers[0];
        sum = sum + numbers[1];
        sum = sum + numbers[2];
        sum = sum + numbers[3];
    }

    static int sum(int[] array) {
        int i = 0;
        int sum = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        return sum;
    }

    static void arrayOfDigits() {
        int[] digits = new int[10];
        int i = 0;
        while (i < 10) {
            digits[i] = i;
            i++;
        }
    }

    static int[] naturals(int n) {
        assert n >= 0 : "argumento não pode ser negativo";
        int[] nats = new int[n];
        int i = 0;
        while (i < nats.length) {
            nats[i] = i + 1;
            i++;
        }
        return nats;
    }

    static boolean isOrdered(int[] list) {
        int i = 0;
        while (i < list.length - 1) {
            if (list[i] > list[i + 1])
                return false;
            i++;
        }
        return true;
    }

    static int[] inverted(int[] array) {
        int i = array.length - 1;
        int[] inverted = new int[i + 1];
        while (i >= 0) {
            inverted[array.length - i - 1] = array[i];
            i--;
        }
        return inverted;
    }

    static boolean contains(int[] array, int n) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == n)
                return true;
            i++;
        }
        return false;
    }

    static int count(int[] array, int n) {
        int i = 0;
        int count = 0;
        while (i < array.length) {
            if (array[i] == n)
                count++;
            i++;
        }
        return count;
    }

    static boolean areEqual(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        int i = 0;
        while (i < a.length) {
            if (a[i] != b[i])
                return false;
            i++;
        }
        return true;
    }

    static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        while (i < left.length) {
            merged[i] = left[i];
            i++;
        }
        while (j < right.length) {
            merged[i] = right[j];
            j++;
            i++;
        }
        return merged;
    }

    static boolean isPalindrome(char[] word) {
        int i = 0;
        while (word[word.length - i - 1] == word[i] && i < word.length / 2) {
            i++;
        }
        return i == word.length / 2;
    }

    static boolean alternatedBooleans(boolean[] list) {
        int i = 1;
        while (i < list.length) {
            if (list[i] == list[i - 1])
                return false;
            i++;
        }
        return true;
    }

    static boolean[] invertedBooleans(boolean[] list) {
        boolean[] newList = new boolean[list.length];
        int i = 0;
        while (i < list.length) {
            newList[i] = !list[i];
            i++;
        }
        return newList;
    }
}

class ArrayCopy {

    static int[] copyNewSize(int[] array, int size) {
        int[] copy = new int[size];
        int i = 0;
        while (i < size && i < array.length) {
            copy[i] = array[i];
            i++;
        }
        return copy;
    }

    static int[] copy(int[] array) {
        return copyNewSize(array, array.length);
    }
}

class randomArr {

    static int[] randomArray(int size) {
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            array[i] = (int) (Math.random() * 10);
            i++;
        }
        return array;
    }

    static int randomIndex(int[] array) {
        return (int) (Math.random() * array.length - 1);
    }

    static int randomElement(int[] array) {
        return array[randomIndex(array)];
    }
}

class doubleStats {

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
}

class Array {

    static int[] subArray(int[] array, int a, int b) {
        int[] newArray = new int[b - a + 1];
        int i = a;
        while (i <= b) {
            newArray[i - a] = array[i];
            i++;
        }
        return newArray;
    }

    static int[] leftSide(int[] array, boolean middle) {
        if (array.length % 2 == 0)
            return subArray(array, 0, array.length / 2 - 1);
        else
            return subArray(array, 0, array.length / 2 + 1 - 1);
    }

    static int[] rightSide(int[] array, boolean middle) {
        if (array.length % 2 == 0)
            return subArray(array, array.length / 2, array.length - 1);
        else {
            if (middle)
                return subArray(array, array.length / 2, array.length - 1);
            else
                return subArray(array, array.length / 2 + 1, array.length - 1);
        }
    }
}

class arrayUtil {

    static boolean isEmpty(int[] array) {
        return array.length == 0;
    }

    static int first(int[] array) {
        assert !isEmpty(array) : "Vetor não pode estar vazio";
        return array[0];
    }

    static int last(int[] array) {
        assert !isEmpty(array) : "Vetor não pode estar vazio";
        return array[array.length - 1];
    }

    static int nextIndex(int[] array, int index) {
        assert index < array.length && index >= 0 : "índice inválido";
        if (index == array.length - 1)
            return 0;
        else
            return index + 1;
    }

    static int prevIndex(int[] array, int index) {
        assert index < array.length && index >= 0 : "índice inválido";
        if (index == 0)
            return array.length - 1;
        else
            return index - 1;
    }

    static int element(int[] array, int index) {
        assert index >= -array.length && index < array.length;
        if (index >= 0)
            return array[index];
        else {
            return array[(array.length - 1) + index + 1];
        }
    }
}
