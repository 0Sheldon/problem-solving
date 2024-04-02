package lv0;

public class _181939 {
    public int solution(int a, int b) {
        String aOpB = a + "" + b;
        String bOpA = b + "" + a;
        int aop = Integer.parseInt(aOpB);
        int bop = Integer.parseInt(bOpA);
        return Math.max(aop, bop);
    }
}
