package lv0;

public class _120817 {
    public double solution(int[] numbers) {
        double count = numbers.length;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / count;
    }
}
