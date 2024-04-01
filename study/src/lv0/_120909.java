package lv0;

public class _120909 {
    public int solution(int n) {
        int i = 2;
        while(i * i <= n) {
            if(i * i == n) return 1;
            i++;
        }
        return 2;
    }
}
