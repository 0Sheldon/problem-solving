package lv0;

public class _120816 {
    public int solution(int slice, int n) {
        int pizza = n / slice;
        int remain = n % slice;
        if(remain != 0) {
            pizza++;
        }
        return pizza;
    }
}
