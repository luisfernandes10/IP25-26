class m6 {

    static void readMatrix() {
        int[][] m = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
        int sum = 0;
        for (int i = 0; i < m.length; i++) for (int j = 0; j < m[i].length; j++) sum += m[i][j];
    }

    static int longestLineLength(int[][] m) {
        int length = m[0].length;
        for (int i = 1; i < m.length; i++) {
            if (m[i].length > length)
                length = m[i].length;
        }
        return length;
    }

    static void createMatrix() {
        int[][] m = new int[2][3];
        int var = 1;
        for (int i = 0; i < m.length; i++) for (int j = 0; j < m[i].length; j++) {
            m[i][j] = var;
            var++;
        }
    }

    static int[][] squareMatrixNaturals(int n) {
        int var = 1;
        int[][] m = new int[n][n];
        for (int i = 0; i < m.length; i++) for (int j = 0; j < m[i].length; j++) {
            m[i][j] = var;
            var++;
        }
        return m;
    }

    static void toAbsMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) for (int j = 0; j < m[i].length; j++) m[i][j] = Math.abs(m[i][j]);
    }

    static int[] column(int[][] m, int colIndex) {
        int[] v = new int[m.length];
        for (int i = 0; i < v.length; i++) v[i] = m[i][colIndex];
        return v;
    }

    static int[][] transpose(int[][] m) {
        int[][] matrix = new int[m[0].length][m.length];
        for (int j = 0; j < m.length; j++) for (int i = 0; i < m[j].length; i++) matrix[i][j] = m[j][i];
        return matrix;
    }

    static int[][] identityMatrix(int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < m.length; i++) {
            m[i][i] = 1;
        }
        return m;
    }

    static int[][] sum(int[][] a, int[][] b) {
        int[][] m = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[i].length; j++) m[i][j] = a[i][j] + b[i][j];
        return m;
    }
}

class MatrixUtil {

    static boolean isRectangular(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) if (m[i].length != m[i + 1].length)
            return false;
        return true;
    }

    static boolean isSquare(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            if (m[i].length != m.length)
                return false;
        }
        return true;
    }

    static int totalElements(int[][] m) {
        int total = 0;
        for (int i = 0; i < m.length; i++) {
            total += m[i].length;
        }
        return total;
    }
}
