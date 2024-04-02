package lv0;

import java.util.stream.IntStream;

public class _181835 {
    public int[] solution(int[] arr, int k) {
        if(k % 2 == 0) {
            return IntStream.of(arr).map(value -> value + k).toArray();
        } else {
            return IntStream.of(arr).map(value -> value * k).toArray();
        }
    }
}
