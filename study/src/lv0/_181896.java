package lv0;

import java.util.stream.IntStream;

public class _181896 {
    public int solution(int[] num_list) {
        int count = 0;
        for(int value : num_list) {
            if (value < 0) {
                break;
            }
            count++;
        }
        return count == num_list.length ? -1 : count;
    }
}
