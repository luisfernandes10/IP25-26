public class FuncInt {
    static Position findFirst(int[][] m, int n) {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] == n)
                    return new Position(i, j);
        return null;
    }
    static Position findLast(int[][] m, int n) {
        for (int i = m.length - 1; i >= 0; i--)
            for (int j = m[i].length - 1; j >= 0; j--)
                if (m[i][j] == n)
                    return new Position(i, j);
        return null;
    }
    static int count(int[][] m, int n) {
        int count = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] == n)
                    count++;
        return count;
    }
    static Position[] findAll(int[][] m, int n) {
        Position[] ps = new Position[count(m, n)];
        int ip = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] == n) {
                    ps[ip] = new Position(i, j);
                    ip++;
                }
        return ps;
    }
}
