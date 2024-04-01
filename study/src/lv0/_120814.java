package lv0;

public class _120814 {
    public int solution(int n) {
        int pizza = n / 7;
        int remain = n % 7;
        if(remain != 0) {
            pizza++;
        }
        return pizza;
    }
}
