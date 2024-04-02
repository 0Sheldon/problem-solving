package lv0;

import java.util.stream.IntStream;

public class _120905 {
    public int[] solution(int n, int[] numlist) {
        return IntStream.of(numlist).filter(value -> value % n == 0).toArray();
    }
}
