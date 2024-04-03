package lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _181873 {
    public String solution(String my_string, String alp) {
        return Arrays.stream(my_string.split("")).map(i -> i.equals(alp) ? i.toUpperCase() : i).collect(Collectors.joining());
    }
}
