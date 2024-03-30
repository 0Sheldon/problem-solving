package lv0;

import java.util.stream.IntStream;

public class _120831 {
    public int solution(int m) {
        return IntStream.iterate(0,n -> n <= m, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .sum();
    }

    public static void main(String[] args) {
    }
}
