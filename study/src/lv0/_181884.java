package lv0;

public class _181884 {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        for(int value : numbers) {
            sum += value;
            if(sum > n) break;
        }
        return sum;
    }
}
