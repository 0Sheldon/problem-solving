package lv0;

import java.util.Arrays;
import java.util.stream.Stream;

public class _120811 {
    public int solution(int[] array) {
        int[] sortedArr = Arrays.stream(array).sorted().toArray();
        return sortedArr[array.length / 2];
    }
}
