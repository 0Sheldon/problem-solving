package lv0;

import java.util.Arrays;

public class _181879 {
    public int solution(int[] num_list) {
        if(num_list.length > 10) {
            return Arrays.stream(num_list).reduce((a, b) -> a + b).getAsInt();
        } else {
            return Arrays.stream(num_list).reduce((a, b) -> a * b).getAsInt();
        }
    }
}
