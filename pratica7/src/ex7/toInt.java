boolean isInt(String s) {
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c < '0' || c > '9')
            return false;
    }
    return true;
}

int toInt(String s) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        int aux = c - '0';
        result = (result * 10) + aux;
    }
    return result;
}

void main() {
    String s = "145";
    assert isInt(s);

    IO.println(toInt(s));
}