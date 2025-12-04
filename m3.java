class m3 {

    static double absDiff(double a, double b) {
        return Math.abs(a - b);
    }

    static int gradeRound(int grade) {
        return (int) Math.round((double) grade / 5);
    }

    static int flipCoin(int a, int b) {
        double r = Math.random();
        r = r * 10;
        if ((int) r % 2 == 0)
            return a;
        else
            return b;
    }

    static char randomVowel() {
        double r = Math.random();
        r = Math.round(r * 10);
        if (r == 0 || r == 9)
            return 'a';
        else if (r == 1 || r == 8)
            return 'e';
        else if (r == 2 || r == 7)
            return 'i';
        else if (r == 3 || r == 6)
            return 'o';
        else
            return 'u';
    }

    static boolean isBetween(int n, int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return (n > min && n < max);
    }

    static boolean isPerfectSquare(int n) {
        return n == Math.floor(Math.sqrt(n) * Math.sqrt(n));
    }

    static int firstDigit(int n) {
        if (n < 10) {
            return n;
        } else
            return firstDigit(n / 10);
    }

    static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    static int gcdRec(int a, int b) {
        if (b == 0)
            return a;
        else {
            return gcdRec(b, a % b);
        }
    }

    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}

class EvenOdd {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isOdd(int n) {
        return !isEven(n);
    }
}

class MathUtil {

    static double floor(double d) {
        return (int) d;
    }

    static double decimalPart(double d) {
        return d - floor(d);
    }
}

class IrsHelper {

    static double irsTaxByIncome(int income) {
        int group = IrsUtil.irsGroup(income);
        return IrsUtil.irsTax(group);
    }

    static int groupByTax(double tax) {
        int i = 1;
        while (i <= 4) {
            if (IrsUtil.irsTax(i) == tax)
                return i;
            i++;
        }
        return 0;
    }
}

class RandomInts {

    static int random() {
        return (int) (Math.random() * 1000000);
    }

    static int randomUntil(int max) {
        return (int) (Math.random() * max);
    }

    static int randomWithin(int min, int max) {
        return (int) ((Math.random() * (max - min) + min));
    }
}

class Divisors {

    static int countDivisors(int n) {
        int i = 1;
        int count = 0;
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    static int sumProperDivisors(int n) {
        int i = 1;
        int result = 0;
        while (i < n) {
            if (n % i == 0) {
                result = result + i;
            }
            i++;
        }
        return result;
    }

    static boolean isPrime(int n) {
        return countDivisors(n) == 2;
    }
}

class primeNumbers {

    static int countPrimes(int n) {
        int i = 0;
        int count = 0;
        while (i <= n) {
            if (Divisors.isPrime(i) == true)
                count++;
            i++;
        }
        return count;
    }

    static boolean existsPrimeBetween(int a, int b) {
        int i = a + 1;
        while (i < b) {
            if (Divisors.isPrime(i) == true) {
                return true;
            }
            i++;
        }
        return false;
    }
}

class PerfectNumbers {

    static boolean isPerfect(int n) {
        return Divisors.sumProperDivisors(n) == n;
    }

    static int countPerfectNumbers(int n) {
        int i = 1;
        int count = 0;
        while (i < n) {
            if (isPerfect(i) == true)
                count++;
            i++;
        }
        return count;
    }
}

class LargerPrimeDiff {

    static int largestPrimeDiff(int n) {
        int i = 1;
        int prime = 1;
        int diff = 0;
        while (i < n) {
            if (Divisors.isPrime(i)) {
                if ((i - prime) > diff)
                    diff = i - prime;
                prime = i;
            }
            i++;
        }
        return diff;
    }
}
