package lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _181882 {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).map((value) -> {
            if (value >= 50 && value % 2 == 0) {
                value = value / 2;
            } else if (value < 50 && value % 2 != 0) {
                value = value * 2;
            }
            return value;
        }).toArray();

    }
}
