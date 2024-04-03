package lv0;

import java.util.Arrays;

public class _181867 {
    public int[] solution(String myString) {
        return Arrays.stream(myString.split("x", -1)).mapToInt(i -> i.length()).toArray();
    }
}
