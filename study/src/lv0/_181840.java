package lv0;

import java.util.Arrays;

public class _181840 {
    public int solution(int[] num_list, int n) {
        return (int)Arrays.stream(num_list).sorted().distinct().filter(i -> i == n).count();
    }
}
