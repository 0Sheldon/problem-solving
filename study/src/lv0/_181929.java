package lv0;

import java.util.stream.IntStream;

public class _181929 {
    public int solution(int[] num_list) {
        int sum = IntStream.of(num_list).sum();
        int valueX = 1;
        for(int value : num_list) {
            valueX *= value;
        }
        return valueX > sum * sum ? 0 : 1;
    }
}
