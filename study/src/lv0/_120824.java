package lv0;

import java.util.Arrays;

public class _120824 {
    public int[] solution(int[] num_list) {
        int even = (int)Arrays.stream(num_list).filter(n -> n % 2 == 0).count();
        int odd = (int)Arrays.stream(num_list).filter(n -> n % 2 != 0).count();
        int[] answer = {even, odd};
        return answer;
    }
}
