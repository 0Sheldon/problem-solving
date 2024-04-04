package lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _181861 {
    public int[] solution(int[] arr) {
        int[][] results = new int[arr.length][];
        int index=0;
        for(int value : arr) {
            results[index] = IntStream.rangeClosed(1, value).map(i -> value).toArray();
            index++;
        }
        return Arrays.stream(results).flatMapToInt(value -> Arrays.stream(value)).toArray();
    }
}
