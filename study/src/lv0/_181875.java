package lv0;

import java.util.stream.IntStream;

public class _181875 {
    public String[] solution(String[] strArr) {
        return IntStream.rangeClosed(0, strArr.length-1).mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }
}
