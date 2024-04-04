package lv0;

import java.util.stream.IntStream;

public class _181887 {
    public int solution(int[] num_list) {
        int oddSum = IntStream.iterate(0, i -> i < num_list.length, i -> i + 2).map(i -> num_list[i]).sum();
        int evenSum = IntStream.iterate(1, i -> i < num_list.length, i -> i + 2).map(i -> num_list[i]).sum();
        return Math.max(oddSum, evenSum);
    }
}
