package lv0;

import java.util.Arrays;
import java.util.stream.Stream;

public class _120851 {
    public int solution(String my_string) {
        String numbers = my_string.replaceAll("[^0-9]", "");
        String[] splitedNumber = numbers.split("");
        return Arrays.stream(splitedNumber).mapToInt(Integer::parseInt).sum();
    }
}
