package lv0;

public class _120910 {
    public int solution(int n, int t) {
        int answer = n;
        for(int i=0; i<t; i++) {
            answer *=2;
        }
        return answer;
    }
}
