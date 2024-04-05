package lv0;

import java.util.stream.IntStream;

public class _181889 {
    public int[] solution(int[] num_list, int n) {
        return IntStream.rangeClosed(0, n - 1).map(i -> num_list[i]).toArray();
    }
}
