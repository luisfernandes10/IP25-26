class m2 {

    static void varAssignDiv() {
        int v = 2024;
        v = v / 10;
        v = v / 10;
        v = v / 10;
    }

    static int firstDigit(int n) {
        int aux = n;
        while (aux > 10) {
            aux = aux / 10;
        }
        return aux;
    }

    static int lastDigit(int n) {
        return n % 10;
    }

    static void naturalsIterator() {
        int i = 1;
        while (i < 5) {
            i = i + 1;
        }
    }

    static int sumNaturals(int max) {
        int i = 1;
        int sum = 0;
        while (i <= max) {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    static int intervalLength(int min, int max) {
        assert min >= 0;
        assert max >= 0;
        return max - min + 1;
    }

    static int multiplyDigits(int n) {
        if (n == 0)
            return 0;
        else {
            int temp = 0;
            int aux = n;
            int multiply = 1;
            while (aux > 0) {
                temp = aux % 10;
                multiply = multiply * temp;
                aux = aux / 10;
            }
            return multiply;
        }
    }

    static void reverseIteration() {
        int x = 5;
        while (x > 0) {
            x--;
        }
    }

    static int factorial(int n) {
        int i = n;
        int fact = 1;
        while (n > 0) {
            fact = n * fact;
            n--;
        }
        return fact;
    }

    static int powerOfTwo(int e) {
        assert e >= 0;
        int i = 0;
        int multiply = 1;
        while (i < e) {
            multiply = multiply * 2;
            i++;
        }
        return multiply;
    }

    static boolean isMultiple(int a, int b) {
        int multiple = 0;
        while (multiple < a) {
            multiple = multiple + b;
        }
        return multiple == a;
    }

    static int intDivision(int dividend, int divisor) {
        int quocient = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quocient++;
        }
        return quocient;
    }

    static void iterationStepTwo() {
        int p = 2;
        while (p < 10) {
            p = p + 2;
        }
    }

    static int sumEvenBetween(int min, int max) {
        int total = 0;
        int i = min;
        while (i <= max) {
            if (i % 2 == 0)
                total = total + i;
            i++;
        }
        return total;
    }

    static boolean containsZero(int n) {
        if (n == 0)
            return true;
        int aux = n;
        while (aux > 0) {
            if (aux % 10 == 0)
                return true;
            aux = aux / 10;
        }
        return false;
    }

    static int countDigit(int n, int d) {
        int aux = n;
        int count = 0;
        while (aux > 0) {
            if (aux % 10 == d)
                count++;
            aux = aux / 10;
        }
        return count;
    }

    static boolean existsDigit(int n, int d) {
        int aux = n;
        while (aux > 0) {
            if (aux % 10 == d)
                return true;
            aux = aux / 10;
        }
        return false;
    }

    static char nextLetter(char c) {
        if (c == 'z')
            return 'a';
        return (char) (c + 1);
    }

    static int gcd(int a, int b) {
        int temp = 0;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int invert(int n) {
        int aux = n;
        int temp = aux % 10;
        int result = aux % 10;
        aux = aux / 10;
        while (aux > 0) {
            temp = aux % 10;
            result = (result * 10) + temp;
            aux = aux / 10;
        }
        return result;
    }

    static int fib(int n) {
        int i = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        while (i < n) {
            a = b;
            b = c;
            c = a + b;
            i++;
        }
        return c;
    }
}
