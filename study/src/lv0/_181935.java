package lv0;

import java.util.stream.IntStream;

public class _181935 {
    public int solution(int n) {
        if(n % 2 == 0) {
            return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).map(i -> i * i).sum();
        } else {
            return IntStream.rangeClosed(0, n).filter(i -> i % 2 != 0).sum();
        }
    }
}
