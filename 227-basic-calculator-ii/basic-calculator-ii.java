class Solution {
    public int calculate(String s) {
        int ans = 0, prevNum = 0, currNum = 0;
        char op = '+';
        s = s + "+";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currNum = currNum * 10 + (c - '0');
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (op == '+') {
                    ans += prevNum;
                    prevNum = currNum;
                } else if (op == '-') {
                    ans += prevNum;
                    prevNum = -currNum;
                } else if (op == '*') {
                    prevNum *= currNum;
                } else if (op == '/') {
                    prevNum /= currNum;
                }
                op = c;
                currNum = 0;
            }
        }
        return ans + prevNum;
    }
}
