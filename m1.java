class m1 {

    int next(int n) {
        return n + 1;
    }

    int previous(int n) {
        return n - 1;
    }

    double doubleOf(double n) {
        return n * 2;
    }

    int square(int n) {
        return n * n;
    }

    int difference(int a, int b) {
        return a - b;
    }

    double average(double a, double b) {
        return (a + b) / 2.0;
    }

    double average(int a, int b) {
        return (double) (a + b) / 2;
    }

    int round(double n) {
        n = n + 0.5;
        return (int) n;
    }

    boolean isNegative(int x) {
        return x < 0;
    }

    boolean isDigit(int n) {
        return n >= 0 && n <= 9;
    }

    boolean isEven(int n) {
        return n % 2 == 0;
    }

    boolean isOdd(int n) {
        return n % 2 != 0;
    }

    double abs(double n) {
        return n >= 0 ? n : -n;
    }

    double min(double a, double b) {
        return a < b ? a : b;
    }

    int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    double abs(double n) {
        if (n >= 0)
            return n;
        else
            return -n;
    }

    int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    int irsGroup(int salary) {
        if (salary >= 0 && salary < 10000)
            return 1;
        else if (salary >= 10000 && salary <= 25500)
            return 2;
        else if (salary > 25500 && salary <= 48500)
            return 3;
        else if (salary > 48500)
            return 4;
        return 0;
    }

    double irsTax(int tier) {
        if (tier >= 1 && tier <= 4) {
            if (tier == 1)
                return 0.12;
            else if (tier == 2)
                return 0.18;
            else if (tier == 3)
                return 0.23;
            else
                return 0.29;
        }
        return 0.0;
    }

    int sumNaturals(int n) {
        return (n * (n + 1)) / 2;
    }

    boolean isVowel(char c) {
        if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117)
            return true;
        else
            return false;
    }

    boolean inOrder(int a, int b, int c) {
        return (a < b && a < c && b < c);
    }

    boolean isIncluded(int n, int min, int max) {
        return (n >= min && n <= max);
    }

    boolean isExcluded(int n, int min, int max) {
        return (n < min || n > max);
    }

    boolean xor(boolean a, boolean b) {
        if (a == true && b == true)
            return false;
        else if (a == true && b == false)
            return true;
        else if (a == false && b == true)
            return true;
        else if (a == false && b == false)
            return false;
        return false;
    }

    boolean sameSign(int a, int b) {
        if (a == 0 || b == 0)
            return false;
        else {
            if (a > 0 && b > 0 || a < 0 && b < 0)
                return true;
            else
                return false;
        }
    }

    boolean onlyOnePositive(int a, int b) {
        if (a > 0 && b < 0 || a < 0 && b > 0)
            return true;
        else
            return false;
    }
}

class IrsUtil {

    static double irsTax(int tier) {
        if (tier >= 1 && tier <= 4) {
            if (tier == 1)
                return 0.12;
            else if (tier == 2)
                return 0.18;
            else if (tier == 3)
                return 0.23;
            else
                return 0.29;
        }
        return 0.0;
    }

    static int irsGroup(int salary) {
        if (salary >= 0 && salary < 10000)
            return 1;
        else if (salary >= 10000 && salary <= 25500)
            return 2;
        else if (salary > 25500 && salary <= 48500)
            return 3;
        else if (salary > 48500)
            return 4;
        return 0;
    }
}
