package lv0;

import java.util.stream.IntStream;

public class _181901 {
    public int[] solution(int n, int k) {
        return  IntStream.rangeClosed(1, n).filter(value -> value % k == 0).sorted().toArray();
    }
}
