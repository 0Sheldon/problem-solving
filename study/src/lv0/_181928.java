package lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _181928 {
    public int solution(int[] num_list) {
        String evenNum = Arrays.stream(num_list).filter(i -> i % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining());
        String oddNum = Arrays.stream(num_list).filter(i -> i % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining());
        return Integer.parseInt(evenNum) + Integer.parseInt(oddNum);
    }
}
