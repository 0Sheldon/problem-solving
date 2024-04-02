package lv0;

public class _120903 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String string2 : s2) {
            for(String string1 : s1) {
                if (string2.equals(string1)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
