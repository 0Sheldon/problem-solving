package lv0;

import java.util.stream.IntStream;

public class _120583 {
    public int solution(int[] array, int n) {
        return (int) IntStream.of(array).filter(i -> i == n).count();
    }
}
