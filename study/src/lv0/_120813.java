package lv0;

import java.util.stream.IntStream;

public class _120813 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).sorted().toArray();
    }
}
