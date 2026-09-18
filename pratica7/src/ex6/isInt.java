public static boolean isInt(String s) {
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c < '0' || c > '9')
            return false;
    }
    return true;
}

void main() {
    IO.println(isInt("a22"));
}