package lv0;

public class _181938 {
    public int solution(int a, int b) {
        int op = Integer.parseInt("" + a + b);
        int twoAB = 2 * a * b;
        return Math.max(op, twoAB);
    }
}
