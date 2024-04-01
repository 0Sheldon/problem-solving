package lv0;

public class _120830 {
    public int solution(int n, int k) {
        int lambPrice = n * 12000;
        int beverageNum = k - n/10;
        int beveragePrice = beverageNum * 2000;
        return lambPrice + beveragePrice;
    }
}
