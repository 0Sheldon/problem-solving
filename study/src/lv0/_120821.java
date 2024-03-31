package lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _120821 {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];
        for(int i=num_list.length-1, j=0; i>=0; i--, j++) {
            result[j] = num_list[i];
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
