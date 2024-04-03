package lv0;

import java.util.Arrays;

public class _181849 {
    public int solution(String num_str) {
        return Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).sum();
    }
}
