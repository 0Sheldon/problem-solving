package lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _120585 {
    public int solution(int[] array, int height) {
        return (int)IntStream.of(array).filter(n -> n > height).count();
    }
}
