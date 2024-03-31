package lv0;

public class _120819 {
    public int[] solution(int money) {
        int americanoPrice = 5_500;
        int americano = money / americanoPrice;
        int remain = money % americanoPrice;
        int[] answer = {americano, remain};
        return answer;
    }
}
