package lv0;

import java.util.Arrays;
import java.util.Comparator;

public class _120847 {
    public int solution(int[] numbers) {
        Integer[] array = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Comparator.reverseOrder());
        return array[0] * array[1];
    }
}
