package lv0;

import java.util.stream.IntStream;

public class _181892 {
    public int[] solution(int[] num_list, int n) {
        return IntStream.iterate(n - 1, i -> i < num_list.length, i -> i + 1).map(i -> num_list[i]).toArray();
    }
}
