package lv0;

import java.util.Arrays;

public class _181888 {
    public int[] solution(int[] num_list, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num_list.length; i +=n) {
            sb.append(num_list[i]);
        }
        return Arrays.stream(sb.toString().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
