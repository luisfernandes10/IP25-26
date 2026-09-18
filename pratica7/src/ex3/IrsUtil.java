package ex3;

public class IrsUtil {
    public static double irsTax(int tier) {
        if (tier >= 1 && tier <= 4)
        {
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

    public static int irsGroup(int salary) {
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
