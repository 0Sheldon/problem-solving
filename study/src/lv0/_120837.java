package lv0;

public class _120837 {
    public int solution(int hp) {
        int sum = 0;
        int giant = hp / 5;
        hp %= 5;
        int warAnt = hp / 3;
        int scv = hp % 3;
        sum = giant + warAnt + scv;
        return sum;
    }
}
